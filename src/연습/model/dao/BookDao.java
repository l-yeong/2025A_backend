package 연습.model.dao;

import 연습.view.BookView;

public class BookDao {
    private BookDao(){}
    private static final BookDao bookDao = new BookDao();
    public static BookDao getBookdao(){
        return bookDao;
    }
}
