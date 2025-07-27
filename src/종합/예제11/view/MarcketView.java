package 종합.예제11.view;

import 종합.예제11.controller.MarcketController;
import 종합.예제11.model.dto.MarcketDto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MarcketView {
    //싱글톤
    private MarcketView(){}
    private static final MarcketView marcketView = new MarcketView();
    public static MarcketView getMarcketView(){
        return marcketView;
    }
    //싱글톤 호출
    MarcketController marcketController = MarcketController.getMarcketController();

    Scanner scan = new Scanner(System.in);
    public void mainView(){
        for(;;) {
            try {

                System.out.println("======Marcket=======");
                System.out.println("1. 중고 물품 등록");
                System.out.println("2. 전체 물품 목록 조회");
                System.out.println("3. 등록 정보 수정");
                System.out.println("4. 등록 물품 삭제");
                System.out.println("5. 익명 문의 남기기");
                System.out.println("6. 물품 상세 조회");
                System.out.println("7. 등록 랭킹 조회");
                System.out.println("8. 검색 조회");
                System.out.println("===================");
                System.out.print("선택 > ");
                int choose = scan.nextInt();

                if(choose==1){marcketAdd();} //등록
                else if(choose==2){marcketPrint();} //조회
                else if(choose==3){marcketEdit();} // 수정
                else if(choose==4){marcketDelete();} //삭제
                else{System.out.println(" 잘못된 메뉴번호 입니다.");} //if end
            }catch (InputMismatchException e)
            {System.out.println(" 잘못 누르셨습니다. (다시 입력해주세요)"+e);
                scan=new Scanner(System.in);}//catch end
        }//for end
    }//mainview end

    public void marcketAdd(){
        System.out.println("=====물품 등록======");
        System.out.print("판매자: ");
        String kseller= scan.next();
        System.out.print("비밀번호: ");
        String kpwd= scan.next();
        System.out.print("물품명: ");
        String kitem= scan.next();
        System.out.print("가격: ");
        int kprice= scan.nextInt();
        System.out.print("설명: ");
        scan.nextLine();
        String ktext= scan.nextLine();

        //글 등록시 판매중 자동 지정
        String kstatus = "판매중";

        System.out.println("===================");
        boolean resultAdd = marcketController.marcketAdd(kseller,kpwd,kitem,kprice,ktext,kstatus);
        if(resultAdd){System.out.println("[안내]등록 완료");
        }else{System.out.println("[경고]등록 실패");}//if end
    }//marcketAdd end

    public void marcketPrint(){
        ArrayList<MarcketDto> result =marcketController.marcketPrint();
        System.out.println("======물품목록======");
        for(MarcketDto dto : result) {
            System.out.println("물품번호: "+dto.getKno());
            System.out.println("등록일: "+dto.getDate());
            System.out.println("판매자: "+dto.getKseller());
            System.out.println("물품명: "+dto.getKitem());
            System.out.println("가격: "+dto.getKprice());
            System.out.println("판매상태: "+dto.getStatus());
            System.out.println("------------------------------");
        }// for end
    }// marcketPrint end

    public void marcketEdit(){

        System.out.print("[수정] 물품번호: ");
        int kno = scan.nextInt();
        System.out.print("비밀번호: ");
        String kpwd=scan.next();

        String getPwd = marcketController.getPwd(kno);
        //kno입력할때 DB에 없는 번호 입력시 (NullPointerException) 발생하여 유효성 검사로 getPwd!=null 추가
        //getPwd에 매개변수 int kno 가지고 있어서 유효성을 getPwd 지정
        if(getPwd != null&&getPwd.equals(kpwd)){
            System.out.print("물품명: ");
            String kitem = scan.next();
            System.out.print("설명: ");
            String ktext = scan.next();
            System.out.print("가격: ");
            int kprice = scan.nextInt();
            System.out.print("판매상태:");
            String kstatus = scan.next();
            boolean resultEdit = marcketController.marcketEdit(kitem, kprice, ktext, kstatus, kno, kpwd);
            if(resultEdit){System.out.println("[안내]글 수정 완료");
            }else{System.out.println("[경고]글 수정 실패");}//if resultEdit end
        }else{System.out.println("잘못된 비밀번호 입니다.");}//pwd 확인 if end
    }//marcketEdit end

    public void marcketDelete(){
        System.out.print("[삭제] 물품번호: ");
        int kno= scan.nextInt();
        System.out.print("비밀번호: ");
        String kpwd = scan.next();

        String getPwd = marcketController.getPwd(kno);
        if(getPwd!=null&&getPwd.equals(kpwd)){
            boolean resultDelete = marcketController.marcketDelete(kpwd,kno);
            if(resultDelete){System.out.println("[안내] 삭제 완료");}
            else {System.out.println("[경고] 삭제 실패");} //pwd 확인 if end
        } // if end
    } // marcketDelete end
}//class end
