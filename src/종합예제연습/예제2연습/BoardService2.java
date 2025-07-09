package 종합예제연습.예제2연습;

import java.util.Scanner;

//step1: 반복적인 메인(화면출력)출력,입력..
//step2: 입력 선택에 따른 화면 출력
//step3: 기능별 필요한 메모리 설계
//step4: 각 기능별 세부 코드 구현

public class BoardService2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String[] contents =new String[5];
        String[] writers =new String[5];

        for( ; ; ){
            System.out.println("============= My Community =============");
            System.out.println("1.게시물쓰기 | 2.게시물출력");
            System.out.println("========================================");
            System.out.print("선택 > ");
            int choose= scan.nextInt();

            if(choose==1){
                System.out.println("내용: ");
                String content= scan.next();
                System.out.println("작성자: ");
                String writer= scan.next();

                boolean check=false;
                for(int i=0; i<=contents.length-1; i++){
                    String con=contents[i];
                    if(con==null){
                        contents[i]=content;
                        writers[i]=writer;
                        check=true;
                        break;
                    }
                }
                if(check){
                    System.out.println("[안내]글쓰기 성공");
                }else{
                    System.out.println("[경고] 게시물을 등록할 공간이 부족합니다.");
                }

            }else if(choose==2){
                System.out.println("============= 게시물 목록 =============");
                for(int j=0; j<= contents.length-1; j++){
                    String cont=contents[j];
                    if(cont!=null){
                        System.out.println("작성자:"+writers[j]);
                        System.out.println("내용:"+contents[j]);
                        System.out.println("------------------------------------");
                    }
                }




            }
        }
    } //main e
}// class e
