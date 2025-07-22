package 종합과제.예제9_종합과제7.model.dao;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import 종합과제.예제9_종합과제7.model.dto.WaitingDto;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class WaitingDao {
    //싱글톤
    private WaitingDao() {
        openWaitingCSV(); //CSV 오픈
    }

    private static final WaitingDao waitingDao = new WaitingDao();

    public static WaitingDao getWaitingDao() {
        return waitingDao;
    }

    //DB 대체용
    ArrayList<WaitingDto> waitingDB = new ArrayList<>();

    //등록 메소드
    public boolean addWaiting(WaitingDto waitingDto) {
        waitingDB.add(waitingDto);
        saveWaitingCSV(); // *CSV 저장
        return true;
    } //addWaiting func end

    //조회 메소드
    public ArrayList<WaitingDto> waitingList() {
        return waitingDB;
    } //waitingList end


    //경로파일 지정
    private String WaitingPath = "src/종합과제/예제9_종합과제7/waiting.csv";

    //--------------------------------1. CSV 파일 연동 함수 ----------------------------------------
    public void openWaitingCSV() {
        try {
            // (1)파일 객체 생성한다
            File file = new File(WaitingPath);
            // (2)만약에 파일이 존재하면 정보 불러오기
            if (file.exists()) {
                    loadWaitingCSV();
                // (2)아니면 파일 생성 .createNewFile(); 지정한 경로에 파일 생성 함수
            } else {
                //파일 생성
                file.createNewFile();
            }//if end
        } catch (Exception e) {
            System.out.println(e);
        }// try,catch end
    } // openWaitingCSV func end
    //--------------------------------2. CSV 파일 입력 함수 ----------------------------------------
    public void loadWaitingCSV(){
        try {
            // (1) FileReader 이용한 읽기모드 객체 생성
            FileReader fileReader = new FileReader(WaitingPath);
            // (2) CSVReader 에 FileReader 대입하여 CSV객체 생성
            CSVReader csvReader = new CSVReader(fileReader);
            // (3) .readAll() 함수로 모든 CSV 정보를 읽어온다.
            List<String[]> inData = csvReader.readAll();
            // 향상된 for문 (4) 반복문이
            for (String[] row : inData) {
                String phone = row[0];
                int count = Integer.parseInt(row[1]);
                // (5) 각 열들을 하나의 dto로 생성
                WaitingDto waitingDto = new WaitingDto(phone, count);
                // (6)생성은 dto를 리스트에 저장
                waitingDB.add(waitingDto);
            }//for end
            // (7) csvReader 안전하게 닫기(메모리 누수 방지) : 파일(용량크다)객체는 자동 초기화 보단 직접 초기화 안전
            csvReader.close();
        } catch (Exception e) {System.out.println(e);
        }//try,catch end
    } //loadWaitingCSV end
    //--------------------------------3. CSV 파일 출력 함수 ----------------------------------------
    public void saveWaitingCSV(){
        try {
            // (1) FileWriter 파일 쓰기 모드 객체 생성
            FileWriter fileWriter = new FileWriter(WaitingPath);
            // (2) CSVWiter 에 fileWriter 객체를 대입 하여 생성
            CSVWriter csvWriter = new CSVWriter(fileWriter);
            // (3) 빈 리스트 생성
            List<String[]> outData = new ArrayList<>();
            // (4) 현재 모든 정보를 outdata에 담아준다
            for (WaitingDto waitingDto : waitingDB) {
                // (5) dto 하나씩 내용과 작성자를 배열 으로 구성
                String[] row = {waitingDto.getPhone(), Integer.toString(waitingDto.getCount())};
                //(6) outData에 저장한다
                outData.add(row);
            }//for end
            //(7) 최종적으로 outData를 CSV 내보내기 한다.
            csvWriter.writeAll(outData);
            //(8)안전하게 객체 닫기
            csvWriter.close();
        } catch (Exception e) {
            System.out.println(e);
        }//try,catch end

    }// saveWaitingCSV end
}//class end
