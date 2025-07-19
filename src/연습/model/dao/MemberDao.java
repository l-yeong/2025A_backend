package 연습.model.dao;

import 연습.view.MemberView;

public class MemberDao {
    //싱글톤
    private MemberDao(){}
    private static final MemberDao memberDao = new MemberDao();
    public static MemberDao getMemberdao(){
        return memberDao;
    }
}
