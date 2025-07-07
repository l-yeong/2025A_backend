package 종합.예제3;

import java.util.Scanner;

public class BoardService3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Board[] boards = new Board[100];
        //(5)
        //boardService1_ 변수활용: 게시물3개 --> 변수6개, 게시물 100개 --> 게시물 200개
        //boardService2_ 배열활용: 게시물100개 -> 변수2개
        //boardService3_ 객체활용: 게시물100개 -> 변수2개 -> 변수 1개

        for (; ; ) {
            System.out.println("============= My Community ============="); // (3) 입력객체 생성
            System.out.println("  1.게시물쓰기 | 2.게시물출력");
            System.out.println("========================================"); // (4) '1'번 입력시
            System.out.print("선택1 >");
            int choose = scan.nextInt();

            if (choose == 1) {
                System.out.println("내용");
                String content = scan.next();
                System.out.println("작성자");
                String writer = scan.next();
                Board board = new Board();
                board.contents = content;
                board.writers = writer;

                boolean check = false;

                for (int i = 0; i <= boards.length - 1; i++) {
                    if (boards[i] == null) {
                        boards[i] = board;
                        check = true;
                        break;
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
                    if (boards[j] != null) {
                        System.out.println("작성자" + boards[j].writers);
                        System.out.println("내용" + boards[j].contents);
                        System.out.println("------------------------------------");
                    }
                }

            }

        }//무한 루프 end

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