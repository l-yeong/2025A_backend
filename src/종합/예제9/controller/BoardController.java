package 종합.예제9.controller;

import 종합.예제9.model.dao.BoardDao;
import 종합.예제9.model.dto.BoardDto;

import java.util.ArrayList;

public class BoardController {
    private BoardController(){}
    private static final BoardController boardController = new BoardController();
    public static BoardController getBoardController(){
        return boardController;
    }
    //싱글톤 호출
    private BoardDao boardDao = BoardDao.getBoardDao();

    //등록
    public Boolean boardWrite(String content,String writer){
        //1. 매개변수를 dto 객체 생성
        BoardDto boardDto = new BoardDto(content,writer);
        //2. 유효성검사(패스)
        //3. dao에게 저장할 객체를 전달하여 결과 받기
        boolean result=boardDao.boardWrite(boardDto);
        //4. 결과를 view에게 리턴한다
        return result;
    } // boardWrite func end

    //조회
    public ArrayList<BoardDto> boardPrint(){
        //1. dao에게 매개변수 없이 모든 dto 정보를 요청 하여 받는다
        ArrayList<BoardDto> result = boardDao.boardPrint();
        //2.결과를 view에게 리턴한다
        return result;
    }
}//class end
