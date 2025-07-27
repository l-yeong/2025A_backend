package 종합.예제11.model.dto;

public class MarcketQnaDto {

    //멤버변수
    private int qno;
    private int kno;
    private String qname;
    private String qnacontent;
    private String qpwd;
    private String date;

    //기본생성자
    public MarcketQnaDto() {}

    //풀생성자
    public MarcketQnaDto(int qno, int kno, String qname, String qnacontent, String qpwd, String date) {
        this.qno = qno;
        this.kno = kno;
        this.qname = qname;
        this.qnacontent = qnacontent;
        this.qpwd = qpwd;
        this.date = date;
    }

    //Setter 및 getter
    public int getQno() {
        return qno;
    }

    public void setQno(int qno) {
        this.qno = qno;
    }

    public int getKno() {
        return kno;
    }

    public void setKno(int kno) {
        this.kno = kno;
    }

    public String getQname() {
        return qname;
    }

    public void setQname(String qname) {
        this.qname = qname;
    }

    public String getQnacontent() {
        return qnacontent;
    }

    public void setQnacontent(String qnacontent) {
        this.qnacontent = qnacontent;
    }

    public String getQpwd() {
        return qpwd;
    }

    public void setQpwd(String qpwd) {
        this.qpwd = qpwd;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    //toString

    @Override
    public String toString() {
        return "MarcketQnaDto{" +
                "qno=" + qno +
                ", kno=" + kno +
                ", qname='" + qname + '\'' +
                ", qnacontent='" + qnacontent + '\'' +
                ", qpwd='" + qpwd + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
} // MarcketQnaDto end
