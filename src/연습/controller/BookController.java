package 연습.controller;

import 연습.model.dao.BookDao;
import 연습.view.BookView;

public class BookController {
    //싱글톤
    private BookController(){}
    private static final BookController bookController = new BookController();
    public static BookController getBookcontroller(){
        return bookController;
    }
    //싱글톤 호출
    public BookDao bookDao = BookDao.getBookdao();
}
