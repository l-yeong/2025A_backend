package 종합.예제11.model.dao;

import 종합.예제11.model.dto.MarcketDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MarcketDao {
    //싱글톤
    private MarcketDao(){open();}
    private static final MarcketDao marcketDao = new MarcketDao();
    public static MarcketDao getMarcketDao(){
        return marcketDao;
    }

    private String db_url="jdbc:mysql://localhost:3306/test0724";
    private String db_id="root";
    private String db_pwd="1234";
    private Connection conn;
    private void open() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(db_url, db_id, db_pwd);
        }catch (Exception e){System.out.println(e);} //catch end
    }//open end

    //등록
    public boolean marketAdd(MarcketDto marcketDto) {
        try {
            // 1. SQL 작성한다.
            String sql = "INSERT INTO marcket (kseller,kpwd,kitem,kprice,ktext) VALUES (?,?,?,?,?);";
            // 2. SQL 기재한다..
            PreparedStatement ps = conn.prepareCall(sql);
            // 3. SQL 매개변수 대입 , 현재 ? 5개
            ps.setString(1,marcketDto.getKseller());
            ps.setString(2,marcketDto.getKpwd());
            ps.setString(3,marcketDto.getKitem());
            ps.setInt(4,marcketDto.getKprice());
            ps.setString(5,marcketDto.getKtext());
            // 4. SQL 실행  , insert/update/delete 은 .executeUpdate();
            int count = ps.executeUpdate();
            // 5. sql 결과에 따른 로직/리턴/확인
            if(count>=1) return true;
            return false;
        } catch (Exception e) {System.out.println(e);}//catch end
        return false;
    }//marketAdd end

}//class end
