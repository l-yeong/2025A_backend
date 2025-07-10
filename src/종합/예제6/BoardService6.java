package 종합.예제6;

import java.util.Scanner;

public class BoardService6 {
    public static void main(String[] args) {
        ///예제 4/5번 다르게 static 으로 구성된 메소드는 객체가 필요없다.


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
                boolean result=
                BoardController.doPost(content,writer);//클래스명.static메소드명();
                if(result){
                    System.out.println("[안내] 글쓰기 성공");
                }else{
                    System.out.println("[안내] 글쓰기 실패");
                }

            } else if (choose == 2) {
                System.out.println("============= 게시물 목록 =============");
                Board[] boards = BoardController.doGet();
                for(int i=0; i<= boards.length-1;i++){
                    Board board=boards[i];
                    if(board!=null){
                        System.out.println("작성자 : "+board.getWriter());
                        System.out.println("내용 : "+board.getContent());
                        System.out.println("------------------------------------");
                    }//if end
                }//for end
            }//if choose end
        } // for end
    }//main end
} //class end


//(1)데이터 모델: 게시물 형식
class Board {
    //1.멤버변수: *관례적*주로 멤버변수는 private 한다
    //*모델링에 들어갈 속성
    private String content;
    private String writer;
    //2.생성자: *관례적* 기본생성자1개 와 전체매개변수갖는생성자1개 한다. (2개)
    //자동: 해당 클래스에서 오른쪽 클릭

    //1) 기본생성자
    public Board() {
    }

    //2) 전체매개변수갖는 생성자
    public Board(String content, String writer) {
        this.content = content;
        this.writer = writer;
    }


    //3.메소드:


    //1)private으로 선언된 멤버변수를 외부(다른클래스)로부터 접근할수 있도록 getter/setter 지원한다.
    //자동 : 해당클래스 오른쪽클릭 -> [생성] -> [getter 및 setter]
    public void setContent(String content) {
        this.content = content;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public String getWriter() {
        return writer;
    }
    //2) 개발자가 작업하면서 객체의 주소값이 아닌 객체내 멤버변수 값 반환, toString()지원한다.
    //자동: [생성]->[toString] -> 모든 멤버변수 복수로 선택-> [확인]
} //class board end

//(2) 컨트롤러: 기능/제어
class BoardController {
    //1.멤버변수
    private static final Board[] boards = new Board[100];

    //private: 현재 클래스에서만 접근 키워드
    //static: 객체 없이 접근 가능한 키워드
    //final: 수정 불가능 키워드
    //2.생성자
    //3.메소드
    //1) 등록 메소드:
    // public  다른 클래스에서 접근
    public static boolean doPost(String content, String writer) {
        Board board = new Board(content, writer);//(1) 매개변수로 객체를 생성한다
        for (int i = 0; i <= boards.length - 1; i++) {//(2) 배열(boards)내 빈공간을 찾아서 생성한 객체 대입한다.
            if (boards[i] == null) {
                boards[i] = board;
                return true; //저장 성공 뜻을 true에 부여하여 반복
            }
        }//if end
        return false; // 저장실패 뜻을 false로 부여하여 반환
    }
    //2)조회 메소드
    public  static Board[] doGet(){
        return boards;
    }
} //class BoardController end
