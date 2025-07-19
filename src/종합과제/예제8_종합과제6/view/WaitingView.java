package 종합과제.예제8_종합과제6.view;

import 종합.예제8.model.Dto.BoardDto;
import 종합과제.예제8_종합과제6.controller.WaitingController;
import 종합과제.예제8_종합과제6.model.dto.WaitingDto;

import java.util.ArrayList;
import java.util.Scanner;

public class WaitingView {
    //싱글톤
    private WaitingView(){}
    private static final WaitingView waitingview = new WaitingView();
    public static WaitingView getWaitingview(){
        return waitingview;
    }// public static WaitingView getWaitingview end

    public WaitingController waitingController = WaitingController.getWaitingcontroller();

    Scanner scan=new Scanner(System.in);

    public void infinite(){
        for(;;){
            System.out.println("=========== 맛집 대기 시스템 ===========");
            System.out.println("1.대기 등록 | 2.대기 현황");
            System.out.println("========================================");
            System.out.print("선택 > ");
            int choose= scan.nextInt();
            if(choose==1){
                //등록메소드
                addWaiting();
            }else if(choose==2){
                //조회메소드
                waitingList();
            };

        }//무한루프 end
    } //infinite end

    //등록 메소드
    public void addWaiting(){
        System.out.print("전화번호: ");
        String phone= scan.next();
        System.out.print("인원수: ");
        int count= scan.nextInt();

        boolean result = WaitingController.getWaitingcontroller().addWaiting(phone,count); // controller 객체 참조 후 인자값으로 게시물 등록이 맞을라나.......
        if(result==true){
            System.out.println("[안내] 등록 성공");
        }else{
            System.out.println("[경고] 등록 실패");
        } // if end
    } // public void addWaiting end

    //조회 메소드
    public void waitingList(){
        System.out.println("============= 대기 현황 =============");
        ArrayList<WaitingDto>result=WaitingController.getWaitingcontroller().getWaitingList(); // 컨트롤러에서 리스트 호출 후 result 대입한다...? 맞는 표현인가......
        for(int i=0; i< result.size(); i++){
            WaitingDto wait=result.get(i);
            System.out.printf("연락처: %s - 인원: %d명 \n",wait.getPhone(),wait.getCount());
            System.out.println("------------------------------------");
        }

    }

} //class end
