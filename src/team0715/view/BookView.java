package team0715.view;

import team0715.controller.BookController;
import team0715.controller.MemberController;
import team0715.model.dto.BookDto;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class BookView {
    private BookView() {
    }

    private static final BookView bookView = new BookView();

    public static BookView getInstance() {
        return bookView;
    }//public static BookView end

    private BookController bookController = BookController.getInstance();


    //2) controller 싱글톤 가져오기
    private MemberController memberController = MemberController.getInstance();

    //*모든 메소드에서 사용 가능한 Scanner 입력객체
    private Scanner scan = new Scanner(System.in);

    public void index() {
        for (; ; ) {
            System.out.println("=========== 도서관리 시스템  ===========");
            System.out.println("  1.회원가입 | 2.로그인");
            System.out.println("==========================================");
            System.out.println("선택 >");
            int choose = scan.nextInt();
            if (choose == 1) {
                signup();
            } else if (choose == 2) {
                login();
            }
        }
    }

    //3) 회원가입 등록 입출력 구현
    public void signup() {
        System.out.println("--- 회원 가입 ---");
        System.out.println("아이디 : ");
        String mid = scan.next();
        System.out.println("비밀번호 : ");
        String mpwd = scan.next();
        System.out.println("이름 : ");
        String mname = scan.next();
        System.out.println("연락처 : ");
        String mphone = scan.next();
        boolean result = memberController.signup(mid, mpwd, mphone, mname);
        if (result) {
            if (mid.equals("admin")) {
                System.out.println("[안내] 관리자 계정이 등록되었습니다.");
            } else {
                System.out.println("[안내] 회원가입이 완료되었습니다.");
            }
        } else {
            System.out.println("[경고] 이미 존재하는 아이디입니다.");
        }
    }

    //도서등록 입출력
    public void bookPost() {
        System.out.println("--- 도서 등록 ---");
        System.out.println("도서번호: ");
        int bno = scan.nextInt();
        System.out.println("도서명: ");
        String btitle = scan.next();
        System.out.println("저자:");
        String bname = scan.next();
        boolean result = bookController.BookPost(bno, btitle, bname);
        if (result == true) {
            System.out.println("[안내]도서등록성공");
        } else {
            System.out.println("[경고]도서등록실패");
        }
    }


    //3) 로그인 등록 입출력 구현
    public void login() {
        System.out.println("--- 로그인 ---");
        System.out.print("아이디 : ");
        String mid = scan.next();
        System.out.print("비밀번호 : ");
        String mpwd = scan.next();


        boolean loginResult = memberController.login(mid, mpwd);
        if (!loginResult) {
            System.out.println("[경고] 로그인 정보가 일치하지 않습니다.");
            return;
        }

        System.out.printf("[안내] %s님, 환영합니다.\n", mid);


        for (int i = 0; i < 100; i++) {
            if (mid.equals("admin")) {
                System.out.println("=========== 로그인 후 메뉴 (admin일경우) ===========");
                System.out.println("  1.도서등록 | 2.도서대출 | 3.도서반납 | 4.내대출현황 | 5.도서목록 | 6.로그아웃");
                System.out.println("================================================================");
                System.out.print("선택 > ");
                int sel = scan.nextInt();
                if (sel == 1) {
                    bookPost();
                } else if (sel == 2) {
                    System.out.println("--- 도서 대출 ---");

                    System.out.println("대출할 도서 번호:");
                } else if (sel == 3) {
                    System.out.println("--- 도서 반납 ---");
                    System.out.println("반납할 도서 번호 : ");
                } else if (sel == 4) {
                    System.out.println("--- 내 대출현황 ----");
                    System.out.println("[1] 이것이 자바다 | 신용권 | 대출일: 2025-07-15 11:41:00");
                } else if (sel == 5) {
                    System.out.println("--- 도서목록----");
                    ArrayList<BookDto> result = bookController.getBookList();
                    for (int j = 0; j < result.size(); j++) {
                        BookDto bookList = result.get(j);
                        System.out.println("도서명:" + bookList.getBno() + bookList.getBtitle()); //도서명
                        System.out.println("저자:" + bookList.getBname()); //저자

                    }
                } else if (sel == 6) {
                    System.out.println("[안내] 로그아웃 되었습니다.");
                    break;
                } else {
                    System.out.println("[기능] 메뉴 실행...");
                }
            } else {
                System.out.println("=========== 로그인 후 메뉴 (일반유저 일경우) ===========");
                System.out.println("  1.도서대출 | 2.도서반납 | 3.내대출현황 | 4.도서목록 | 5.로그아웃");
                System.out.println("================================================================");
                System.out.print("선택 > ");

                int sel = scan.nextInt();
                if (sel == 1) {
                    bookPost();
                } else if (sel == 2) {
                    System.out.println("--- 도서목록----");
                    ArrayList<BookDto> result = bookController.getBookList();
                    for (int j = 0; j < result.size(); j++) {
                        BookDto book = result.get(j);
                        System.out.println("도서명:" + book.getBtitle()); //도서명
                        System.out.println("저자:" + book.getBname()); //저자
                    }
                } else if (sel == 3) {
                    System.out.println("--도서대출--");
                    System.out.println("대출할 도서 번호:");
                    int bno = scan.nextInt();
                    ArrayList<BookDto> result = bookController.getBookList();
                    String bookloan = bookController.BookLoan(bno);
                    for (int k = 0; k < result.size(); k++) {
                        BookDto book1 = result.get(k);
                        

                    }


                } else if (sel == 5) {
                    System.out.println("[안내] 로그아웃 되었습니다.");
                    break;
                } else {
                    System.out.println("[기능] 메뉴 실행...");
                }
            }
        }
    }
}//bookview end
