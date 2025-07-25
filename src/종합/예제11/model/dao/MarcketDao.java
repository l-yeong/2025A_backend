package 종합.예제11.model.dao;

import 종합.예제11.model.dto.MarcketDto;

import java.sql.*;
import java.util.ArrayList;

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
            String sql = "INSERT INTO marcket (kseller,kpwd,kitem,kprice,ktext,kstatus) VALUES (?,?,?,?,?,?);";
            // 2. SQL 기재한다..
            PreparedStatement ps = conn.prepareCall(sql);
            // 3. SQL 매개변수 대입 , 현재 ? 5개
            ps.setString(1,marcketDto.getKseller());
            ps.setString(2,marcketDto.getKpwd());
            ps.setString(3,marcketDto.getKitem());
            ps.setInt(4,marcketDto.getKprice());
            ps.setString(5,marcketDto.getKtext());
            ps.setString(6,marcketDto.getStatus());
            // 4. SQL 실행  , insert/update/delete 은 .executeUpdate();
            int count = ps.executeUpdate();
            // 5. sql 결과에 따른 로직/리턴/확인
            if(count>=1) return true;
            return false;
        } catch (Exception e) {System.out.println(e);}//catch end
        return false;
    }//marketAdd end

    //조회
    public ArrayList<MarcketDto> marcketPrint(){
        ArrayList<MarcketDto> list = new ArrayList<>();
        try {
            // 1. SQL 작성한다.
            String sql = "select *from marcket;";
            // 2. SQL 기재한다..
            PreparedStatement ps = conn.prepareStatement(sql);
            // 3. SQL 매개변수 대입
            // 4. SQL 실행  , insert/update/delete 은 .executeUpdate();
            ResultSet rs = ps.executeQuery();
            // 5. sql 결과에 따른 로직/리턴/확인
            while(rs.next()){
                int kno= rs.getInt("kno");
                String kseller = rs.getString("kseller");
                String kpwd = rs.getString("kpwd");
                String kitem = rs.getString("kitem");
                int kprice = rs.getInt("kprice");
                String ktext = rs.getString("ktext");
                String kstatus = rs.getString("kstatus");
                String kdate = rs.getString("kdate");
                MarcketDto marcketDto = new MarcketDto(kno,kprice,kseller,kpwd,kitem,ktext,kstatus,kdate);
                list.add(marcketDto);
            }//while end
        } catch (Exception e) {System.out.println(e);}//catch end
        return list;
    }// marcketPrint end

    //수정
    public boolean marcketEdit(MarcketDto marcketDto){
        try {
            // 1. SQL 작성한다.
            String sql = "update marcket set kitem=?,kprice=?,ktext=?,kstatus=? where kno=?;";
            // 2. SQL 기재한다..
            PreparedStatement ps= conn.prepareStatement(sql);
            // 3. SQL 매개변수 대입
            ps.setString(1,marcketDto.getKitem());
            ps.setInt(2,marcketDto.getKprice());
            ps.setString(3,marcketDto.getKtext());
            ps.setString(4,marcketDto.getStatus());
            ps.setInt(5,marcketDto.getKno());
            // 4. SQL 실행  , insert/update/delete 은 .executeUpdate();
            int count = ps.executeUpdate();
            // 5. sql 결과에 따른 로직/리턴/확인
            if(count==1) return true;
            return false;
        } catch (Exception e) {System.out.println(e);}//catch end
        return false;
    }//marcketEdit end

    //getPWD
    public String getPwd(int kno){
        try {
            String sql= "select kpwd from marcket where kno=?;";
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setInt(1,kno);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){return rs.getString("kpwd");}//if end
        } catch (SQLException e) {System.out.println(e);}//catch end
        return null;
    }//getPwd end

    //삭제
    public boolean marcketDelete(MarcketDto marcketDto){
        try {
            // 1. SQL 작성한다.
            String sql = "delete from marcket where kno=?;";
            // 2. SQL 기재한다..
            PreparedStatement ps = conn.prepareStatement(sql);
            // 3. SQL 매개변수 대입
            ps.setInt(1,marcketDto.getKno());
            // 4. SQL 실행  , insert/update/delete 은 .executeUpdate();
            int count = ps.executeUpdate();
            // 5. sql 결과에 따른 로직/리턴/확인
            if(count==1) return true;
            return false;
        } catch (Exception e) {System.out.println(e);} //catch end
        return false;
    }// marcketDelete end

}//class end
