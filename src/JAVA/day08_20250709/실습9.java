package day08_20250709;

import java.util.Scanner;

public class 실습9 {
    public static void main(String[] args) {
//        [JAVA] 실습9 : 클래스와 객체의생성자
//[ 문제 ] 아래 클래스와 생성자 관련 핵심 문제를 해결하시오.
//[ 제출방법 ] 코드가 작성된 파일이 위치한 깃허브 상세 주소를 제출하시오.
//
//[문제 1] Book 클래스를 만드세요. (title, author, price 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
//        1. Book 클래스에 title, author, price를 매개변수로 받아 멤버 변수를 초기화하는 생성자를 만드세요.
//        2. main 함수에서 이 생성자를 사용하여, ("이것이 자바다", "신용권", 30000) 정보와 ("자바의 정석", "남궁성", 28000) 정보를 가진 Book 객체 2개를 생성하고, 각 객체의 정보를 출력하세요.
        Book book1=new Book("이것이 자바다","신용권",30000);
        Book book2=new Book("자바의 정석","남궁성",28000);
        System.out.printf("%s %s %s \n",book1.title,book1.author,book1.price);
        System.out.printf("%s %s %s\n",book2.title,book2.author,book2.price);
//
//[문제 2] Pet 클래스를 만드세요. (name, species, age 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
//        1. Pet 클래스에 name, species, age를 매개변수로 받아 초기화하는 생성자를 만드세요.
//        2. main 함수에서 이 생성자를 사용하여, ("초코", "푸들", 3) 정보와 ("나비", "코리안숏헤어", 5) 정보를 가진 Pet 객체 2개를 생성하고, 각 객체의 프로필을 출력하세요.
        Pet pet1=new Pet("초코","푸들",3);
        Pet pet2=new Pet("나비","코리안숏헤어",5);
        System.out.printf("%s %s %d \n",pet1.name,pet1.species,pet1.age);
        System.out.printf("%s %s %d \n",pet2.name,pet2.species,pet2.age);

//
//[문제 3] Rectangle 클래스를 만드세요. (width, height 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
//        1. width와 height를 매개변수로 받아 초기화하는 생성자를 만드세요.
//        2. 사각형의 넓이(width * height)를 계산하여 반환하는 getArea() 메소드를 만드세요.
//        3. main 함수에서 (10, 5) 값을 가진 Rectangle 객체를 생성하고, getArea() 메소드를 호출하여 "사각형의 넓이: [넓이]"를 출력하세요.
        Rectangle rect=new Rectangle(10,5);
        int sum = rect.getArea();
        System.out.println(sum);

//
//[문제 4] BankAccount 클래스를 만드세요. (accountNumber, ownerName, balance 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
//        1. 세 멤버 변수를 모두 초기화하는 생성자를 만드세요.
//        2. 입금(deposit)과 출금(withdraw) 기능을 하는 메소드를 각각 만드세요.
//        3. main 함수에서 ("111-222-3333", "유재석", 10000) 정보로 객체를 생성한 뒤, 5000원을 입금하고 3000원을 출금한 후의 최종 잔액을 출력하세요.
        BankAccount bank1=new BankAccount("111-222-333","유재석",10000);

        bank1.deposit(5000);
        bank1.withdraw(3000);
        System.out.println("최종잔액:"+bank1.balance);

//[문제 5] Goods 클래스를 만드세요. (name, price 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
//        1. Goods 클래스에 생성자를 두 개 만드세요(오버로딩).
//        2. 기본 생성자: name은 "미정", price는 0으로 초기화
//        3. 매개변수가 있는 생성자: name과 price를 매개변수로 받아 초기화
//        4. main 함수에서 기본 생성자로 객체 하나, 매개변수가 있는 생성자로 ("콜라", 2000) 정보를 가진 객체 하나를 각각 생성하고, 두 객체의 정보를 모두 출력하세요.
        Goods good=new Goods();
        System.out.printf("%s %d\n",good.name,good.price);

        Goods goods=new Goods("콜라",2000);
        System.out.printf("%s,%d\n",goods.name,goods.price);
//
//[문제 6] Member 클래스를 만드세요. (id, isLogin 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
//        1. Member 클래스에 기본 생성자를 만들고, 이 생성자 안에서 id는 "guest", isLogin은 false로 초기화되도록 하세요.
//        2. main 함수에서 new Member()로 객체를 생성하고, 초기화된 id와 isLogin 값을 출력하여 확인하세요.

        Member member=new Member();
        System.out.println(member.id+"\t"+member.isLogin);

//
//[문제 7] Television 클래스를 만드세요. (channel, volume 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
//        1. channel과 volume을 매개변수로 받아 초기화하는 생성자를 만드세요.
//        2. main 함수에서 (채널 7, 볼륨 20) 상태를 가진 Television 객체를 생성하고, 해당 객체의 정보를 출력하세요.
        Television television=new Television(7,20);
        System.out.printf("채널 %d ,볼륨 %d \n",television.channel,television.volume);
//
//[문제 8] Player 클래스를 만드세요. (name, power, speed 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
//        1. 세 멤버 변수를 모두 초기화하는 생성자를 만드세요.
//        2. main 함수에서 이 생성자를 사용하여, ("손흥민", 90, 95) 정보를 가진 객체와 ("이강인", 85, 92) 정보를 가진 객체를 생성하세요.
//        3. 두 객체의 정보를 각각 출력하여 확인하세요.

        Player player1=new Player("손흥민",90,95);
        Player player2=new Player("이강인",85,92);

        System.out.printf("%s %d %d \n",player1.name,player1.power,player1.speed);
        System.out.printf("%s %d %d \n",player2.name,player2.power,player2.speed);
//
//[문제 9] MenuItem 클래스를 만드세요. (name, price, isSignature 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
//        1. 세 멤버 변수를 모두 초기화하는 생성자를 만드세요.
//        2. main 함수에서 이 생성자를 사용하여 "김치찌개", 8000, true 정보를 가진 객체를 생성하고, isSignature가 true인지 확인한 후 "[대표메뉴] 김치찌개 : 8000원" 형식으로 출력하세요.
        MenuItem menuItem =new MenuItem("김치찌개",8000,true);
        System.out.println("MenuItem \t"+menuItem.isSignature);
        System.out.printf("[대표메뉴]%s :  %d원 \n",menuItem.name,menuItem.price);
//
//[문제 10] UserProfile 클래스를 만드세요. (name, age, mbti 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
//        1. 세 멤버 변수를 모두 초기화하는 생성자를 만드세요.
//        2. Scanner를 사용하여 사용자로부터 이름, 나이, MBTI를 입력받으세요.
//        3. 입력받은 값들을 사용하여 UserProfile 객체를 생성하고, 저장된 모든 정보를 출력하세요.
        Scanner scan=new Scanner(System.in);

        System.out.print("이름:");
        String name= scan.next();
        System.out.print("나이:");
        int age= scan.nextInt();
        System.out.print("MBTI:");
        String mbti= scan.next();

        UserProfile userProfile=new UserProfile(name,age,mbti);
        userProfile.name=name;
        userProfile.age=age;
        userProfile.mbti=mbti;

        System.out.printf("%s %d %s",name,age,mbti);

    }
}
//1번 클래스
class Book{
    String title;
    String author;
    int price;
    Book(String title,String author, int price){
        this.title=title;
        this.author = author;
        this.price=price;
    }
}
//2번 클래스
class Pet{
    String name;
    String species;
    int age;
    Pet(String name, String species, int age){
        this.name=name;
        this.species=species;
        this.age=age;
    }
}
//3번 클래스
class Rectangle{
    int width;
    int height;

