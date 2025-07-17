package team0715.model.dao;

import team0715.model.dto.BookDto;
import 종합.예제7.model.dto.BoardDto;

import java.util.ArrayList;

public class BookDao {
    private BookDao(){}
    private static final BookDao bookDao = new BookDao();
    public static BookDao getInstance(){
        return bookDao;
    }
    // 도서목록 리스트 DB
    private ArrayList<BookDto> bookDB = new ArrayList<>();
    //도서 등록
    public boolean BookPost(int bno, String btitle,String bname){
        boolean result=false;
        BookDto bookDto = new BookDto(btitle,bname);
        bookDB.add(bookDto);
        result=true;
        return result;
    }

    //도서목록
    public ArrayList<BookDto>getBookList(){
        return bookDB;
    }
}//dao end
