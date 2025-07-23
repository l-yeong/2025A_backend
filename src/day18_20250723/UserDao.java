package day18_20250723;

import java.sql.*;

public class UserDao {
    //(*) 싱글톤: 주로 프로그램내 하나(싱글)의 객체(톤) 표현
        // -> 주로 MVC패턴에서 싱글톤 사용하는 레이어/계층: view/controller/dao
            // 왜? 기능은 하나만 있어도 재사용 가능하니까. 즉] 메소드 위주,
        // -> DTO에서는 싱글톤 사용하지 않는다.
            // 왜? 데이터(회원)1개만 존재 하지 않는다.    즉] 멤버변수 위주,
    private UserDao(){Connect();} //Connect 메소드 대입
    private static final UserDao userDao = new UserDao();
    public static UserDao getUserDao(){
        return userDao;
    }

    //관례적 MVC 패턴에서의 (협업) 용어
    //D: DATA   데이터 (데이터베이스/DB)
    //A: ACCESS 접근
    //O: OBJECT 객체
    //(1) 데이터베이스 연동 코드(함수)

    private String db_url="jdbc:mysql://localhost:3306/mydb0723";   //연동할 DB서버의 주소
    private String db_user="root";                                  //DB서버의 계정명
    private String db_pwd="1234";                                   //DB서버의 비밀번호
    private Connection conn;


    public void Connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//1. MYSQL 드라이버/클래스 불러오기
            conn= DriverManager.getConnection(db_url,db_user,db_pwd);//2. MYSQL DB서버/연동

        } catch (ClassNotFoundException e) {System.out.println("[경고]MYSQL 라이브러리 로드 실패");
        } catch (SQLException e) {System.out.println("[경고]MYSQL 데이터베이스 연동 실패");}//try,catch end
    } //connect end

    //(2)연동 성공 이후에 사용할 DML(테이블 조작) 하기
    //1)User 테이블에 insert 해보기
    public boolean userInsert(){
        try {

            //1. SQL작성 - String sql="SQL문법";
            String sql="insert test(uname,uage) values('유재석',40);";
            //2. SQL기재 - PreparedStatement ps = conn.prepareStatement(sql);
            PreparedStatement ps = conn.prepareStatement(sql);
            //3. SQL실행 - int count = ps.executeUpdate();
            int count = ps.executeUpdate();
            //4. SQL결과 에 따른 확인/로직/리턴
            System.out.println(count);
            if(count>=1) return true;//성공
            else return true; //실패
        } catch (Exception e) {System.out.println(e);}//try,catch end
        return false; //실패
    }//userInsert end

    //2) USER테이블에 INSERT 해보기2: 매개변수 사용
    public boolean userInsert2(String uname,int age) {
        try {
            //1. SQL작성
            String sql = "insert into test(uname,uage) values(?,?);";
            //2. SQL기재
            PreparedStatement ps = conn.prepareStatement(sql);
            //3 SQL 매개변수 대입하기 . set:저장, get:호출
            //setter/getter: 객체내 private 멤버변수 저장/호출 함수/메소드
            //ps.setXXX(?번호, 값): XXX 타입으로 ?번째에 값 대입
            ps.setString(1,uname);
            //SQL 문법내 첫번째 ? 에 uname 변수값을 String 타입으로 대입 한다
            ps.setInt(2,age);
            //SQL 문법내 두번째 ? 에 uage 변수값을 int 타입으로 대입 한다

            //4. SQL실행
            int count = ps.executeUpdate();
            //5. SQL결과
            if(count >=1) return true;
            return false;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }// userInsert2 end

    //3)USER테이블에 select 해보기
    public void UserSelect(){
        try {
            //1. SQL작성
            String sql = "select *from test";
            //2. SQL기재
            PreparedStatement ps = conn.prepareStatement(sql);
            //3. SQL매개변수 대입<없으면 생략>
            //4. SQL실행
            // insert/update/delete -> 레코드 처리 개수(int) -> executeUpdate()
            // select -> 레코드 조회 (결과)테이블 -> executeQuery();
            ResultSet rs = ps.executeQuery();
            // ResultSet 조회결과 조작 인터페이스, import주의, java,sql
                //rs.next(): 조회결과 에서 레코드/행/가로 하나씩 조회/이동 함수
                //rs.getXXX (가져올속성명 또는 순서번호); : 현재 레코드의 속성/열/컬럼 의 값 반환
            //5. SQL결과에 따른 로직/리턴/확인
            while (rs.next()) { // --다음 레코드가 존재 하지 않을때 까지 반복
                // (1) 현재 순회/반복 중인 레코드의 열/속성/컬럼 값 반환
                System.out.printf("번호: %d, 이름:%s , 나이:%d \n",
                        rs.getInt(1),   // 첫번째 열/속성/컬럼의 값 반환
                        rs.getString(2),// 두번째 열의 의 값 반환
                        rs.getInt(3));  // 세번째 열의 값 반환
                // (2) 현재 순회/반복 중인 레코드의 열/속성/컬럼 값을 DTO로 구성
                // CSV/데이터베이스 : 테이블 처럼 행과 열로 구성
                // 자바 : 객체지향 구성, 즉] 레코드1개 == 객체1개, 여러개
            }
        } catch (Exception e) {System.out.println(e);}//try,catch end
    }// UserSelect end
    }//class end
