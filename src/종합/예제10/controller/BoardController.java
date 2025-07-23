package 종합.예제10.controller;

import 종합.예제10.model.Dao.BoardDao;
import 종합.예제10.model.Dto.BoardDto;

import java.util.ArrayList;

public class BoardController {
    //싱글톤
    private BoardController(){}
    private static final BoardController boardController = new BoardController();
    public static BoardController getBoardController(){
        return boardController;
    }
    public static BoardDao boardDao = BoardDao.getBoardDao();

    //등록 메서드
    public boolean addBoard(String bcontent, String bwriter){
        BoardDto boardDto = new BoardDto(0,bcontent,bwriter);
        boolean resultAdd = boardDao.addBoard(boardDto);
        return resultAdd;
    } // addBoard end

    //조회 메서드
    public ArrayList<BoardDto> listBoard(){
        ArrayList<BoardDto> resultList = boardDao.listBoard();
        return resultList;
    }
    public boolean deleteBoard(int bno){
        boolean resultDelete = boardDao.deleteBoard(bno);
        return resultDelete;
    }//deleteBoard end

    //수정 메서드
    public boolean editBoard(int bno,String bcontent){
        BoardDto boardDto = new BoardDto(bno,bcontent,null);
        boolean resultEdit = boardDao.editBoard(boardDto);
        return resultEdit;
    }//editBoard end
} //class end
