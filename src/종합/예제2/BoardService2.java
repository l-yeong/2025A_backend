package 종합.예제2;

import java.util.Scanner;

public class BoardService2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);                                    //(3)입력객체 생성

        // (5) 메모리 설계
        // boardService1 중에서는 총 게시물 3개를 저장,      변수     --> 100개 --> 200개 변수 필요
        // boardService2 총 1게시물 100를 저장, 변수+배열            --> 100개 --> 배열2개 변수 필요
        String[] contents = new String[100];      // 총 문자열(String) 100개를 저장할수 있는 배열 선언
        String[] writers = new String[100];       // 총 문자열(String) 100개를 저장할수 있는 배열 선언

        for (; ; ) {                                                            //(1) 무한루프
            System.out.println("============= My Community =============");     //(2) 출력
            System.out.println("1.게시물쓰기 | 2.게시물출력");
            System.out.println("========================================");
            System.out.print("선택 >");
            int choose = scan.nextInt();


            if (choose == 1) {                                                      //(4)'1`번 입력시
                System.out.print("내용:");
                String content = scan.next();
                System.out.print("작성자:");
                String writer = scan.next();
                boolean check = false; //false: 저장실패, true:저장성공
                for (int i = 0; i <= contents.length - 1; i++) {
                    String cont = contents[i];
                    if (cont == null) { // 만약에 index번째가  null(비어있으면)이면
                        contents[i] = content; // 입력받은 값 대입한다.
                        writers[i] = writer;
                        check = true;
                        break;      //저장 성공시 상태변수 수정 후 반복문 탈출
                    }
                }
                if (check) {
                    System.out.println("[안내]글쓰기 성공");
                } else {
                    System.out.println("[경고] 게시물을 등록할 공간이 부족합니다.");
                }
            } else if (choose == 2) {                                                //(4)'2'번 입력시
                System.out.println("============= 게시물 목록 =============");
                for (int j = 0; j <= contents.length - 1; j++) {
                    String cont = contents[j];
                    if (cont != null) {
                        System.out.println("작성자:"+writers[j]);
                        System.out.println("내용:"+contents[j]);
                        System.out.println("------------------------------------");
                    }
                }


            }
        }
        //step1: 반복적인 메인(화면출력)출력,입력.
        //step2:입력 선택에 따른 화면 출력
        //step2: 입력 선택에 따른 화면 출력
        //step3: 기능별 필요한 메모리 설계
        //step4: 각 기능별 세부 코드 구현


    } //main e
}// class e
