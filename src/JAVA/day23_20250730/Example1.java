package JAVA.day23_20250730;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        /*
        인터페이스: 추상메소드 가진 타입
        추상메소드: 메소드를 선언만 하고 구현부{}를 정의하지 않은 메소드
        구현체: 추상메소드를 가진 인터페이스 implements 해서 추상메소드를 구현한 클래스의 객체
        ** 다형성 **: 다양한 타입을 가지는 성질, extends / implements 키워드 구조관계
        [ 컬렉션 프레임워크 ]
            - 컬렉션(수집) 프레임(툴) 워크(작업): 자료수집 방법 (=자료구조)
            - 종류: List, set, Map 인터페이스
            - 구현체:
                1) List: ArrayList, Vector, LinkedList 등
                    .add([인덱스],자료)
                    .set(인덱스,자료)
                2) Set: HashSet, TreeSet 등
                3) Map: HashMap, TableMap 등
        */
        // [1] 인터페이스타입 변수명 = new 클래스명();
        ArrayList<String> list1 = new ArrayList<>();    // (1)
        List<String> list2 = new ArrayList<>();         // (2)

        // [2] List 인터페이스 주요 메소드

            //1) .add(자료): 리스트내 지정한 자료를 마지막 요소 추가
        list2.add("유재석");
        list2.add("강호동");
        list2.add("신동엽");
        list2.add("유재석"); //중복허용
        list2.add(2,"서장훈"); //리스트내 지정한 인덱스의 자료를 수정
        System.out.println(list2);

            //2) .set(인덱스,자료): 리스트내 지정한 인덱스의 자료 수정/변경
        list2.set(1,"유재석2");
        System.out.println(list2);
            //3) .set(인덱스): 리스트내 지정한 인덱스의 자료 호출/반환
        String result = list2.get(3);
        System.out.println(result);
            //4) .size(): 리스트내 전체 요소/자료 개수 반환
        int count = list2.size();
        System.out.println(count);
            //5) .contains(자료): 리스트내 지정한 자료가 존재하면 true, 없으면 false
        boolean bool = list2.contains("서장훈");
        System.out.println(bool);
            //6) .indexOf(자료): 리스트내 지정한 자료의 인덱스 반환, 없으면 -1
        int index=list2.indexOf("서장훈");
        System.out.println(index);
            //7) .remove(인덱스): 리스트내 지정한 인덱스의 요소/항목 삭제
        list2.remove(2); //2번(서장훈)인덱스
        System.out.println(list2);
    }//main end
}//class end
