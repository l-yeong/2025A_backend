package 종합.예제11.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class MarcketQnaDao {
    private MarcketQnaDao(){}
    private static final MarcketQnaDao marcketQnaDao = new MarcketQnaDao();
    public static MarcketQnaDao getMarcketQnaDao(){
        return marcketQnaDao;
    }
    private String db_url="jdbc:mysql://localhost:3306/test0724";
    private String db_id="root";
    private String db_pwd="1234";
    private Connection conn;

    public void openQna(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn= DriverManager.getConnection(db_url,db_id,db_pwd);
        } catch (Exception e) {System.out.println(e);}//catch end
    } // openQna end
}//MarcketQnaDao end
