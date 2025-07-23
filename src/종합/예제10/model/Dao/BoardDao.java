package 종합.예제10.model.Dao;

import 종합.예제10.model.Dto.BoardDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BoardDao {
    //싱글톤
    private BoardDao(){Connect();}
    private static final BoardDao boardDao = new BoardDao();
    public static BoardDao getBoardDao(){
        return boardDao;
    }
    //DB연동
    private String db_url="jdbc:mysql://localhost:3306/exam10";
    private String db_id="root";
    private String db_pwd="1234";
    private Connection conn;
    private void Connect(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(db_url, db_id, db_pwd);
        }catch(Exception e){System.out.println(e);}//catch end
    }//Connect func end

    //등록 메서드
    public boolean addBoard(BoardDto boardDto){
        try {

            // 1. SQL 작성한다.
            String sql = "INSERT INTO board (bwriter, bcontent) VALUES (?,?);";
            // 2. SQL 기재한다..
            PreparedStatement ps = conn.prepareStatement(sql);
            // 3. SQL 매개변수 대입 ,  
            ps.setString(1, boardDto.getBwriter());
            ps.setString(2, boardDto.getBcontent());
            // 4. SQL 실행  , insert/update/delete 은 .executeUpdate();
            int count = ps.executeUpdate();
            // 5. sql 결과에 따른 로직/리턴/확인
            if(count >=1 ) return true;
            return false;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }//addBoard end

    //조회메서드
    public ArrayList<BoardDto> listBoard(){
        ArrayList<BoardDto> list = new ArrayList<>();
        try {
            // 1. SQL 작성한다.
            String sql = "select *from board;";
            // 2. SQL 기재한다..
            PreparedStatement ps = conn.prepareStatement(sql);
            // 3. SQL 매개변수
            // 4. SQL 실행  , insert/update/delete 은 .executeUpdate();
            ResultSet rs =ps.executeQuery();
            // 5. sql 결과에 따른 로직/리턴/확인
            //5-1) select 조회결과를 레코드/행/가로단위 하나씩 조회
            while(rs.next()){ // rs.next(): ResultSet 인터페이스 갖는 (조회)결과 테이블에서 다음 레코드 이동 뜻
                //5-2) 현재 조회중인 레코드의 속성값 호출해서 dto 만들기
                int bno = rs.getInt("bno");
                String bcontent = rs.getString("bcontent");
                String bwriter = rs.getString("bwriter");
                BoardDto boardDto = new BoardDto(bno,bcontent,bwriter);
                //5-3) 생성된 dto를 리스트 담기
                list.add(boardDto);
            }//while end
        } catch (Exception e) {System.out.println(e);}//catch end
        return list;
    } //listBoard end

    //삭제메서드
    public boolean deleteBoard(int bno){
        try {
            // 1. SQL 작성한다.
            String sql ="delete from board where bno=?";
            // 2. SQL 기재한다..
            PreparedStatement ps = conn.prepareStatement(sql);
            // 3. SQL 매개변수 대입 ,  
            ps.setInt(1,bno);
            // 4. SQL 실행  , insert/update/delete 은 .executeUpdate();
            int count = ps.executeUpdate();
            // 5. sql 결과에 따른 로직/리턴/확인
            if(count==1){return true;}
            else{return false;}
        } catch (Exception e) {System.out.println(e);}//catch end
        return false;
    }//deleteBoard end

    //수정메서드
    public boolean editBoard(BoardDto boardDto){
        try {
            // 1. SQL 작성한다.
            String sql ="update board set bcontent=? where bno=?;";
            // 2. SQL 기재한다..
            PreparedStatement ps = conn.prepareStatement(sql);
            // 3. SQL 매개변수 대입 ,
            ps.setString(1, boardDto.getBcontent());
            ps.setInt(2,boardDto.getBno());
            // 4. SQL 실행  , insert/update/delete 은 .executeUpdate();
            int count = ps.executeUpdate();
            // 5. sql 결과에 따른 로직/리턴/확인
            if(count==1){return true;}
            else{return false;}
        } catch (Exception e) {System.out.println(e);} //catch end
        return false;
    }//editBoard end
}//class end

