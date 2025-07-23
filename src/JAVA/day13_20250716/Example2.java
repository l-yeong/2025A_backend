package day13_20250716;
//* 자바의 모든 클래스는 자동으로 extends Object 이므로 자바는 100% 객체지향 이다.
class A{                                                //부모 Object, 자식: B/C, 자손 D/E
    A(){System.out.println("A객체 탄생");} //A클래스 생성자
        }//A class end

class B extends  A{ //B는 A로부터 상속 받는다               //부모 A, 자식 D
    B(){System.out.println("B객체 탄생");}
}// B class end

class C extends  A{                                     //부모 A, 자식 E
    C(){System.out.println("C객체 탄생");}
}
class D extends B{                                      //부모 B
    D(){System.out.println("D객체 탄생");}
}

class E extends C{                                      //부모C
    E(){System.out.println("E객체 탄생");}
}

public class Example2 {
    public static void main(String[] args) {

        //(1) A 클래스로 객체 생성시 총 객체수: 2개
        System.out.println("[1]=============");
        A a=new A(); // Object -> A

        //(2) B 클래스로 객체 생성시 총 객체수:3개
        System.out.println("[2]=============");
        B b=new B(); // Object -> A -> B

        //(3) C 클래스로 객체 생성시 총 객체수:3개
        System.out.println("[3]=============");
        C c=new C(); // Object -> A -> C

        //(4) D 클래스로 객체 생성시 총 객체수:4개
        System.out.println("[4]=============");
        D d=new D(); // Object -> A -> B -> D

        //(5) E 클래스 객체 생성시 총 객체수:4개
        System.out.println("[5]=============");
        E e=new E(); // Object -> A -> C -> E

        //(6) 자동타입변환
        A a1 =b;        // b객체(값)는 B타입
        Object o1 = b;  // b객체(갮)는 Object타입 변환 가능
        //B b2= c;        // C를 몰라서 불가능

        //(7) 강제타입변환
        B b2= (B)a1;     // 가능! a1 태생확인

        A a2=e;        //자동
        C c1=(C)a2;    //강제

        //B b3=(B)a2;        //강제 불가능
        //문법오류 가 아닌 실험오류 발생

        //(8) 인스턴스(객체/값) 타입 확인방법
        // 객체 instance of 타입/클래스명 : 객체가 지정한 클래스 타입 확인
        //강제타입 변환 전에 확인 목적
        System.out.println( a instanceof  Object); //true
        System.out.println( b instanceof  A); // true
        //System.out.println( e instanceof  B); //false
        System.out.println( a2 instanceof  C); //true
        System.out.println( a2 instanceof  B); //false

        //(9) 상속 활용처
        // 1. 웹/앱 라이브러리*
        // 2. 클래스 설계 단계
        //      코드치다가 명령어(코드)가 중복되면 메소드화
        //      클래스정의하다가 다른클래스와 멤버변수 중복되면 상속화
    }//main class
} //class