    Rectangle(int width , int height){
        this.width=width;
        this.height=height;
    }
    int getArea(){
        int sum =width * height;
        return sum;
    }
}
//4번 클래스
class BankAccount{
    String accountNumber;
    String ownerName;
    int balance;

    BankAccount(String accountNumber,String ownerName,int balance){
        this.accountNumber=accountNumber;
        this.ownerName=ownerName;
        this.balance=balance;
    }
    boolean deposit(int money){
        this.balance +=money;
        return true;
    }
    int withdraw(int money){
        this.balance -=money;
        return balance;
    }
}
//5번 클래스
class Goods{
    //멤버변수
    String name;
    int price;

    Goods(){
        name="미정";
        price=0;
    }
    Goods(String name,int price){
        this.name=name;
        this.price=price;
    }
}
//6번 클래스
class Member{
        String id;
    boolean isLogin;

        Member(){
        id = "Guest";
        isLogin=false;
    }
}
//7번 클래스
class Television{
    int channel;
    int volume;

    Television(int channel, int volume){
        this.channel=channel;
        this.volume=volume;
    }
}
//8번 클래스
class Player{
    String name;
    int power;
    int speed;
    Player(String name, int power, int speed){
        this.name=name;
        this.power=power;
        this.speed=speed;
    }
}
//9번 클래스
class MenuItem{
    String name;
    int price;
    boolean isSignature;
    MenuItem(String name,int price,boolean isSignature){
        this.name=name;
        this.price=price;
        this.isSignature=isSignature;
    }
}
//10번 클래스
class UserProfile{
    String name;
    int age;
    String mbti;

    UserProfile(String name, int age, String mbti){
        this.name=name;
        this.age=age;
        this.mbti=mbti;
    }
}