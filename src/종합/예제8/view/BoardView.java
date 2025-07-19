package 종합.예제8.view;

import 종합.예제8.controller.BoardController;
import 종합.예제8.model.Dao.BoardDao;
import 종합.예제8.model.Dto.BoardDto;


import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class BoardView {
    private BoardView(){}
    private static final BoardView boardview= new BoardView();
    public static BoardView getBoardview(){
        return boardview;
    }
    private BoardController boardController = BoardController.getBoardcontroller();

    Scanner scan=new Scanner(System.in);

    public void index(){
        for( ; ; ){
            System.out.println("============= My Community =============");
            System.out.println("  1.게시물쓰기 | 2.게시물출력");
            System.out.println("========================================");
            System.out.print("선택 > ");
            int choose= scan.nextInt();

            if(choose==1){
                addBoard();
            }else if(choose==2){
                boardList();
            }
        } // 무한루프 end
    } // index end

    // 등록 메소드
    public void addBoard(){
        System.out.println("내용:");
        String content= scan.next();
        System.out.println("작성자:");
        String writer= scan.next();
        boolean result = BoardController.getBoardcontroller().addBoard(content,writer); //controller 객체 호출 뒤 인자값으로 글 추가...?

        if(result==true){
            System.out.println("[안내] 등록 성공");
        }else{
            System.out.println("[경고] 등록 실패");
        } //if end
    } //addBoard end
    // 조회 메소드
    public  void boardList(){
        System.out.println("============= 게시물 목록 =============");
        ArrayList<BoardDto> result = boardController.BoardList();
        for(int i=0; i< result.size(); i++){
            BoardDto board = result.get(i);
            System.out.println("작성자: "+board.getWriter());
            System.out.println("내용: "+board.getContent());
            System.out.println("------------------------------------");
        } //for end
    }//BoardList end
} // class end
