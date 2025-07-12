package 종합예제연습.예제3연습;

import java.util.Scanner;

public class BoardService3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        Board[] boards=new Board[100];

        for( ; ; ){
            System.out.println("============= My Community =============");
            System.out.println("1.게시물쓰기 | 2.게시물출력");
            System.out.println("========================================");
            System.out.print(" 선택 > ");
            int choose= scan.nextInt();

            if(choose==1){
                System.out.print("작성자: ");
                String content= scan.next();
                System.out.print("내용: ");
                String writer= scan.next();
                Board board=new Board();
                board.contents=content;
                board.writers=writer;
                boolean check=false;
                for(int i=0; i< boards.length; i++){
                    if(boards[i]==null){
                        boards[i]=board;
                        check=true;
                        break;
                    }
                }
                if(check){
                    System.out.println("[안내] 글쓰기 성공");
                }else{
                    System.out.println("[경고] 글쓰기 실패");
                }

            }else if(choose==2){
                System.out.println("============= 게시물 목록 =============");
                for(int j=0; j< boards.length; j++){
                    if(boards[j]!=null){
                        System.out.println("작성자: "+boards[j].writers);
                        System.out.println("내용: "+boards[j].contents);
                        System.out.println("------------------------------------");
                    }
                }

            }//if choose end
        }//무한루프 end
    }//main e1
}//class e


class Board{
    //클래스내 멤버변수
    String contents;
    String writers;
}