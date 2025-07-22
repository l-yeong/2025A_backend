package 종합과제.예제9_종합과제7.controller;

import 종합과제.예제9_종합과제7.model.dao.WaitingDao;

public class WaitingController {
    //싱글톤
    private WaitingController(){}
    private static final WaitingController waitingController = new WaitingController();
    public static WaitingController getWaitingController(){
        return waitingController;
    }
    //싱글톤 호출
    public WaitingDao waitingDao = WaitingDao.getWaitingDao();

}//class end
