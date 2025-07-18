package 종합.예제8.model.Dao;

public class BoardDao {
    private  BoardDao(){}
    private static final BoardDao boarddao = new BoardDao();
    public  static BoardDao getBoarddao(){
        return boarddao;
    }

}
