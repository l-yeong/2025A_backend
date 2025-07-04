package day05_20250703;

import java.util.Scanner;

public class 실습5 {
    public static void main(String[] args) {
//
//        JAVA] 실습5 : 반복문
//                [ 문제 ] 아래 반복문 관련 문제
//[ 제출방법 ] 코드가 작성된 파일이 위치한 깃허브 상세 주소를 제출하시오.
//
//[문제 1] for문을 사용하여 1부터 10까지의 숫자를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
//
//            for(int i=1; i<=10; i++){
//                System.out.println(i);
//            }
//[문제 2] for문을 사용하여 10부터 1까지의 숫자를 역순으로 출력하는 프로그램을 작성하시오.
//
//            for(int i=10; i>=1; i--){
//                System.out.println(i);
//            }
//[문제 3] for문을 사용하여 1부터 50까지 모든 정수의 합계를 구하여 최종 결과를 출력하시오.
//        출력 예시:
//        1부터 50까지의 합계: 1275
//        int sum=0;
//        for(int i=1; i<=50; i++){
//            sum = sum + i;
//        }
//        System.out.println(sum);

//[문제 4] for문과 if문을 사용하여, 1부터 20까지의 숫자 중 짝수만 출력하는 프로그램을 작성하시오.
//
//        for(int i=1; i<=20; i++){
//            if(i%2==0){
//                System.out.println(i);
//            }
//        }
//[문제 5] 1부터 30까지의 숫자 중, 3의 배수는 건너뛰고 나머지 숫자만 출력하는 프로그램을 작성하시오.
//        요구 조건: continue 문을 반드시 사용하시오.
//        for (int i = 1; i <= 30; i++) {
//            if (i % 3 == 0) {
//                continue;
//            }
//            System.out.println(i);
//        }

//[문제 6] 1부터 순서대로 숫자를 더해나갈 때, 합계가 처음으로 100을 초과하는 시점의 숫자와 그때까지의 합계를 출력하고 반복문을 즉시 종료하시오.
//        요구 조건: break 문을 반드시 사용하시오.
//        출력 예시:
//        14까지 더했을 때 합계가 105로 100을 넘습니다.
//
        int p6sum=0;
        for(int i=1; i<=100; i++){
            System.out.println(p6sum);
            p6sum +=i;
            if(p6sum > 100){
                System.out.println(i); //14
                System.out.println(p6sum); //105
                break;
            }
        }

//[문제 7] 중첩 for문을 사용하여 아래와 같이 별(*)로 이루어진 직각삼각형을 출력하시오.
//        출력 예시:
//*
//**
//***
//****
//*****
//

        for(int i=1; i<=5; i++){
            for(int k=0; k<i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


//[문제 8] 중첩 for문을 사용하여 아래와 같이 별(*)로 이루어진 역직각삼각형을 출력하시오.
//        출력 예시:
//*****
//****
//***
//**
//*
//        for(int i=5; i>=1; i--){
//            for(int j=1; i>j; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//
//[문제 9]  Scanner와 무한루프를 사용하여, 사용자가 "end"를 입력할 때까지 계속해서 문자열을 입력받는 프로그램을 작성하시오. "end"가 입력되면,
//        그 전까지 입력된 문자열의 총 횟수를 계산하여 아래 출력 예시와 같이 출력한 뒤 프로그램을 종료하시오.
//                요구 조건:
//        무한루프를 사용하시오 (for(;;) 또는 while(true)).
//        입력 횟수를 저장할 count 변수를 사용하시오.
//        break를 사용하여 루프를 탈출하시오.
//        문자열 비교는 .equals() 메소드를 사용하시오.
//        실행 예시:
//        1회 입력 : 자바
//        2회 입력 : 자바스크립트
//        3회 입력 : 파이썬
//        4회 입력 : HTML
//        5회 입력 : CSS
//        6회 입력 : C언어
//        7회 입력 : end
//                [안내] 프로그램을 종료 합니다.[총 6회 입력]
//
        Scanner scan=new Scanner(System.in);
//        int count=0;
//        for( ; ; ){
//            System.out.printf("%d 회 입력:",+count);
//            String str= scan.nextLine();
//            if(str.equals("end")){
//                System.out.printf("[안내] 프로그램 종료 합니다. [총 %d 회 입력]",count);
//                break;
//            }
//            count++;
//
//        }
//[문제 10] 아래 선언된 4개의 변수는 7월 각 주차별 매출액입니다. 각 매출액을 '만원' 단위로 변환하고, 백만원 단위마다 '■' 문자로 시각화하여 아래 출력 예시와 같이 보고서를 출력하시오.
//        선언 코드:
        int july1 = 3532100;
        int july2 = 9123700;
        int july3 = 5183400;
        int july4 = 11738700;

        int july11 = 3532100/10000;
        int july22 = 9123700/10000;
        int july33 = 5183400/10000;
        int july44 = 11738700/10000;

        for(int i=1; i<=july11/100; i++){
            System.out.print("■");
        }
        System.out.println(july11+"만원");

        for(int i=1; i<=july22/100; i++){
            System.out.print("■");
        }
        System.out.println(july22+"만원");

        for(int i=1; i<=july33/100; i++){
            System.out.print("■");
        }
        System.out.println(july33+"만원");

        for(int i=1; i<=july44/100; i++){
            System.out.print("■");
        }
        System.out.println(july44+"만원");

//        요구 조건:
//        매출액을 10000으로 나눈 몫을 사용하여 '만원' 단위를 계산합니다.
//        '만원' 단위 값을 다시 100으로 나눈 몫만큼 for문을 사용하여 '■' 문자를 반복 출력합니다.
//                출력 예시:
//        ------- 7월 매출액 -------
//                1주차 : ■■■353만원
//        2주차 : ■■■■■■■■■912만원
//        3주차 : ■■■■■518만원
//        4주차 : ■■■■■■■■■■■1173만원


//
//
//                [문제 11]  Scanner와 for(;;) 무한루프를 사용하여 간단한 ATM 기기를 만드시오.
//        요구 조건:
//        사용자에게 "1:입금 | 2:출금 | 3:잔고 | 4:종료" 메뉴를 보여줍니다.
//        Scanner로 메뉴 번호를 입력받습니다.
//        1번을 선택하면 "입금액:"을 물어보고, 입력받은 금액만큼 잔고(balance)를 증가시킵니다.
//        2번을 선택하면 "출금액:"을 물어보고, 입력받은 금액만큼 잔고를 감소시킵니다. (단, 잔고보다 큰 금액은 출금할 수 없다고 안내)
//        3번을 선택하면 현재 잔고를 출력합니다.
//        4번을 선택하면 "프로그램을 종료합니다." 메시지를 출력하고 break를 이용해 무한루프를 탈출합니다.
//        초기 잔고는 0으로 시작합니다.
//        실행 예시:
//        ---------------------------------
//                1:입금 | 2:출금 | 3:잔고 | 4:종료
//                ---------------------------------
//                선택> 1
//        입금액> 10000
//                ---------------------------------
//                1:입금 | 2:출금 | 3:잔고 | 4:종료
//                ---------------------------------
//                선택> 3
//        잔고> 10000
//                ---------------------------------
//                1:입금 | 2:출금 | 3:잔고 | 4:종료
//                ---------------------------------
//                선택> 4
//        프로그램을 종료합니다.

        // 기능 구현에 필요한 메모리 설계
        // balance변수 : (for밖에-누적o)초기잔금 0부터 해서 입금 했을때 +, 출금 했을때 -, 하여 현재 금액 저장하는 변수
        // money 입금액/출금액 변수: (for안에 -누적x)
        // 각 기능별 코드 구현 함수
            //입금기능: money 입력받아 balance 변수에 누적합계 (+)한다.
            //출금기능: money 입력받아 balance 보다 이상이면 (-)차감 한다
            //잔고기능: balance 변수 출력한다.
            //종료기능: break 무한루프 종료 한다.

        int balance = 0;
        for( ; ; ) { //(1) 무한루프, 특정한 break를 만나기 전 까지 계속 반복
            //(2) 출력
            System.out.println("---------------------------------");
            System.out.println("1:입금 | 2:출금 | 3:잔고 | 4:종료");
            System.out.println("---------------------------------");
            //(3) 입력
            System.out.print("선택> ");
            int choose=scan.nextInt();
            if(choose==1){  // 만약에 '1'번 입력 했으면
                System.out.print("입금액>");
                int money=scan.nextInt();
                balance+=money;
            }else if(choose==2){ // 만약에 '2'번 입력 했으면
                System.out.print("출금액>");
                int money=scan.nextInt();
                if(balance >= money){
                    balance -= money;
                }else{
                    System.out.println("[안내] 잔고가 부족합니다.");
                }
            }else if(choose==3){ // 만약에 '3'번 입력 했으면
                System.out.println("잔고>"+balance);
            }else if(choose==4){ // 만약에 '4'번 입력 했으면
                System.out.println("프로그램 종료 합니다.");
                break;
            }

        }


    }//main e
}//class e
