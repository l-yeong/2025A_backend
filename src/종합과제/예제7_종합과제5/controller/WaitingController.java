package 종합과제.예제7_종합과제5.controller;

import 종합과제.예제7_종합과제5.model.dao.WaitingDao;
import 종합과제.예제7_종합과제5.model.dto.WaitingDto;

public class WaitingController {
    //싱글톤 만들기
    private WaitingController(){}; //1단계
    private static final WaitingController control=new WaitingController(); //2단계
    public static WaitingController getInstance(){ //3단계
        return control;
    }
    // Dao 싱글톤 호출
    private WaitingDao waitingDao=WaitingDao.getInstance();

    //대기자 목록을 반환하는 메소드
    public WaitingDto[] WaitingList(){
        return waitingDao.getWaitingList(); // waitingDao 객체를 통해 대기자 목록을 조회하여 반환
    }

    public boolean addWaiting(String phone, int count){
        boolean result=false;
        result=waitingDao.addWaiting(phone,count); //DAO 객체의 addwaiting 메소드를 호출 처리
        return result;
    }

}//class end
