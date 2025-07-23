package 종합과제.예제9_종합과제7_DB연동.model.dao;

import 종합과제.예제9_종합과제7_DB연동.model.dao.WaitingDao;
import 종합과제.예제9_종합과제7_DB연동.model.dto.WaitingDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class WaitingDao {
    private WaitingDao(){}
    private static final  WaitingDao waitingDao = new WaitingDao();
    public static WaitingDao getWaitingDao(){
        return waitingDao;
    }

    public void addWaiting(WaitingDto waitingDto){
        try {
            String db_url = "jdbc:mysql://localhost:3306/mydb0722";
            String db_user = "root";
            String db_pwd = "1234";
            Connection conn = DriverManager.getConnection(db_url, db_user, db_pwd);
            System.out.println("데이터베이스 연동 성공");

             //자바에서 insert 문법 사용해보기 --------------------------------------//
            String sql = "insert into test2 values('내할말')";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("데이터베이스 연동 실패"+e);
        }
    } //main end

}//class end
