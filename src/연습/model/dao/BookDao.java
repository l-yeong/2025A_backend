package 연습.model.dao;

import 연습.model.dto.BookDto;
import 연습.view.BookView;

import java.util.ArrayList;

public class BookDao {
    //싱글톤
    private BookDao(){}
    private static final BookDao bookDao = new BookDao();
    public static BookDao getBookdao(){
        return bookDao;
    }
    //리스트 추가
    private ArrayList<BookDto>bookDB = new ArrayList<>();
}
