package 종합과제.예제9_종합과제7;

import 종합과제.예제7_종합과제5.model.dao.WaitingDao;
import 종합과제.예제9_종합과제7.controller.WaitingController;
import 종합과제.예제9_종합과제7.view.WaitingView;

public class AppStart {
    public static void main(String[] args) {


        WaitingView.getWaitingView().Waiting();


        ////단위기능 테스트
        //WaitingController wc = WaitingController.getWaitingController();
        //wc.addWaiting("010-0000-0000",0);
        //System.out.println(wc.waitingList());


    }//main end
}//class end
