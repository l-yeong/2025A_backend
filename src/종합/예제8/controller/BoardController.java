package 종합.예제8.controller;

import 종합.예제8.model.Dao.BoardDao;
import 종합.예제8.view.BoardView;
import 종합.예제8.model.Dto.BoardDto;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BoardController {

    //싱글톤
    private BoardController(){}
    private static final BoardController boardcontroller = new BoardController();
    public static BoardController getBoardcontroller(){
        return boardcontroller;
    }
    // 싱글톤 Dao 호출
    private BoardDao boardDao = BoardDao.getBoarddao();

    //등록 기능 구현
    public Boolean addBoard(String content, String writer){
            boolean result=false;
            result = boardDao.addBook(content,writer); // dao 한테 매개변수 전달하고 결과값 반환 받는다
            return  result;
    } //addboard end
    //등록 조회 기능구현
    public ArrayList<BoardDto> BoardList(){
        return boardDao.BoardList(); // dao 에게 요청 후 등록된 게시물들을 반환받아 view에게 반환
    }
} //controller end
