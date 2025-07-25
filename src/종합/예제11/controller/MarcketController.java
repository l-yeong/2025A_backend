package 종합.예제11.controller;


import 종합.예제11.model.dao.MarcketDao;
import 종합.예제11.model.dto.MarcketDto;

import java.util.ArrayList;

public class MarcketController {
    //싱글톤
    public MarcketController(){}
    private static final MarcketController marcketController = new MarcketController();
    public static MarcketController getMarcketController(){
        return marcketController;
    }

    //싱글톤 호출
    MarcketDao marcketDao = MarcketDao.getMarcketDao();

    //등록
    public boolean marcketAdd(String kseller,String kpwd,String kitem,int kprice,String ktext,String kstatus){
        MarcketDto marcketDto = new MarcketDto(0,kprice,kpwd,kitem,kseller,ktext,kstatus,null);
        boolean resultAdd = marcketDao.marketAdd(marcketDto);
        return resultAdd;
    }//marcket end

    //조회
    public ArrayList<MarcketDto> marcketPrint(){
        ArrayList<MarcketDto> resultPrint = marcketDao.marcketPrint();
        return resultPrint;
    }//marcketPrint end

    //수정
    public boolean marcketEdit(String kitem, int kprice,String ktext, String kstatus,int kno,String kpwd){
        MarcketDto marcketDto = new MarcketDto(kno,kprice,null,kpwd,kitem,ktext,kstatus,null);
        boolean reaultEdit = marcketDao.marcketEdit(marcketDto);
        return reaultEdit;
    }//marcketEdit end

    //삭제
    public boolean marcketDelete(String kpwd,int kno){
        MarcketDto marcketDto = new MarcketDto(kno,kpwd);
        boolean resultDelete = marcketDao.marcketDelete(marcketDto);
        return resultDelete;
    }
}//class end
