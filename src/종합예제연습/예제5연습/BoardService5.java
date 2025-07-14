package 종합예제연습.예제5연습;

import java.util.Scanner;

public class BoardService5 {
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
             String writer=scan.next();
             boolean result= bs.doPost(content,writer);
             if(result){
                 System.out.println("[안내] 글쓰기 성공");
             }else{
                 System.out.println("[경고] 글쓰기 실패");
             }
         }else if(choose==2){
             System.out.println("============= 게시물 목록 =============");
             Board[] boards= bs.doGet();
             for(int j=0; j< boards.length; j++){
                 if(boards[j]!=null){
                     System.out.println("작성자: "+boards[j].writer);
                     System.out.println("내용: "+boards[j].content);
                     System.out.println("------------------------------------");
                 }
             }

         }//if end
     }//무한루프 end

    }//main e
}//class e


class Board{
    //멤버변수
    String content;
    String writer;

    //기본생성자
    Board(){}
    //풀생성지
    Board(String content, String writer){
        this.content=content;
        this.writer=writer;
    }
}

class BoardController{
    Board[] boards=new Board[100];
    boolean doPost(String content, String writer){
        Board board=new Board(); //Board 객체 호출
        board.content=content;
        board.writer=writer;

        for(int i=0; i< boards.length; i++){
            if(boards[i]==null){
                boards[i]=board;
                return true;
            }
        }
        return false;
    }
    Board[] doGet(){
        return boards;
    }
}

