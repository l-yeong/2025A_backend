package 종합과제.예제8_종합과제6.controller;

import 종합과제.예제8_종합과제6.model.dao.WaitingDao;
import 종합과제.예제8_종합과제6.model.dto.WaitingDto;

import java.util.ArrayList;

public class WaitingController {
    //싱글톤
    private WaitingController(){}
    private static final WaitingController waitingcontroller = new WaitingController();
    public static WaitingController getWaitingcontroller(){
        return waitingcontroller;
    } // public static WaitingController
    public WaitingDao waitingDao = WaitingDao.getWaitingdao();

    //등록메소드
    public Boolean addWaiting(String phone, int count){
        boolean result=false; // 논리연산자 변수 생성 초기화
        result=WaitingDao.getWaitingdao().addWaiting(phone, count); // dao에게 매개변수 전달 하고 결과값 받기
        return result;
    }

    //조회메소드
    public ArrayList<WaitingDto>getWaitingList(){
        return WaitingDao.getWaitingdao().getWaitingList();
    }
} // class end
