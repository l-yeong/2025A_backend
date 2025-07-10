package 종합예제연습.예제3연습;

import java.util.Scanner;

public class BoardService3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Board[] boards = new Board[100];

        for (; ; ) {
            System.out.println("============= My Community =============");
            System.out.println("1.게시물쓰기 | 2.게시물출력");
            System.out.println("========================================");
            System.out.println("선택 > ");
            int choose = scan.nextInt();

            if (choose == 1) {
                System.out.println("내용: ");
                String content = scan.next();
                System.out.println("작성자: ");
                String writer = scan.next();
                Board board = new Board();
                board.contents = content;
                board.writers = writer;
                boolean check = false;
                for (int i = 0; i <= boards.length - 1; i++) {
                    board = boards[i];
                    if (board == null) {
                        boards[i].contents = content;
                        boards[i].writers = writer;
                        check = true;
                    }
                }
                if (check) {
                    System.out.println("[안내]글쓰기 성공");
                } else {
                    System.out.println("[경고] 게시물을 등록할 공간이 부족합니다.");
                }

            } else if (choose == 2) {
                System.out.println("============= 게시물 목록 =============");
                for (int j = 0; j <= boards.length - 1; j++) {
                    Board board = boards[j];
                    if (board != null) {
                        System.out.println("작성자"+board.writers);
                        System.out.println("내용"+board.contents);
                        System.out.println("------------------------------------");
                    }
                }
            }
        }
    }//main e1
}//class e

//step1: 반복적인 메인(화면출력)출력,입력..
//step2:입력 선택에 따른 화면 출력
//step2: 입력 선택에 따른 화면 출력
//step3: 기능별 필요한 메모리 설계
//step4: 각 기능별 세부 코드 구현

class Board {
    String contents;
    String writers;
}