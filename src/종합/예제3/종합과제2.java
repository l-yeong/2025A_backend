package 종합.예제3;

import java.util.Scanner;

public class 종합과제2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Waiting[] waitings = new Waiting[100];


        for (; ; ) {
            System.out.println("=========== 맛집 대기 시스템 ===========");
            System.out.println("1.대기 등록 | 2.대기 현황");
            System.out.println("========================================");
            System.out.print("선택 >");
            int choose = scan.nextInt();

            if (choose == 1) {
                System.out.println("전화번호:");
                String phones = scan.next();
                System.out.println("인원수:");
                int counts = scan.nextInt();
                Waiting waiting = new Waiting();
                waiting.phone = phones;
                waiting.count = counts;


                boolean check = false;
                for (int i = 0; i <= waitings.length - 1; i++) {
                    if (waitings[i] == null) {
                        waitings[i] = waiting;
                        check = true;
                        break;
                    }
                }
                if (check) {
                    System.out.println("[안내] 대기 등록이 완료 되었습니다.");
                } else {
                    System.out.println("[경고] 더 이상 대기 등록을 할 수 없습니다.");
                }
            } else if (choose == 2) {
                for (int j = 0; j <= waitings.length - 1; j++) {
                    if (waitings[j] != null) {
                        System.out.println("============= 대기 현황 =============");
                        System.out.print("연락처:" + waitings[j].phone);
                        System.out.println(" \t인원:" + waitings[j].count);
                        System.out.println("------------------------------------");
                    }
                }

            }

        }//무한루프 e

    } //main end
}// class end

class Waiting {
    String phone;
    int count;
}
