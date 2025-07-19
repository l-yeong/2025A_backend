package 연습.view;

import 연습.controller.LoanController;
import 연습.model.dao.LoanDao;

public class LoanView {
    //싱글톤
    private  LoanView(){}
    private static final LoanView loanView = new LoanView();
    public  static LoanView getLoanview(){
        return loanView;
    }
    //싱글톤 호출
    public LoanController loanController= LoanController.getLoancontroller();
}
