package 연습.model.dao;

import 연습.view.LoanView;

public class LoanDao {
    private  LoanDao(){}
    private static final LoanDao loanDao = new LoanDao();
    public  static LoanDao getLoandao(){
        return loanDao;
    }
}
