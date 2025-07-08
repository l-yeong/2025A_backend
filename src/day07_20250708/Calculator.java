package day07_20250708;

// -클래스 목적
// (1) 실행 클래스 : main함수 갖는 클래스
// (2) 객체 설계 클래스: 객체 만들기 위한 객체정의클래스

public class Calculator {
    // 클래스 멤버(객체내 포함)
    // 1.멤버변수
    boolean isPowerOn=false;

    // 2.생성자
    //3. 메소드
    //(1) 매개변수x 반환값o
    double getPi( ){
    //double: return(반환)할 값의 타입이 실수
    //getPI: 메소드명, 카멜표기법 권장, 아무거나
    //(): 매개변수, 없다.
        return 3.14159;
    //return 값: 메소드를 호출 했던곳으로 반환 하는 값;
    }//func e
    //(2) 매개변수x 반환값x
    void PowerOn(){
    //void: return(반환)할 값이 없다는 키워드
    //{ }: 메소드 실행 될때 처리할 코드들
        System.out.println("계산기 전원을 켭니다.");
        isPowerOn=true;
        //isPowerOn: *해당 메소드를 호출한 객체의 *****멤버변수*****
    }//func PowerOn  e

    //(3) 매개변수O, 반환값x
    void printSum(int x, int y){
    // (int x, int y): 메소드 호출시 인수값 정수 2개를 저장하는 변수
       if(isPowerOn){ // 만약에 전원이 켜져있으면
           int sum= x+y;
           System.out.println(sum);
           return;
           }else{
           System.out.println("전원이 꺼져 있습니다.");
           return;
       }
    }//func printSum e

    // (4) 매개변수O, 반환값O
    int add(int x,int y){
        if(isPowerOn){
            int result = x+y;
            return result;
        //return 값: 메소드를 호출했던곳으로 반환되는 값ㅃ
        }else{
            System.out.println("전원이 꺼져있다.");
            return 0;
        }
    }
}//func Calc e
