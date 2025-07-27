package 종합.예제11.controller;

import 종합.예제11.model.dao.MarcketQnaDao;

public class MarcketQnaController {
    //싱글톤
    private MarcketQnaController(){}
    private static final MarcketQnaController marcketQnaController = new MarcketQnaController();
    public static MarcketQnaController getMarcketQnaController() {
        return marcketQnaController;
    }
    //싱글톤 호출
    MarcketQnaDao marcketQnaDao = MarcketQnaDao.getMarcketQnaDao();
} // MarcketQnaController end
