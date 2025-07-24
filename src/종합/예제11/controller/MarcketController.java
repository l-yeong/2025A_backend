package 종합.예제11.controller;

import 종합.예제11.model.dao.MarcketDao;
import 종합.예제11.model.dto.MarcketDto;

public class MarcketController {
    //싱글톤
    private MarcketController(){}
    private static final MarcketController marcketController = new MarcketController();
    public static MarcketController getMarcketController(){
        return marcketController;
    }

    //싱글톤 호출
    MarcketDao marcketDao = MarcketDao.getMarcketDao();

    //등록
    public boolean marcketAdd(String kseller,String kpwd,String kitem,int kprice,String ktext){
        MarcketDto marcketDto = new MarcketDto(0,kprice,kpwd,kitem,kseller,ktext);
        boolean resultAdd = marcketDao.marketAdd(marcketDto);
        return resultAdd;
    }//marcket end
}//class end
