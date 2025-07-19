package 연습.model.dao;

import 연습.model.dto.LoanDto;
import 연습.view.LoanView;

import java.util.ArrayList;

public class LoanDao {
    //싱글톤
    private  LoanDao(){}
    private static final LoanDao loanDao = new LoanDao();
    public  static LoanDao getLoandao(){
        return loanDao;
    }
    //리스트추가
    private ArrayList<LoanDto>loanDB= new ArrayList<>();
}

