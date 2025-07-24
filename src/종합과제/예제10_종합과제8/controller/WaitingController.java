package 종합과제.예제10_종합과제8.controller;

import 종합과제.예제10_종합과제8.model.dao.WaitingDao;
import 종합과제.예제10_종합과제8.model.dto.WaitingDto;

import java.util.ArrayList;

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
        boolean resultCreate = waitingDao.createWaiting(waitingDto);
        return resultCreate;
    } //createWaiting end

    //조회
    public ArrayList<WaitingDto>readWaiting(){
        ArrayList<WaitingDto> result= waitingDao.readWaiting();
        return result;

    }//readWaitingList end

    //삭제
    public boolean deleteWaiting(int wno){
        boolean resultDelete = waitingDao.deleteWaiting(wno);
        return resultDelete;
    }//deleteWaiting end

    //수정
    public boolean editWaiting(int wno, int wcount){
        WaitingDto waitingDto = new WaitingDto(wno,null,wcount);
        boolean resultEdit = waitingDao.editWaiting(waitingDto);
        return resultEdit;
    }//editWaiting end
}//class end
