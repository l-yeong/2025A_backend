package day14_20250717;

class 자동차{

    타이어 tire;//멤버변수

   void run(){this.tire.roll();} //메소드
}//자동차 class end

interface 타이어{ //인터페이스
    void roll(); //추상 메소드 : {}없다
}//interface 타이어 end

class 한국타이어 implements 타이어{
    @Override
    public void roll() {
        System.out.println("[한국]타이어 회전(구현)");
    }
}

class 금호타이어 implements 타이어{
    // 추상메소드 자동완성:(방법1) ctrl+스페이스바 (방법2) 오른쪽클릭 -> [생성] -> [메소드 구현]
    @Override
    public void roll() {
        System.out.println("[금호]타이어 회전(구현)");
    }
}




public class Example4 {
    public static void main(String[] args) {

        자동차 myCar = new 자동차();
        //myCar.run();

        //인터페이스 생성자가 없다. 인터페이스로 객체 생성 불가능
        //myCar.tire = new 타이어();

        // [1] 구현체
        myCar.tire = new 한국타이어(); //
        myCar.run();

        myCar.tire = new 금호타이어(); //
        myCar.run();

        //tire 멤버변수는 '타이어' 타입 인데
        // 왜? 한국타이어/금호타이어 타입이 대입될까?
        // - 한국타이어 와 금호타이어는 타이어 타입을 구현 했기 때문에


    }//main end
}//class end
