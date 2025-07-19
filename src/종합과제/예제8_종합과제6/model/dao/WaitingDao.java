package 종합과제.예제8_종합과제6.model.dao;

import 종합과제.예제8_종합과제6.controller.WaitingController;
import 종합과제.예제8_종합과제6.model.dto.WaitingDto;

import java.util.ArrayList;

public class WaitingDao {
    private WaitingDao(){}
    private  static final WaitingDao waitingdao = new WaitingDao();
    public  static WaitingDao getWaitingdao(){
        return waitingdao;
    } // public  static WaitingDao

    //DB 대체
    ArrayList<WaitingDto>waitDB = new ArrayList<>();

    //등록 메소드
    public Boolean addWaiting(String phone, int count){
        boolean result=false;
        WaitingDto waitingDto = new WaitingDto(phone,count); // 매개변수값들 객체화
        waitDB.add(waitingDto); //객체 대입
        result=true;    // 대입성공 상태
        return result;
    }// public Boolean addWaiting end

    //조회 메소드
    public ArrayList<WaitingDto>getWaitingList(){
        return waitDB;
    }
} // class end
