package day04_20250702;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        /*
            [반목문]
                1. 조건에 따른 결과가 충족(true) 했을때 (반복)코드 실행
                2. 형태
                    for(초기값; 조건문; 증감식){
                            실행문;
                    }
                    - 초기값: 반복문에서 사용되는 변수 *주로 반복횟수                    ,int i =1;
                    - 조건문: 반복변수의 조건문 *주로 반복횟수 제한                      ,i<=10;
                    - 증감식: 반복변수의 증(가) 또는 감(소) 변화 식 *주로 반복횟수 증감    ,i++
                    - 실행문: 조건 충족시 실행되는 코드/명령어;
               3. 실행순서
                    1) 초기값 -> 2)조건문 -> 3) 실행문 -> 4) 증감식
                                5)조건문 -> 6) 실행문 -> 7) 증감식
                                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                                - !) 조건이 false 이면 반복문 종료
              4. for중첩가능 : 상위 for문이 1회전 마다 하위 for문의 전체 화면
                    for( ){
                        for( ){
                    }
             5. 주요 키워드:
                    1) break;       :가장 가까운 반복문 {} 종료/탈출
                    2) continue;    :가장 가까운 반복문(증감식) 이동
             6. 무한루프
                    1) for( ; ; ){ }
                    2) while(true){ }
        */
        //[1] 1부터 5까지 출력
        for(int i=1; i<=5; i++){
            System.out.println(i);
        }

        //[2] 중첩: 구구단
        for(int j=2; j<=9; j++){
            for(int k=1; k<=9; k++){
                System.out.printf("%d * %d = %d\n",j,k,j*k);
            }
        }
        //[3] break : 1부터 10까지 출력, 만일에 5를 찾았이면 반복문 종료
        for(int l=1; l<=10; l++){
            System.out.println(l);
            if(l==5){
                break;
            }
        }
        //[4] continue: 1부터 10까지 반복, 만약 5를 찾았으면 출력을 생략
        for(int n=1; n<=10; n++ ){
            if(n==5){
                continue;
            }
            System.out.println(n);
        }
        //[5] for( ; ; ){} : 무한반복
        for( ; ;){
            System.out.println("무한입력 *종료:'X'");
            String input=new Scanner(System.in).next(); //키보드로 부터 입력받아 저장
            if(input.equals("X")){  //만약에 입력한 문자열이 "X" 이면 반복문 탈출, 무한루프 탈출
                break;
            }

        }
    }//main e
}//class e
