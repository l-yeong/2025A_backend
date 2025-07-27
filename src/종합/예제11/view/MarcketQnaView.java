package 종합.예제11.view;

import 종합.예제11.controller.MarcketQnaController;

public class MarcketQnaView {
    //싱글톤
    private MarcketQnaView(){}
    private static final MarcketQnaView marcketQnaView = new MarcketQnaView();
    public static MarcketQnaView getMarcketQnaView(){
        return marcketQnaView;
    }
    //싱글톤 호출
   MarcketQnaController marcketQnaController = MarcketQnaController.getMarcketQnaController();

} // MarcketQnaView end
