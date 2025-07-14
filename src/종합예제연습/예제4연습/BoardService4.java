package 종합예제연습.예제4연습;

import java.util.Scanner;

public class BoardService4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        BoardController bs=new BoardController();
        for( ; ; ){
            System.out.println("============= My Community =============");
            System.out.println("1.게시물쓰기 | 2.게시물출력");
            System.out.println("========================================");
            System.out.print("선택 > ");
            int choose= scan.nextInt();

            if(choose==1){
                System.out.print("내용: ");
                String content= scan.next();
                System.out.print("작성자: ");
                String writer= scan.next();
                boolean result =
                        bs.doPost(content,writer);
                if(result==true){
                    System.out.println("[안내]글쓰기 성공");
                }else{
                    System.out.println("[경고]글쓰기 실패");
                }

            }else if(choose==2){
                System.out.println("============= 게시물 목록 =============");
                Board[] board= bs.doGet();
                for(int j=0; j< board.length; j++){
                    if(board[j]!=null){
                        System.out.println("작성자: "+board[j].writer);
                        System.out.println("내용: "+board[j].content);
                        System.out.println("------------------------------------");
                    }
                }
            }
        }
    }//main end
}//class end


class Board{
    //멤버변수
    String content;
    String writer;
}//class Board end

class BoardController{
    Board[] boards=new Board[100];

    boolean doPost(String content, String writer){
        Board board=new Board(); //Board 객체 생성
        board.content=content; // Board 멤버변수 받은 데이터 값을 객체 멤버변수 대입
        board.writer=writer; // Board 멤버변수 받은 데이터 값을 객체 멤버변수 대입
        for(int i=0; i< boards.length; i++){
            if(boards[i]==null){
                boards[i]=board;
                return true;
            }//if end
        }//for end
        return false;
    }//boolean doPost end
    Board[] doGet(){
        return boards;
    }
}//BoardController end

