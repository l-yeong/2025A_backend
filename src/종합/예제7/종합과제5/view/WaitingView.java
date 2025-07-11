package 종합.예제7.종합과제5.view;

import 종합.예제7.종합과제5.controller.WaitingController;
import 종합.예제7.종합과제5.model.dto.WaitingDto;

import java.util.Scanner;

// 게시물 입출력 관련 클래스
public class WaitingView {
    //싱글톤 만들기
    private WaitingView(){};
    private static final WaitingView view = new WaitingView();
    public static WaitingView getInstance(){
        return view;
    }
    Scanner scan=new Scanner(System.in);
    //controller 싱글톤 호출
    private WaitingController waitingController=WaitingController.getInstance();

    public void index(){
        for( ; ; ){
            System.out.println("=========== 맛집 대기 시스템 ===========");
            System.out.println("1.대기 등록 | 2.대기 현황");
            System.out.println("========================================");
            System.out.print("선택 > ");
            int choose= scan.nextInt();

            if(choose==1){
                addWaiting();
            }else if(choose==2){
                getWaitingList();
            } // if choose end
        }// 무한루프 end
    }// index end
    public void addWaiting(){
        System.out.println("전화번호: ");
        String phone= scan.next();
        System.out.println("인원수: ");
        int count=scan.nextInt();
        boolean result= waitingController.addWaiting(phone,count);
        if(result){
            System.out.println("[안내]글쓰기 성공");
        }else{
            System.out.println("[경고]글쓰기 실패");
        }
    }//addWaiting end
    public void getWaitingList(){
        System.out.println("============= 대기 현황 =============");
        WaitingDto[] result= waitingController.WaitingList();
        for(int i=0; i<= result.length-1; i++){
            WaitingDto waitingDto = result[i];
            if(waitingDto!=null){
                System.out.printf(i+1+". 연락처: %s - 인원: %d명 \n",waitingDto.getPhone(),waitingDto.getCount());
                System.out.println("------------------------------------");
            } //if end
        }//for end
    } //getWaitingList end
} //class end


