package 종합과제.예제10_종합과제8.view;

import 종합과제.예제10_종합과제8.controller.WaitingController;

public class WaitingView {
    //싱글톤
    private WaitingView(){}
    private static final WaitingView waitingView = new WaitingView();
    public static WaitingView getWaitingView(){
        return waitingView;
    }
    //싱글톤 호출
    public static WaitingController wc = WaitingController.getWaitingController();

}//class end
