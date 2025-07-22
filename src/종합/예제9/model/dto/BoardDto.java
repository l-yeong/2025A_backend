package 종합.예제9.model.dto;

public class BoardDto {
    //멤버변수
    private String content;
    private String writer;

    //기본생성자
    public  BoardDto(){}
    //풀생성자
    public BoardDto(String content, String writer) {
        this.content = content;
        this.writer = writer;
    }

    // Setter 및 Getter
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    //toString
    @Override
    public String toString() {
        return "BoardDto{" +
                "content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}
