package 종합.예제10;

import 종합.예제10.controller.BoardController;
import 종합.예제10.view.BoardView;

public class AppStart {
    public static void main(String[] args) {

        //등록 테스트
        //boolean result=BoardController.getBoardController().addBoard("테스트","수강생");
        //System.out.println(result); //true

        //조회 테스트
        //BoardController bc = BoardController.getBoardController();
        //System.out.println(bc.listBoard()); //true

        //삭제 테스트
        //boolean result=BoardController.getBoardController().deleteBoard(1);
        //System.out.println(result); //true

        //수정테스트
        //boolean result=BoardController.getBoardController().editBoard(2,"수정테스트");
        //System.out.println(result); //true

        BoardView.getBoardView().mainView();
        //테스트

    }//main end
}//class end
