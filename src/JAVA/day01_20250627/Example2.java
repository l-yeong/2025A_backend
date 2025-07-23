package day01_20250627; // 현재.java 파일 위치한 폴더명

public class Example2 { // class start
    public static void main(String[] args) {
        //(2) 리터럴: (JAVA)언어 들이 미리 정의한 데이터
             // 3, '김',"김현수",3.14,true *js에서는 '작은따옴표와 "큰따옴표 구분이 없다.
             // 리터럴의 모든 정수는 int;
             // 리터럴의 모든 실수는 double;
             // 리터럴의 모든 문자는 char;
             //
        //(3) 출력함수: System.out.print(리터럴/변수/연산/함수 등)
             //JS : console.log() * JS 에서는 ;(세미콜론) 선택이지만 JAVA는 무조건 명령어 끝에 ; 넣는다
             //sout + 엔터(자동완성)
        //(4) main 함수 실행 : ctrl+shift+f10
        System.out.println(3);      //리터럴 3 출력
        System.out.println(3.14);   //리터럴 3.14 출력
        System.out.println('김');    //리터럴 '김' 출력
        System.out.println("김현수");  //리터럴 "김현수" 출력
        System.out.println(true);     //리터럴 true 출력
        //(5) 자료형/타입, 8가지
            // 정수: byte, short, int, long
            // 실수: float, double
            // 문자: char         문자열: String
            // 논리: boolean
        //(6) 리터럴 값을 변수 (*한개만 저장 가능한*)에 대입하기
        //자료형 변수명  = 리터럴;
            //1. boolean 타입 : type 와 false만 저장
        boolean bool1=true; //리터럴 true를 저장 가능한 타입
        boolean bool2=false;
        //boolean bool3=3;    // 3라는 리터럴은 boolean에 저장 불가능.
        System.out.println(bool1);
        System.out.println(bool2);
            // 2. char 타입 : '작은 따옴표 으로 감싼 문자 1개 저장
        char ch1 ='A';
        //char ch2 ='ABC';    // 불가능, 문자열(문자여러개)
        //char ch3 ="ABC";    // " " 감싼 자료도 불가능
        System.out.println(ch1);
            // 3. String 클래스 타입 : " " 큰따옴표 으로 감싼 문자 여러개 저장;
        String str1= "ABC";
        //String str2= 'ABC'; // ' ' 감싼 자료는 불가능
        System.out.println(str1);
            //4.byte 타입 : 정수 -128~ +127         1바이트
        byte b1 = 100;
        //byte b2 = 300; // 불가능 : 저장 허용 범위 벗어남
        System.out.println(b1);
            //5 short 타입: 정수 +-3만정도           2바이트
        short s1 = 32000;
        //short s2 = 50000; // 불가능 : 저장 허용 범위 벗어남
        System.out.println(s1);
            //6 int 타입  : 정수 +-21억정도          4바이트,정수 리터럴*
        int i1 =2100000000;
        //int i2=2200000000;
        System.out.println(i1);
            //7 long 타입 : 정수 +-21억정도 이상      8바이트, 리터럴 뒤에 L/l
        //long l1= 3000000000;   // 불가능 :  키보드로 입력된 모든 값은 (리터럴) 정수가 int 라서
        long l2= 3000000000l;
        System.out.println(l2);
            //8. double 타입 : 실수 소수점 17자리 까지 표현, 실수 리터럴*
        double d1=0.1234567891532345235324523;
        System.out.println(d1);
            //9. float 타입 : 실수 소수점 8자리 까지 표현, 리터럴 뒤에 F/f
        float f1 = 0.123456789f;
        System.out.println(f1);

        //*****주의할점 : double(기본타입) 과 Double(참조타입) 세로 ******
    }
}// class end
