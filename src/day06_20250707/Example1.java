package day06_20250707;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        /*
        [  배열 ]
        1)선언/생성
        1. 정의: *동일한* 자료형(타입)의 여러게 데이터를 순서대로 저장하는 타입
        2. 특징 1) 동일한 타입: 서로 다른 타입의 데이터를 같은 배열에 저장할 수 없다.
            (1) new 타입[길이]      , int[] 변수명= new int [3];
            (2) { 값1, 값2, 값3}   , double[] 변수명={3.14, 5.1, 78.67}
        2)
        */

        //[1] 배열 선언1: 선언만
        int [] array1=new int[3];

        //[2] 배열 선언2 : 선언과 초기화
        String[] array2={"봄","여름","가을","겨울"};

        //[3]
        System.out.println(array1); //[I@4c873330: 객체의 주소(컴퓨터가 사용하는 메모리 위치정보)값
        System.out.println(array2); //[Ljava.lang.String;@119d7047: 객체의 주소값

        //[4]
        System.out.println(Arrays.toString(array1));    //[0,0,0]: 배열내 요소값들을 문자열로
        System.out.println(Arrays.toString(array2));    //[봄,여름,가을,겨울]

        //[5]
        System.out.println(array1[0]); // 0
        System.out.println(array2[0]); // 봄

        //[6]
        System.out.println(array2.length); //배열내 길이 변환
        //[7]
        array1[0]=10;
        System.out.println(array1[0]);  // 10
        array2[0]="spring";
        System.out.println(array2[0]);  //spring


    } //main end
} // class end
