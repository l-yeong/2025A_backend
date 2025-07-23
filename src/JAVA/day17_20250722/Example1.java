package JAVA.day17_20250722;

//import au.com.bytecode.opencsv.CSVReader;

import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {

        //OpenSCV 라이브러리 사용해보기 : 목적:  CSV 규칙에 따른 자동 분해/분리
            //1. new CSVReader( new FileReader(파일경로)) : CSV 읽어오는 클래스
                // --> .readAll() : 데이터를 List<String[]> 타입으로 반환 하는 함수

            //2. new CSVWriter(new FileWriter(파일경로)) : CSV 출력하는 클래스
                // --> .writerAll(List객체) : List객체를 CSV로 내보내는 함수

        //try {
        //    String path = "src/day17_20250722/인천광역시 부평구_맛있는 집(맛집) 현황_20240801.csv"; //1. 파일 경로 지정
        //    FileReader fileReader = new FileReader(path, Charset.forName("EUC-KR"));       //2. 파일 읽기모드 객체 생성, 예외처리, 한글 인코딩(번역)
        //    CSVReader csvReader = new CSVReader(fileReader);    //3. CSVReader 클래스 이용한 file 읽어오기
        //    List<String[]> inData = csvReader.readAll();        //4. .readAll() : List<String[]>반환
        //        // List 인터페이스 타입 : ArrayList 구현체
        //    System.out.println(inData);
        //
        //    for(int i=0; i< inData.size(); i++) {// 5.방복문 이용한 순회
        //        String[] row = inData.get(i);
        //        System.out.printf("업소명: [%s], 지정메뉴: [%s] \n",row[1],row[3]);
        //    }
        //
        //
        //} catch (Exception e) {
        //    System.out.println(e);
        //}



    } //main end
} // class end
