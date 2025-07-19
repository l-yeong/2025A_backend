package 종합과제.예제8_종합과제6.model.dto;

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

    // Setter 및 Getter
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
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
}
