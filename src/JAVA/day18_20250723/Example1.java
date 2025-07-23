package JAVA.day18_20250723;

public class Example1 {
    public static void main(String[] args) {
        //(1) DB연동 확인
        UserDao userDao = UserDao.getUserDao();

        //(2) 연동된 DB에메소드
        //userDao.userInsert();

        //(3) 연동된 db에 매개변수 메소드 실행
        //userDao.userInsert2("탁재훈",41);
        //userDao.userInsert2("신동엽",42);

        //(4) 연동된 db에 select 메소드 실행
        userDao.UserSelect();
    }
}
