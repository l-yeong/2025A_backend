package 종합.예제8.controller;

import java.util.ArrayList;

public class BoardController {
    private BoardController(){}
    private static final BoardController boardcontroller = new BoardController();
    public static BoardController getBoardcontroller(){
        return boardcontroller;
    }

}
