package 종합과제.예제10_종합과제8.model.dto;

public class WaitingDto {
    //멤버변수
    private int wno;
    private String wphone;
    private int wcount;

    //기본생성자
    public WaitingDto() {}
    //풀생성자
    public WaitingDto(int wno, String wphone, int wcount) {
        this.wno = wno;
        this.wphone = wphone;
        this.wcount = wcount;
    }//풀생성자 end

    // Setter 및 Getter
    public int getWno() {
        return wno;
    }

    public void setWno(int wno) {
        this.wno = wno;
    }

    public String getWphone() {
        return wphone;
    }

    public void setWphone(String wphone) {
        this.wphone = wphone;
    }

    public int getWcount() {
        return wcount;
    }

    public void setWcount(int wcount) {
        this.wcount = wcount;
    }

    //toString
    @Override
    public String toString() {
        return "WaitingDto{" +
                "wno=" + wno +
                ", wphone='" + wphone + '\'' +
                ", wcount=" + wcount +
                '}';
    }
}//class end
