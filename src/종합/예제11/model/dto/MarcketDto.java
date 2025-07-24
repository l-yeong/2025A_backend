package 종합.예제11.model.dto;

public class MarcketDto {
    //멤버변수
    private int kno;        //판매번호
    private int kprice;     //판매가격
    private String kseller; //판매자
    private String kpwd;    //비밀번호
    private String kitem;   //물품
    private String ktext;   //설명
    private String Status;  //상태
    private String date;    //날짜

    //기본생성자
    public MarcketDto(){}

    //수정 및 삭제 사용할 생성자
    public MarcketDto(int kno, String kpwd){
        this.kno=kno;
        this.kpwd=kpwd;
    }
    //풀생성자
    public MarcketDto(int kno, int kprice, String kseller, String kpwd, String kitem, String ktext, String status, String date) {
        this.kno = kno;
        this.kprice = kprice;
        this.kseller = kseller;
        this.kpwd = kpwd;
        this.kitem = kitem;
        this.ktext = ktext;
        Status = status;
        this.date = date;
    }

    public int getKno() {
        return kno;
    }

    public void setKno(int kno) {
        this.kno = kno;
    }

    public int getKprice() {
        return kprice;
    }

    public void setKprice(int kprice) {
        this.kprice = kprice;
    }

    public String getKseller() {
        return kseller;
    }

    public void setKseller(String kseller) {
        this.kseller = kseller;
    }

    public String getKpwd() {
        return kpwd;
    }

    public void setKpwd(String kpwd) {
        this.kpwd = kpwd;
    }

    public String getKitem() {
        return kitem;
    }

    public void setKitem(String kitem) {
        this.kitem = kitem;
    }

    public String getKtext() {
        return ktext;
    }

    public void setKtext(String ktext) {
        this.ktext = ktext;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    //toString
}//class end
