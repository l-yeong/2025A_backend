package 종합.예제6;

import java.util.Scanner;

//step1: 반복적인 메인(화면)출력
//step2: 입력 선택에 따른 화면 출력
//step3: 기능별 필요한 메모리 설계
//step4: 각 기능별 세부 코드 구현
public class 종합과제4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (; ; ) {
            System.out.println("=========== 맛집 대기 시스템 ===========");
            System.out.println("1.대기 등록 | 2.대기 현황");
            System.out.println("========================================");
            System.out.print("선택 > ");
            int choose = scan.nextInt();

            if (choose == 1) {
                System.out.println("전화번호 :");
                String userPhone = scan.next();
                System.out.println("인원수 :");
                int userCount = scan.nextInt();
                boolean result =
                        WaitingController.addWaiting(userPhone,userCount);
                if(result){
                    System.out.println("[안내] 등록 성공");
                }else{
                    System.out.println("[안내] 등록 실패");
                }

            } else if (choose == 2) {
                System.out.println("============= 대기 현황 =============");
                Waiting[] waitings= WaitingController.getWaitingList();
                for(int k=0; k<= waitings.length-1; k++){
                    Waiting waiting=waitings[k];
                    if(waiting!=null){
                        System.out.println("연락처: "+waiting.getPhone());
                        System.out.println("인원: "+waiting.getCount());
                        System.out.println("------------------------------------");
                    }
                }
            }//if choose end
        }//무한루프 end
    } //main end
} // 종합과제4 class end

class Waiting {
    //멤버변수
    private String phone;
    private int count;

    //기본생성자
    Waiting() {
    }//기본생성자 waiting end

    //전체매개변수갖는생성자
    Waiting(String phone, int count) {
        this.phone = phone;
        this.count = count;
    }//전체매개변수갖는생성자 end

    //메소드 setter,getter
    //set phone 멤버변수 데이터 저장
    public void setPhone(String phone) {
        this.phone = phone;
    }

    //get phone 멤버변수 데이터 호출
    public String getPhone() {
        return phone;
    }

    //set count 멤버변수 데이터 저장
    public void setCount(int count) {
        this.count = count;
    }

    //get count 멤버변수 데이터 호출
    public int getCount() {
        return count;
    }
}

//컨트롤러 기능/제어
class WaitingController {
    //멤버변수
    private static final Waiting[] waitings = new Waiting[100];

    //public 다른 클래스 접근 및 등록 메소드
    public static boolean addWaiting(String phone, int count) {
        Waiting waiting = new Waiting(phone, count);
        for (int i = 0; i <= waitings.length - 1; i++) {
            if (waitings[i] == null) {
                waitings[i] = waiting;
                return true;
            }//if end
        }//for end
        return false;
    }
    //조회 메소드
    public static Waiting[] getWaitingList() {
        return waitings;
    }
}//class WaitingController end
