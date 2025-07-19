package 연습.controller;

import 연습.model.dao.LoanDao;
import 연습.view.LoanView;

public class LoanController {
    //싱글톤
    private  LoanController(){}
    private static final LoanController loanController = new LoanController();
    public  static LoanController getLoancontroller(){
        return loanController;
    }
    //싱글톤 호출
    public LoanDao loanDao = LoanDao.getLoandao();
}
