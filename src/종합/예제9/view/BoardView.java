package 종합.예제9.view;


import 종합.예제9.controller.BoardController;
import 종합.예제9.model.dto.BoardDto;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardView {
    //싱글톤
    private BoardView(){}
    private static final BoardView boardView = new BoardView();
    public static BoardView getBoardView(){
        return boardView;
    }
    //싱글톤 호출
    private BoardController bc =BoardController.getBoardController();
    private Scanner scan=new Scanner(System.in);

    //(*) 메인뷰
    public void index(){
        for(;;){
            System.out.println("================");
            System.out.println("1.등록 2.전체조회");
            System.out.println("================");
            System.out.print("선택 > ");
            int choose= scan.nextInt();

            if(choose==1){boardWrite();}
            else if(choose==2){boardPrint();}

        }//무한루프 end
    }//index end

    //(1) 등록뷰
    public void boardWrite(){
        //1.입력받기
        System.out.println("내용: ");     String content= scan.next();
        System.out.println("작성자: ");   String writer= scan.next();
        //2.controller 에게 입력받은 값 전달 하고 결과 받기
        boolean result= bc.boardWrite(content,writer);
        //3.결과에 따른 결과값 출력
        if(result){System.out.println("[안내]글 등록 성공");
        }else{System.out.println("[경고]글 등록 실패");}

    }//boardWrite end

    //(2) 조회뷰
    public void boardPrint(){
        //1. controller 요청 후 결과 받기
        ArrayList<BoardDto> result =bc.boardPrint();

        //2. 결과를 반복하여 출력 한다
        for(BoardDto dto: result){
            System.out.println("작성자: "+dto.getWriter());
            System.out.println("내용: "+dto.getContent());
            System.out.println("---------------------");
        }//for end
    } // boardPrint end
} //class end
