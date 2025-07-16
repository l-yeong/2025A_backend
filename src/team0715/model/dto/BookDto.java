package team0715.model.dto;

import day09_20250710.package1.B;

public class BookDto {
    //멤버변수
    private static int nextBno = 1;
    private  int bno;
    private String btitle; //도서명
    private String bname; // 저자


    //기본생성자
    public  BookDto(){}

    //풀생성자
    public  BookDto( String btitle, String bname) {
        this.bno = nextBno;
        this.btitle = btitle;
        this.bname = bname;
    }

   public BookDto(int bno){
       this.bno = nextBno;
   }

    //bno Getter 및 Setter
    public int getBno() {
        return bno;
    }

    //메소드
    public void setBno(int bno) {
        this.bno = bno;
    }

    //btitle Getter 및 Setter
    public String getBtitle() {
        return btitle;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    //bname Getter 및 Setter
    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }


    //toString


    @Override
    public String toString() {
        return "BookDto{" +
                "bno=" + bno +
                ", btitle='" + btitle + '\'' +
                ", bname='" + bname + '\'' +
                '}';
    }
}
