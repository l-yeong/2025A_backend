package 종합.예제9;

import 종합.예제9.controller.BoardController;
import 종합.예제9.model.dto.BoardDto;
import 종합.예제9.view.BoardView;

import java.util.ArrayList;

public class AppStart {
    public static void main(String[] args) {
        BoardView.getBoardView().index();

        //BoardController bc = BoardController.getBoardController();
        ////단위기능 테스트
        //
        //    // 1)등록테스트
        //bc.boardWrite("안녕하세요","유재석");
        //    // 2)전체등록테스트
        //ArrayList< BoardDto >result2 = bc.boardPrint();
        //System.out.println(result2);


    } //main end
}//class end
