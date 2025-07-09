package 종합.심화과제;

import javax.security.auth.login.AccountException;
import java.util.Scanner;

public class BankService {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        for( ; ; ) { // 무한 출력
            System.out.println("============== KB Bank  ==============");
            System.out.println("1.계좌등록 | 2.입금 | 3.출금 | 4.잔고");
            System.out.println("======================================");
            System.out.print("선택 >");
            int choose= scan.nextInt();

            if(choose==1){ // 계좌등록 입력값
                System.out.println("--- 계좌등록 ---");
                System.out.println("계좌번호 :");
                System.out.println("비밀번호 :");
                System.out.println("[안내] 계좌등록이 완료 되었습니다");
            }else if(choose==2){ // 입금 입력 값
                System.out.println("--- 입금 ---");
                System.out.println("계좌번호 :");
                System.out.println("비밀번호 :");
                System.out.println("입금액 :");
                System.out.println("[안내] 입금이 완료 되었습니다");
            }else if(choose==3){ // 출금 입력 값
                System.out.println("--- 입금 ---");
                System.out.println("계좌번호 :");
                System.out.println("비밀번호 :");
                System.out.println("출금액 :");
                System.out.println("[안내] 출금이 완료 되었습니다");
            }else if(choose==4){
                System.out.println("--- 잔고 ---");
                System.out.println("계좌번호 :");
                System.out.println("비밀번호 :");
                System.out.println("잔고:");

            }

        }//무한루프 e
    }//main e
}//class e

class Account{
    String acc;
    String deposit;
    String Withdrawal;
    String depositMoney;
    String WithdrawalMoney;
    String balance;
    String password;
}

class BankController{
    Account[] accounts = new Account[100];
    void bankInfo(String acc, String deposit, String Withdrawal,
    String depositMoney, String WithdrawalMoney, String balance, String password){

    }

}