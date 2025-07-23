package 종합.예제10.view;

import 종합.예제10.controller.BoardController;
import 종합.예제10.model.Dto.BoardDto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BoardView {
    //싱글톤
    private BoardView() {
    }

    private static final BoardView boardView = new BoardView();

    public static BoardView getBoardView() {
        return boardView;
    }

    public static BoardController boardController = BoardController.getBoardController();
    Scanner scan = new Scanner(System.in);

    public void mainView() {
        for (;;) {
        try{

            System.out.println("■■■■■■■■■■■■■■■■");
            System.out.println("■              ■");
            System.out.println("■   메인 메뉴    ■");
            System.out.println("■              ■");
            System.out.println("■   1. 등록     ■");
            System.out.println("■   2. 조회     ■");
            System.out.println("■   3. 삭제     ■");
            System.out.println("■   4. 수정     ■");
            System.out.println("■              ■");
            System.out.println("■■■■■■■■■■■■■■■■");
            System.out.print("■ 선택 > ");
            int choose = scan.nextInt();


            if (choose == 1) {addBoard();}//등록메서드
            else if (choose == 2) {listBoard();}//조회메서드
            else if (choose == 3) {deleteBoard();}//삭제메서드
            else if (choose == 4) {editBoard();}//수정메서드
            else{System.out.println("[경고] 존재 하지 않는 메뉴 번호 입니다.");}

            }catch (InputMismatchException e){System.out.println("[경고] 입력 타입이 맞지 않습니다 (다시입력) ");
                scan=new Scanner(System.in);
            }catch (Exception e){System.out.println("[오류] 관리자에게 문의 1588-XXXX ");}
        }//for end
    }//mainView end

    //등록
    public void addBoard(){
        scan.nextLine();
        System.out.print("내용:"); String bcontent= scan.nextLine();
        System.out.print("작성자:"); String bwriter= scan.next();
        boolean resultAdd = boardController.addBoard(bcontent,bwriter);
        if(resultAdd){
            System.out.println("[안내] 글쓰기 성공");
        }else{
            System.out.println("[경고] 글쓰기 실패");
        } //if end
    }//addBoard end

    //조회
    public void listBoard() {
        System.out.println("■■■■■■■■■■■■■■■■");
        ArrayList<BoardDto> result = boardController.listBoard();
        for (BoardDto dto : result) {
            System.out.println("작성자: " + dto.getBwriter());
            System.out.println("내용: " + dto.getBcontent());
            System.out.println("■■■■■■■■■■■■■■■■");
        }//for end
    }//listBoard end

    //삭제
    public void deleteBoard(){
        scan.nextLine();
        System.out.print("삭제할 번호:"); int bno = scan.nextInt();
        boolean resultDelete = boardController.deleteBoard(bno);
        if(resultDelete){System.out.println("[안내] 삭제 완료");}
        else{System.out.println("[경고] 삭제 실패");}
    } //deleteBoard end

    //수정
    public void editBoard(){
        System.out.print("수정할 번호:"); int bno = scan.nextInt();
        scan.nextLine();
        System.out.print("내용:"); String bcontent= scan.nextLine();
        boolean resultEdit= boardController.editBoard(bno,bcontent);
        if(resultEdit) {System.out.println("[안내] 수정 완료");}
        else{System.out.println("[경고] 수정 실패");}
    }//editBoard end

}//class end
