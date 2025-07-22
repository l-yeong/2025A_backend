package 종합과제.예제9_종합과제7.controller;

import 종합과제.예제9_종합과제7.model.dao.WaitingDao;
import 종합과제.예제9_종합과제7.model.dto.WaitingDto;

import java.util.ArrayList;

public class WaitingController {
    //싱글톤
    private WaitingController(){}
    private static final WaitingController waitingController = new WaitingController();
    public static WaitingController getWaitingController(){
        return waitingController;
    }
    //싱글톤 호출
    public WaitingDao waitingDao = WaitingDao.getWaitingDao();

    //등록 메소드
    public boolean addWaiting(String phone, int count){
        WaitingDto waitingDto = new WaitingDto(phone,count); //매개변수를 dto 객체 생성
        boolean result = waitingDao.addWaiting(waitingDto); //결과를  view 에게 리턴한다
        return true;
    } // addWaiting end

    //조회 메소드
    public ArrayList<WaitingDto> waitingList(){
        ArrayList<WaitingDto> result = waitingDao.waitingList();
        return result;
    }

}//class end
