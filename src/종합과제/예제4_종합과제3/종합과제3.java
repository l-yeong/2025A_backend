package 종합과제.예제4_종합과제3;

import java.util.Scanner;

public class 종합과제3 {
    public static void main(String[] args) {
        WaitingController controller = new WaitingController();
        Scanner scan = new Scanner(System.in);

        for (; ; ) { // 무한출력
            System.out.println("=========== 맛집 대기 시스템 ===========");
            System.out.println("1.대기 등록 | 2.대기 현황");
            System.out.println("========================================");
            System.out.print("선택 >");
            int choose = scan.nextInt();

            if (choose == 1) { //입력
                System.out.println("연락처:");
                String str = scan.next();
                System.out.println("인원:");
                String cou = scan.next();

                boolean total =
                        controller.addWaiting(str, cou);
                if (total == true) { // add 에서 true 반환이면
                    System.out.println("[안내] 대기 등록이 완료되었습니다.");
                } else { //add 에서 false 반환이면
                    System.out.println("[경고] 더 이상 대기 등록을 할 수 없습니다.");
                }


            } else if (choose == 2) {
                System.out.println("============= 대기 현황 =============");
                Waiting[] waitings = controller.getWaitingList();
                for (int j = 0; j <= waitings.length - 1; j++) {
                    Waiting waiting = waitings[j];
                    if (waiting != null) {
                        System.out.print("연락처:"+waiting.phone);
                        System.out.println("\t 인원:"+waiting.count);
                        System.out.println("------------------------------------");
                    }
                }
            }
        }
    } //main e
}// class e

class Waiting {
    String phone;
    String count;
}//class W e


class WaitingController {
    Waiting[] waitings = new Waiting[100];

    boolean addWaiting(String phone, String count) {
        Waiting waiting = new Waiting();
        //매개변수 에서 받은 정보를 맴버변수에 저장
        waiting.phone = phone;
        waiting.count = count;
        //객체 빈공간 null 찾아서 생성된 객체를 저장
        for (int i = 0; i <= waitings.length - 1; i++) {
            if (waitings[i] == null) {
                waitings[i] = waiting;
                return true; //글쓰기 성공시 true
            }
        }
        return false; //글쓰기 실패시 false
    }//func e

    Waiting[] getWaitingList() {
        return waitings;
    }
} //class cont e

