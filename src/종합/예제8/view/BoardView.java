package 종합.예제8.view;

public class BoardView {
    private BoardView(){}
    private static final BoardView boardview = new BoardView();
    public static BoardView getBoardview(){
        return boardview;
    }

}
