package day17_20250722;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Example2 {
    public static void main(String[] args) {
        /*
            [ JDBC ] : JAVA DATABASE CONNECT 자바 데이터베이스 연동
                1. 준비
                    1) JDBC MYSQL 라이브러리 다운로드

                2. 연동코드
        */

        //[1] 자바 와 데이터베이스 연동
            // 1) mysql 회사 지원하는 연동 Driver 클래스 로드/가져오기 *보관
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("JDBC 드라이버 가져오기 성공");
            //2)DB 연동후 결과를 갖는 인터페이스, Connection, import java.sql
            //3)DB 연동클래스(구현체) : DriverManager
            //4)DB 연동 함수: ..getConnection(서버주소,계정명,비밀번호);
            // -데이터베이스 서버 주소: jdbc:mysql://ip주소:port번호/데이터베이스명
            String db_url="jdbc:mysql://localhost:3306/mydb0722";       //데이터베이스 서버 주소
            String db_user="root";                                      //데이터베이스 계정명
            String db_pwd="1234";                                       //데이터베이스 비밀번호
            Connection conn = DriverManager.getConnection(db_url,db_user,db_pwd);
            System.out.println("데이터베이스 연동 성공");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC 드라이버 가져오기 실패");
        } catch (SQLException e) {
            System.out.println("데이터베이스 연동 실패"+e);
        }

    }//main end
}//class end
