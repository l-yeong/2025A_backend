package 종합과제.예제9_종합과제7.view;


import 종합과제.예제9_종합과제7.controller.WaitingController;
import 종합과제.예제9_종합과제7.model.dto.WaitingDto;

import java.util.ArrayList;
import java.util.Scanner;

public class WaitingView {
    //싱글톤
    private WaitingView(){}
    private static final WaitingView waitingView = new WaitingView();
    public static WaitingView getWaitingView(){
        return waitingView;
    }
    //싱글톤 호출
    public WaitingController wc = WaitingController.getWaitingController();
    Scanner scan=new Scanner(System.in);

    //메인뷰
    public void Waiting(){
        for(;;){
            System.out.println("=========== 맛집 대기 시스템 ===========");
            System.out.println("1.대기 등록 | 2.대기 현황");
            System.out.println("========================================");
            System.out.print("선택 > ");
            int choose = scan.nextInt();

            if(choose==1){
                //등록메소드
                waitingAdd();
            }else if(choose==2){
                //조회메소드
                waitingList();
            } //if end
        }// loop end
    } //Waiting func end

    //등록메소드
    public void waitingAdd(){
        System.out.print("전화번호: "); String phone = scan.next();
        System.out.print("인원수: "); int count = scan.nextInt();
        boolean result = wc.addWaiting(phone,count);
        if(result){System.out.println("[안내] 대기 등록이 완료 되었습니다");
        }else{System.out.println("[경고] 대기 등록이 실패 되었습니다.");}
    } // addWaiting func end

    //조회메소드
    public void waitingList(){
        System.out.println("============= 대기 현황 =============");
        ArrayList<WaitingDto> result = wc.waitingList();
        for(WaitingDto dto : result){
            System.out.printf("연락처: %s - 인원: %d 명 \n",dto.getPhone(),dto.getCount());
            System.out.println("------------------------------------");
        }//for end
    }//waitingList end



}//class end
