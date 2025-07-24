package 종합.예제11.view;

import 종합.예제11.controller.MarcketController;

public class MarcketView {
    //싱글톤
    private MarcketView(){}
    private static final MarcketView marcketView = new MarcketView();
    public static MarcketView getMarcketView(){
        return marcketView;
    }
    //싱글톤 호출
    MarcketController marcketController = MarcketController.getMarcketController();

}//class end
