package 종합.예제11;

import 종합.예제11.controller.MarcketController;
import 종합.예제11.model.dao.MarcketDao;
import 종합.예제11.view.MarcketView;

public class AppStart {
    public static void main(String[] args) {


        MarcketView.getMarcketView().mainView();

        //등록 테스트 (완)
        //MarcketController mc = new MarcketController();
        //boolean result = mc.marcketAdd("수강생","1234","키보드",12000,"테스트용","판매중");
        //System.out.println(result);

        //조회테스트 (완)
        //System.out.println(mc.marcketPrint());

        //수정테스트 (완)
        //boolean result = mc.marcketEdit("테스트",1,"테스트","테스트",32);
        //System.out.println(result);

        //삭제테스트 (완)
        //boolean result = mc.marcketDelete(null,31);
        //System.out.println(result);



    }//main end
}//class end