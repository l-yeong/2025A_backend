package 종합.예제7.종합과제5.model.dao;

import 종합.예제7.종합과제5.model.dto.WaitingDto;

//데이터 접근 방식 클래스
public class WaitingDao {
    //싱글톤 만들기
    private WaitingDao(){}
    private static final WaitingDao dao=new WaitingDao();
    public static WaitingDao getInstance(){
        return dao;
    }

    //DB 대체용 멤버변수 배열 100개 저장소
    private WaitingDto[] waitingDB = new WaitingDto[100];

    public WaitingDto[] getWaitingList(){
            return waitingDB;
    }

    public boolean addWaiting(String phone, int count){
        boolean result=false;
        WaitingDto waitingDto=new WaitingDto(phone,count);
        for(int i=0; i<= waitingDB.length-1; i++){ // 빈공간 찾기 위한 0부터 순회
            if(waitingDB[i]==null){                // 배열내 i번째 값이 비면
                waitingDB[i]=waitingDto;           // i번째 저장할 객체 대입
                result=true;
                break;
            }//if end
        }//for 반복문 end
        return result;
    }
} // class end

