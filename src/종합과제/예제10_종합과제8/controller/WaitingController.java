package 종합과제.예제10_종합과제8.controller;

import 종합과제.예제10_종합과제8.model.dao.WaitingDao;
import 종합과제.예제10_종합과제8.model.dto.WaitingDto;

public class WaitingController {
    private WaitingController(){}
    private static final WaitingController waitingController =new WaitingController();
    public static WaitingController getWaitingController() {
        return waitingController;
    }
    public static WaitingDao waitingDao = WaitingDao.getWaitingDao();


    //등록
    public boolean createWaiting(String wphone,int wcount){
        WaitingDto waitingDto = new WaitingDto(0,wphone,wcount);
        boolean result = waitingDao.createWaiting(waitingDto);
        return result;
    } //createWaiting end

    //조회
    public void readWaitingList(){

    }//readWaitingList end

    //삭제
    //public boolean deleteWaiting(){
    //
    //}//deleteWaiting end

    //수정
    //public boolean editWaiting(){
    //
    //}//editWaiting end
}//class end
