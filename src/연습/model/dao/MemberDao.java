package 연습.model.dao;

import 연습.model.dto.MemberDto;
import 연습.view.MemberView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MemberDao {
    //싱글톤
    private MemberDao(){}
    private static final MemberDao memberDao = new MemberDao();
    public static MemberDao getMemberdao(){
        return memberDao;
    }
    //리스트 추가
    private ArrayList<MemberDto>memberDB=new ArrayList<>();
}
