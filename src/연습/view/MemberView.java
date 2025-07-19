package 연습.view;

import 연습.controller.MemberController;

public class MemberView {
    //싱글톤
    private MemberView(){}
    private static final MemberView memberView = new MemberView();
    public static MemberView getMemberview(){
        return memberView;
    }
    //싱글톤 호출
    public MemberController memberController = MemberController.getMemberController();

}
