package 종합.예제7.종합과제5.model.dto;


public class WaitingDto {
    //멤버변수
    private String phone;
    private int count;

    //기본생성자
    public WaitingDto(){}

    //풀생성자
    public WaitingDto(String phone,int count){
        this.phone=phone;
        this.count=count;
    }

    //getter and setter
    public String getPhone() { // 객체의 phone 데이터값을 getPhone 메소드 호출
        return phone;
    }

    public void setPhone(String phone) { // 객체의 phone 데이터값을 setPhone 메소드 저장
        this.phone = phone;
    }

    public int getCount() { //객체의 count 데이터값을 getCount 메소드 호출
        return count;
    }

    public void setCount(int count) { // 객체의 count 데이터값을 setCount 메소드 저장
        this.count = count;
    }

    //toString

    @Override
    public String toString() {
        return "WaitingDto{" +
                "phone='" + phone + '\'' +
                ", count=" + count +
                '}';
    }
}//class end
