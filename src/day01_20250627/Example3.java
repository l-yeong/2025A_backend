package day01_20250627;

public class Example3 {
    public static void main(String[] args) {
        /*
         [출력함수]
            System : 시스템 관련 기능 제공하는 클래스
            out    : 출력 관련 객체 변환
            (1) System.out.Print();         :출력 함수
            (2) System.out.Println();       :출력 후 줄바꿈 함수
            (3) System.out.Printf("형식",값);        :f(format) 정해진 형식의 출력 함수
                [ 형식 ]
                    %s : 문자열 위치,   %c: 문자열 위치
                    %d : 정수 위치,     %f: 실수 위치
                [자릿수 맞춤]
                    %자릿수d   : 자릿수만큼 자릿수 차지, 만일 비어있으면 공백, 오른쪽 정렬
                    %-자릿수d  : 자릿수만큼 자릿수 차지, 만일 비어있으면 공백, 왼쪽 정렬
                    %0자릿수d  : 자릿수만큼 자릿수 차지, 만일 비어있으면 0채움
                [소수점 자릿수 맞춤]
                    %전체자릿수.소수점자릿수f : (소수점포함)전체 자릿수 만큼 자릿수 차지
         [자동완성]
            sout+엔터
            System.out.print();     :자동 완성 없음.
            System.out.println();   :sout+엔터
            System.out.printf();    :souf+엔터

        [이스케이프/제어 문자]
            \n: 줄바꿈
            \t: 들여쓰기
            \\: '\'백슬래시 1개 출력
            \': '작은따옴표 출력
            \": "큰따옴표 출력
        */
        //[1]
        System.out.println("자바안녕1"); //자료 출력 후 줄바꿈 처리.
        System.out.println("자바안녕2");

        System.out.print("안녕자바3"); //자료 출력
        System.out.print("안녕자바4");

        System.out.printf("%s","안녕자바5");
        //[2]
        String name = "유재석"; //String (문자열타입) name(변수명) =(대입) "유재석"(자료) ;(마침)
        int age = 40; //int(정수타입) =(대입) 40(자료) ;(마침)
        System.out.printf("저는 %s 이고 나이는 %d 입니다.",name,age);
                        //"~~~~~~~~형식 자리 ~~~~~~~~~~//값1  값2 ==>%s 에는 name값 대입, %d에는 age값 대입
                //vs
        System.out.println("저는"+name+"이고 나이는"+age+"입니다."); // + 연결연산자 사용
        System.out.printf("저는 %s 이고 나이는 %6d 입니다. \n",name,age);  // %6d, 6자릿수안에 정수 표현, 오른쪽 정렬
        System.out.printf("저는 %s 이고 나이는 %-6d 입니다. \n",name,age); // %-6d, 6자릿수안에 정수 표현, 왼쪽정렬
        System.out.printf("저는 %s 이고 나이는 %06d 입니다. \n",name,age); // %06d, 6자릿수안에 정수 표현, 빈칸은 0채움
        System.out.printf("저는 %s 이고 나이는 %5.2f 입니다. \n",name,188.257); //%5.2f, 5자릿수안에 실수 표현, 소수점2개

        //[3] 이스케이프 문자
        System.out.println("안녕1\n안녕2");     // \n 줄바꿈 처리
        System.out.println("안녕1\t안녕2");     // \t (tab) 들여 쓰기
        System.out.println("안녕1\'안녕2");     // \' 작은따옴표 출력
        System.out.println("안녕1\"안녕2");     // \" 큰따옴표 출력
        System.out.println("안녕1\\안녕2");     // \\ 백플래시 출력
    }//main end
}//class end
