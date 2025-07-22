package 종합과제.예제9_종합과제7.model.dao;

import 종합과제.예제9_종합과제7.model.dto.WaitingDto;

import java.util.ArrayList;

public class WaitingDao {
    //싱글톤
    private WaitingDao(){}
    private static final WaitingDao waitingDao = new WaitingDao();
    public static WaitingDao getWaitingDao(){
        return waitingDao;
    }

    //DB 대체용
    ArrayList<WaitingDto>waitingDB = new ArrayList<>();


}//class end
