package 종합과제.예제10_종합과제8.view;

import 종합과제.예제10_종합과제8.controller.WaitingController;
import 종합과제.예제10_종합과제8.model.dao.WaitingDao;
import 종합과제.예제10_종합과제8.model.dto.WaitingDto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WaitingView {
    //싱글톤
    private WaitingView(){}
    private static final WaitingView waitingView = new WaitingView();
    public static WaitingView getWaitingView(){
        return waitingView;
    }
    //싱글톤 호출
    public static WaitingController wc = WaitingController.getWaitingController();
    Scanner scan=new Scanner(System.in);
    //메인뷰
    public void mainView(){

        for(;;){
            try {

                System.out.println("╔══════════════════════════════╗");
                System.out.println("║          메인 메뉴           ║");
                System.out.println("╠══════════════════════════════╣");
                System.out.println("║  1. 등록                     ║");
                System.out.println("║  2. 전체조회                 ║");
                System.out.println("║  3. 삭제                     ║");
                System.out.println("║  4. 수정                     ║");
                System.out.println("╚══════════════════════════════╝");
                System.out.print("메뉴 번호를 입력하세요: ");
                int choose = scan.nextInt();

                if(choose==1){
                    createWaiting();
                }else if(choose==2){
                    readWaiting();
                }else if(choose==3){
                    deleteWaiting();
                }else if(choose==4){
                    editWaiting();
                }else{System.out.println("없는 메뉴번호 입니다.");} //if end
            } catch (InputMismatchException e) {
                scan=new Scanner(System.in);
                System.out.println("잘못된 메뉴번호 입니다. (다시 입력 해주세요)"+e);
            } catch (Exception e) {
                System.out.println("[오류] 1588-XXXX 문의 바랍니다"+e);
            }//catch end

        }//for end
    }//mainview end
    public void createWaiting(){
        System.out.println("연락처: ");
        String wphone= scan.next();
        System.out.println("인원수:");
        int wcount = scan.nextInt();

        boolean resultCreate = WaitingController.getWaitingController().createWaiting(wphone,wcount);
        if(resultCreate){System.out.println("[안내]등록 성공");
        }else{System.out.println("[경고]등록 실패");} //if end
    } //createWaiting end

    public void readWaiting(){
        ArrayList<WaitingDto> result = wc.readWaiting();
        System.out.println("╔═════════════════════════════╗");
        for(WaitingDto dto : result) {
            System.out.printf("   연락처:%s \n ",dto.getWphone());
            System.out.printf("   인인수:%d \n",dto.getWcount());

        }//for end
        System.out.println("╚═════════════════════════════╝");
    } // readWaitingend

    public void deleteWaiting() {
        System.out.println("삭제할번호: ");
        int wno = scan.nextInt();
        boolean resultDelete = WaitingController.getWaitingController().deleteWaiting(wno);
        if (resultDelete) {System.out.println("[안내]삭제 성공");}
        else {System.out.println("[경고]삭제 실패");}
    } // deleteWaiting end

    public void editWaiting(){
        System.out.println("수정할번호: ");
        int wno = scan.nextInt();
        System.out.println("인원수: ");
        int wcount = scan.nextInt();
        boolean resultEdit = wc.editWaiting(wno,wcount);
        if(resultEdit) {System.out.println("[안내] 수정 성공");
        }else {System.out.println("[경고] 수정 실패");} // if end
    } // editWaiting end
}//class end

