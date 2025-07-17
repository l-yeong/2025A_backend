package team0715.model.dao;

import team0715.model.dto.BookDto;
import team0715.model.dto.LoanDto;

public class LoanDao {//class s
    private LoanDao(){}
    private static final LoanDao loanDao = new LoanDao();
    public static LoanDao getInstance(){
        return loanDao;
    } //public static LoanDao end

    public boolean BookLoan(int bno){
        boolean result=false;
        LoanDto loanDto = new LoanDto();
        result=true;
        return result;
    }

}//class e
