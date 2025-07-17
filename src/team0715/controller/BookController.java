package team0715.controller;

import team0715.model.dao.BookDao;
import team0715.model.dto.BookDto;
import 종합.예제7.model.dto.BoardDto;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BookController {
    private BookController(){}
    private static final BookController bookController = new BookController();
    public static BookController getInstance(){
        return bookController;
    } //public static BookController end
    private BookDao bookDao = BookDao.getInstance();

    //도서 등록
    public boolean BookPost(int bno,String btitle, String bname){
        boolean result=false;
        result=bookDao.BookPost(bno,btitle,bname);
        return  result;
    }

    //도서 목록
    public ArrayList<BookDto>getBookList(){
        return bookDao.getBookList();
    }
}
