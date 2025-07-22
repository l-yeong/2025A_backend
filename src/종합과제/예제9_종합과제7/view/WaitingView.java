package 종합과제.예제9_종합과제7.view;


import 종합과제.예제9_종합과제7.controller.WaitingController;

public class WaitingView {
    //싱글톤
    private WaitingView(){}
    private static final WaitingView waitingView = new WaitingView();
    public static WaitingView getWaitingView(){
        return waitingView;
    }
    //싱글톤 호출
    public WaitingController wc = WaitingController.getWaitingController();

}//class end
