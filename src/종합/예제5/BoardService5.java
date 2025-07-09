package 종합.예제5;

import java.util.Scanner;

public class BoardService5 {
    public static void main(String[] args) {

        //* BoardController 클래스 내 *메소드를 사용*하기 위한 객체 생성
        BoardController bs =new BoardController();

        for (; ; ) {// (1) 무한루프 : 프로그램 계속적으로 실행하기 위해서
            System.out.println("============= My Community =============");// (2) 출력
            System.out.println("  1.게시물쓰기 | 2.게시물출력");
            System.out.println("========================================");
            System.out.print("선택 > ");
            Scanner scan = new Scanner(System.in); // (3) 입력
            int choose = scan.nextInt();
            if (choose == 1) { // (4) 입력 에 따른 화면 출력
                System.out.print("내용 : ");
                String content= scan.next();
                System.out.print("작성자 : ");
                String writer= scan.next();

                boolean result = bs.doPost(content,writer);
                if(result){
                    System.out.println("[안내] 글쓰기 성공");
                }else{
                    System.out.println("[안내] 글쓰기 실패");
                }



            } else if (choose == 2) {
                System.out.println("============= 게시물 목록 =============");

                Board[] result1= bs.doGet();
                for(int i=0; i<=result1.length-1; i++){
                    Board result2=result1[i];
                    if(result2!=null){
                        System.out.println("작성자 : "+result2.writer);
                        System.out.println("내용 : "+result2.content);
                        System.out.println("------------------------------------");
                    }
                }
            } // if end
        } // for end
    }//main e
}//class e


//(1)(게시물)데이터 모델/형식
class Board {
    //1. 멤버변수
    String content;
    String writer;

    //2. 생성자
    // -> 인텔리제이에서 자동완성 생성자 지원
    // 1. 코드파일내 빈공간을 오른쪽클릭
    // 2. [생성] --> [생성자]
    // 3. ctrl키 이용한 멤버변수 복수 선택 후 --> [선택]
    Board(String content, String writer) {
        this.content = content;
        this.writer = writer;
    }
    //3. 메소드
} //class board e

class BoardController {
    Board[] boards = new Board[100];

    //1. 등록 이벤트: 입력받은 자료를 받아서 객체를 생성하여 배열에 저장
    //메소드 이름: doPost
    //매개변수: 저장할 내용과 작성자, String content, String writer
    //반환값: 성공/실패 == boolean, boolean
    boolean doPost(String content, String writer) {
        Board board = new Board(content, writer); //(1) 생성자를 이용한 객체 만들기
        for (int i = 0; i <= boards.length - 1; i++) {//(2) 배열내 빈공간을 찾아서 생성된 객체 대입
            if (boards[i] == null) { //-만약에 i번째 요소가 null 이면
                boards[i] = board; // i번째 생성한 객체 대입
                return true; //return 이란 메소드 값 반환이면서 메소드의 종료를 못한다
            }//if end
        }//for end
        return false;
    }//func end
    //2. (출력)조회 이벤트: 현재 저장된 모든 객체들을 가지는 있는 배열 호출
    //메소드 이름:doGet
    //매개변수:X
    //반환값:boards            , Board[]
    Board[] doGet() {
        return boards;
    }

}

