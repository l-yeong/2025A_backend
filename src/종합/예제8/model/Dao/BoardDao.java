package 종합.예제8.model.Dao;

import 종합.예제8.model.Dto.BoardDto;

import java.util.ArrayList;

public class BoardDao {
    private BoardDao(){}
    private static final BoardDao boarddao = new BoardDao();
    public static BoardDao getBoarddao(){
        return boarddao;
    }
    // DB 대체용
    private ArrayList<BoardDto> boardDB = new ArrayList<>();

    //등록 구현
    public Boolean addBook(String content, String writer){
        boolean result =false;

        BoardDto boardDto = new BoardDto(content,writer); //Dto 객체 생성
        boardDB.add(boardDto);              //ArrayList 삽입
        result=true;                        //등록성공 상태

        return result;
    }  //addbook end
    //등록 조회 구현
    public ArrayList<BoardDto> BoardList(){
        return boardDB;
    }
} // dao end
