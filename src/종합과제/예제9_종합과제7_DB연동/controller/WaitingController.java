package 종합과제.예제9_종합과제7_DB연동.controller;

import 종합과제.예제9_종합과제7_DB연동.model.dao.WaitingDao;

public class WaitingController {
    private WaitingController(){}
    private static final WaitingController waitingController =new WaitingController();
    public static WaitingController getWaitingController() {
        return waitingController;
    }
    public static WaitingDao waitingDao = WaitingDao.getWaitingDao();
}//class end
