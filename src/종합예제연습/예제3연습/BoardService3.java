package 종합예제연습.예제3연습;

import java.util.Scanner;

//step1: 반복적인 메인(화면출력)출력,입력..
//step2:입력 선택에 따른 화면 출력
//step2: 입력 선택에 따른 화면 출력
//step3: 기능별 필요한 메모리 설계
//step4: 각 기능별 세부 코드 구현


public class BoardService3 {
    public static void main(String[] args) {

        Board[] boards= new Board[100];
        //boards 변수에 Board객체 100개를 저장 가능한 배열자료1개 저장

        for( ; ; ) {// (1) 무한루프 : 프로그램 계속적으로 실행하기 위해서
            System.out.println("============= My Community =============");// (2) 출력
            System.out.println("  1.게시물쓰기 | 2.게시물출력");
            System.out.println("========================================");
            System.out.print("선택 > ");
            Scanner scan = new Scanner( System.in ); // (3) 입력
            int choose = scan.nextInt();
            if( choose == 1 ) { // (4) 입력 에 따른 화면 출력
                System.out.print("내용 : ");
                String content= scan.next();
                System.out.print("작성자 : ");
                String writer=scan.next();

                Board board=new Board(); //객체 생성하여 입력 받은 값을 멤버변수 대입
                board.content=content;
                board.writer=writer;
                boolean check=false; // true 성공, false 실패
                for(int i=0; i<= boards.length-1;i++){ //배열내 빈공간을 찾아서 빈공간에 객체 대입
                    if(boards[i]==null){ // i번째 요소 비어(null)있으면
                        boards[i]=board; // i번째 요소의 생성한 객체를 대입
                        check=true; //상태 변경
                        break; //목표 이뤘으면 반복문 종료
                    }
                }



            }else if( choose == 2 ) {
                System.out.println("============= 게시물 목록 =============");
                System.out.println("작성자 : " );
                System.out.println("내용 : " );
                System.out.println("------------------------------------");
            } // if end
        } // for end
    }//main e1
}//class e


class Board{
    //멤버변수
    String content;
    String writer;
}