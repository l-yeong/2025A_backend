package 연습.view;

import 연습.controller.BookController;

public class BookView {
    //싱글톤
    private BookView(){}
    private static final BookView bookView = new BookView();
    public static BookView getBookview(){
        return bookView;
    }
    //싱글톤 호출
    public BookController bookController = BookController.getBookcontroller();
}
