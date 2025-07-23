package 종합과제.예제10_종합과제8;

import 종합과제.예제10_종합과제8.controller.WaitingController;

public class AppStart {
    public static void main(String[] args) {



        //등록 테스트
        WaitingController wc = WaitingController.getWaitingController();
        boolean result= wc.createWaiting("010-0000-0000",1);
        System.out.println(result);


        // 1. SQL 작성한다.
        // 2. SQL 기재한다..
        // 3. SQL 매개변수 대입 , 현재 ? 2개
        // 4. SQL 실행  , insert/update/delete 은 .executeUpdate();
        // 5. sql 결과에 따른 로직/리턴/확인
    }//main end
}//class end
