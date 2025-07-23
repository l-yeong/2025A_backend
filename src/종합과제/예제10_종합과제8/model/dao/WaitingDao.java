package 종합과제.예제10_종합과제8.model.dao;

import 종합과제.예제10_종합과제8.model.dto.WaitingDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class WaitingDao {
    private WaitingDao(){open();}
    private static final  WaitingDao waitingDao = new WaitingDao();
    public static WaitingDao getWaitingDao(){
        return waitingDao;
    }

    private String db_url = "jdbc:mysql://localhost:3306/exam10";
    private String db_user = "root";
    private String db_pwd = "1234";
    private Connection conn;

    //DB 연동
    public void open(){
        try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         conn=DriverManager.getConnection(db_url,db_user,db_pwd);
        } catch (Exception e) {System.out.println(e);} //catch end
    }//open end

    //등록
    public boolean createWaiting(WaitingDto waitingDto){
        try {
            // 1. SQL 작성한다.
            String sql = "INSERT INTO waiting (wphone, wcount) VALUES (?,?);";
            // 2. SQL 기재한다..
            PreparedStatement ps = conn.prepareStatement(sql);
            // 3. SQL 매개변수 대입 , 현재 ? 2개
            ps.setString(1, waitingDto.getWphone());
            ps.setInt(2, waitingDto.getWcount());
            // 4. SQL 실행  , insert/update/delete 은 .executeUpdate();
            int count = ps.executeUpdate();
            // 5. sql 결과에 따른 로직/리턴/확인
            if(count>=1) return true;
            return false;
        } catch (Exception e) {System.out.println(e);}//catch end
        return false;
    }// createWaiting end

    //조회
    public void readWaitingList(){

    }//readWaitingList end

    //삭제
    //public boolean deleteWaiting(){
    //
    //}//deleteWaiting end

    //수정
    //public boolean editWaiting(){
    //
    //}//editWaiting end
}//class end
