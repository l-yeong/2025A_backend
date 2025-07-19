package 연습.controller;

import 연습.model.dao.MemberDao;
import 연습.view.MemberView;

public class MemberController {
    //싱글톤
    private MemberController(){}
    private static final MemberController memberController = new MemberController();
    public static MemberController getMemberController(){
        return memberController;
    }
    //싱글톤 호출
    public MemberDao memberDao = MemberDao.getMemberdao();
}
