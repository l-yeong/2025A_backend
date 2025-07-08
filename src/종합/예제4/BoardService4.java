package 종합.예제4;

import javax.crypto.spec.PSource;
import java.util.Scanner;

//BoardSer vice4: 입출력 담당
public class BoardService4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //(5)
        //1. content와 writer 멤버변수를 갖는 객체 필요하므로 Board 클래스 선언
        //2. board클래스 객체를 100개 저장하는 배열을 controller 선언 * 추후 : 데이터베이스(외부저장소) 활용
        //3. doPost() 와 doGet() 메소드를 호출하기 위한 객체 생성
        BoardController bs = new BoardController();


        for (; ; ) {
            System.out.println("============= My Community =============");
            System.out.println("1.게시물쓰기 | 2.게시물출력");
            System.out.println("========================================");
            System.out.print("선택 >");
            int choose = scan.nextInt();

            if (choose == 1) {
                System.out.println("내용:");
                String content = scan.next();
                System.out.println("작성자:");
                String writer = scan.next();
                //(6) * doPost 메소드를 호출해서 등록 처리후 결과를 받는다.
                boolean result = //doPost메소드가 실행 후 결과를 result에 저장
                        bs.doPost(content, writer); //입력받은 두 값을 인수로 전달

                if (result == true) { //doPost 에서 true 반환이면
                    System.out.println("[안내]글쓰기 성공");
                } else { //doPost에서 false 반환이면
                    System.out.println("[경고]글쓰기 실패");
                }
            } else if (choose == 2) {
                System.out.println("============= 게시물 목록 =============");

                Board[] boards = bs.doGet(); //doGet() 반환된 boards배열 자료를 boards에 대입한다.
                for (int j = 0; j <= boards.length - 1; j++) {
                    Board board = boards[j];
                    if (board != null) {
                        System.out.println("작성자:" + board.writer);
                        System.out.println("내용:" + board.content);
                        System.out.println("------------------------------------");
                    }
                }
            }//if choose e
        }//무한루프e
    } //main e
} //BS class e

// Board: 데이터 모델
class Board {
    String content;
    String writer;

}//board e


//BoardController: 로직/제어 담당
class BoardController {
    Board[] boards = new Board[100];

    //2. 메소드
    //2-1 등록 메소드
    boolean doPost(String content, String writer) {
        //- Board 객체 생성
        Board board = new Board();
        // 매개변수로 받은 값들을 객체의 멤버 변수에 저장
        board.content = content;
        board.writer = writer;
        // boards 배열의 빈 공간 (null)을 찾아 생성된 객체를 저장합니다.
        for (int i = 0; i <= boards.length - 1; i++) {
            if (boards[i] == null) { // 만약에 i번째 요소의 값이 null 이면
                boards[i] = board; //i번째에 생성한 객체를 대입
                return true; //저장 성공시 true
            }
        }//for e
        return false; //실패(공간없음)시 false 반환 (return)
    } //doPost e

    //2-2 조회 메소드
    Board[] doGet() {
        return boards;
    }
    //boards 배열 전체를 반환(return)
    //boards 타입은 Boards[]
}