package 종합.예제1;

import java.util.Scanner;

public class BoardService1 {
    public static void main(String[] args) {
        //step1: 반복적인 메인(화면)출력
        //step2: 입력 선택에 따른 화면 출력
        //step3: 기능별 필요한 메모리 설계
        //step4: 각 기능별 세부 코드 구현
        Scanner scan=new Scanner(System.in);

        String content1=null; String writer1=null; String content2=null;
        String writer2=null;  String content3=null; String writer3=null;

        for( ; ; ){ // 무한루프 시작 // for Start
            System.out.println("============= My Community =============");
            System.out.println("        1.게시물쓰기 | 2.게시물출력");
            System.out.println("========================================");
            System.out.print("선택>");
            int choose=scan.nextInt();

            if(choose==1){
                System.out.println("내용");
                String content= scan.next();
                System.out.println("작성자");
                String writer= scan.next();

                if(content1==null){
                    content1=content;
                    writer1= writer;
                    System.out.println("[안내]글쓰기 성공");
                }else if(content2 == null){
                    content2=content;
                    writer2= writer;
                    System.out.println("[안내]글쓰기 성공");
                }else if(content3== null){
                    content3=content;
                    writer3=writer;
                    System.out.println("[안내]글쓰기 성공");
                }else{
                    System.out.println("[경고] 게시물을 등록할 공간이 부족합니다.");
                }
            }
            if(choose==2){
                System.out.println("============== 게시물 목록 ==============");
                System.out.println("작성자 :");
                System.out.println("내용:");
                System.out.println("========================================");
            }
            if(content1!=null){
                System.out.println("============== 게시물 목록 ==============");
                System.out.println("작성자 :"+writer1);
                System.out.println("내용:"+content2);
                System.out.println("========================================");
            }
            if(content2!=null){
                System.out.println("============== 게시물 목록 ==============");
                System.out.println("작성자 :"+writer2);
                System.out.println("내용:"+content2);
                System.out.println("========================================");
            }
            if(content3!=null){
                System.out.println("============== 게시물 목록 ==============");
                System.out.println("작성자 :"+writer3);
                System.out.println("내용:"+content3);
                System.out.println("========================================");
            }
        }

    }//main e
}//class e
