package day16_20250721;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class 실습15 {
    public static void main(String[] args) {
//
//        [JAVA] 실습15 : 파일 처리 (개정판)
//                [ 문제 ] 아래 파일 처리 관련 문제를 해결하시오.
//[ 제출방법 ] 코드가 작성된 파일이 위치한 깃허브 상세 주소를 제출하시오.
//
//[문제 1] 파일에 일기 쓰기
//        1. FileOutputStream을 사용하여 src 폴더 내에 src/diary.txt 파일을 생성하세요.
//        2. "오늘 날씨는 맑았다. 자바 공부는 재미있다." 라는 문자열을 바이트로 변환하여 파일에 쓰세요.
//        3. try-catch를 사용하여 예외 처리하세요.

        try { // (3) 예외처리 하기
            String path ="src/day16_20250721/diary.txt"; // (1) 파일 경로 설정

            FileOutputStream diaryOut = new FileOutputStream(path); // (2) 파일 출력 객체 생성 * 무조건 일반 예외 발생
            //(4) 파일에 쓰기
            diaryOut.write("오늘 날씨는 맑았다. 자바 공부는 재미있다.".getBytes());
        }catch (Exception e){
            System.out.println(e);
        }



//[문제 2] 파일에 작성된 일기 읽기
//        1. FileInputStream을 사용하여 문제 1에서 생성한 src/diary.txt 파일을 읽어오세요.
//        2. 읽어온 바이트 데이터를 String으로 변환하여 콘솔에 출력하세요.
        try { // (4) 모든코드에 예외 처리
            String path = "src/day16_20250721/diary.txt";
            File file = new File(path);
            System.out.println("[문제2확인용]"+file.exists()); // (1) 파일 존재 여부 확인

            if (file.exists()) { // (2) 파일이 존재 할경우
                FileInputStream diayIn = new FileInputStream(path); // (3) 파일 입력 객체 생성
                byte[] inByte = new byte[(int)file.length()]; // (5) 읽어온 바이트를 저장할 바이트 배열 용량 만큼 선언
                diayIn.read(inByte); // (6) 바이트 읽어오기
                String diary = new String(inByte); // (7) 읽어온 바이트를 문자열로 변환
                System.out.println(diary);
            } // if end
        }catch (Exception e){
            System.out.println("예외발생"+e);
        } // try,catch end

//
//[문제 3] File 클래스로 파일 정보 확인하기
//        1. File 객체를 src/diary.txt 경로로 생성하세요.
//        2. .exists(), .getPath(), .getName(), .length() 메소드를 각각 사용하여 해당 파일의 존재 여부, 경로, 이름, 크기(바이트)를 출력하세요.
        String path = "src/day16_20250721/diary.txt";
        File diary = new File(path);
        System.out.println("[문제3]"+diary.exists());     //true
        System.out.println("[문제3]"+diary.getPath());    //src\day16_20250721\diary.txt
        System.out.println("[문제3]"+diary.getName());    //diary.txt
        System.out.println("[문제3]"+diary.length());     //58
//
//[문제 4] 방문 로그 누적 기록하기
//        1. FileOutputStream을 사용하여 src/visit_log.txt 파일을 여세요.
//        2. Scanner로 방문자 이름을 입력받아, "OOO님이 방문했습니다.\n" 형식의 문자열을 visit_log.txt 파일의 기존 내용 뒤에 추가하세요.
//        3. 프로그램을 여러 번 실행하여 방문 기록이 계속 누적되는지 확인하세요.
//        Scanner scan=new Scanner(System.in);
//
//        try {
//            // 쓰기
//            // (1) 키보드로부터 아무거나 입력 받기
//            System.out.print("[4번문제] 방문자 이름 입력: ");
//            String vname = scan.nextLine();
//
//            // (2) 파일의 경로 지정
//            String visitOutPath ="./src/day16_20250721/visit_log.txt";
//            // (3) 파일 쓰기 객체
//            FileOutputStream visitOutLog = new FileOutputStream(visitOutPath,true);
//            // 추가 방문 했습니다
//            String bname = vname+" 님이 방문 했습니다. \n";
//            // (4) 입력받은 문자열을 바이트 변환
//            byte[] outVisit = bname.getBytes();
//            // (5) 변환된 바이트를 내보내기
//            visitOutLog.write(outVisit);
//
//            //호출
//            // (1) 파일 존재 여부 확인
//            String visiInPath ="./src/day16_20250721/visit_log.txt";
//            File file = new File(visiInPath);
//            //System.out.println(file.exists());
//            // (2) 파일이 존재할 경우
//            if(file.exists()){
//                // (3) 파일 입력 객체 생성
//                FileInputStream visitInlog = new FileInputStream(visiInPath);
//                // (4) 읽어왔을때 바이트들을 저장할 바이트 배열 선언
//                byte[] inVisit = new byte[(int)file.length()];
//                // (5) 읽어오기
//                visitInlog.read(inVisit);
//                //(6) 읽어온 바이트배열을 문자열로 변환
//                String visit = new String(inVisit);
//                System.out.println("[4번문제] 방문자:"+visit);
//            } //if end
//
//        }catch (Exception e){
//            System.out.println("[4번문제] 예외발생"+e);
//        } //try, catch end

//
//[문제 5] 연락처를 CSV 형식으로 파일에 저장하기
//        1. Scanner를 사용하여 사용자로부터 이름, 전화번호, 사는 도시를 순서대로 입력받으세요.
//        2. 입력받은 데이터들을 쉼표(,)로 연결하여 하나의 String으로 만드세요. (예: "유재석,010-1234-5678,서울")
//        3. 해당 문자열을 contacts.csv 파일에 저장하세요. (줄바꿈 문자 \n 포함)

        //try {
        //
        //    // 쓰기
        //    // (1) 키보드로부터 아무거나 입력 받기
        //    System.out.print("[5번문제] 이름: ");
        //    String name = scan.next();
        //    System.out.print("[5번문제] 전화번호: ");
        //    String phone = scan.next();
        //    System.out.print("[5번문제] 사는 도시: ");
        //    String city = scan.next();
        //
        //    // (2) 파일의 경로 지정
        //    String contactsOutPath = "./src/day16_20250721/contacts.csv";
        //
        //    // (3) 파일 쓰기 객체
        //    FileOutputStream contactsOut = new FileOutputStream(contactsOutPath);
        //
        //    // 추가 수정 중간에 쉼표 넣기
        //    String contactComma = name+","+phone+","+city;
        //
        //    // (4) 입력받은 문자열을 바이트 변환
        //    byte[] outContacts = contactComma.getBytes();
        //
        //    // (5) 변환된 바이트를 내보내기
        //    contactsOut.write(outContacts);
        //
        //    //호출
        //    // (1) 파일 존재 여부 확인
        //    String contactsInPath = "./src/day16_20250721/contacts.csv";
        //    File file = new File(contactsInPath);
        //    //System.out.println("[5번문제 파일 존재 여부]"+file.exists());
        //    // (2) 파일이 존재할 경우
        //    if(file.exists()){
        //        // (3) 파일 입력 객체 생성
        //        FileInputStream contactsIn = new FileInputStream(contactsInPath);
        //
        //        // (4) 읽어왔을때 바이트들을 저장할 바이트 배열 선언
        //        byte[] inByte=  new byte[(int)file.length()];
        //        // (5) 읽어오기
        //        contactsIn.read(inByte);
        //        // (6) 읽어온 바이트배열을 문자열로 변환
        //        String contacts = new String(inByte);
        //        System.out.println(contacts);
        //    }
        //}catch (Exception e){
        //    System.out.println("[5번문제]예외발생"+e);
        //} //try,catch end

//
//[문제 6] 영화 감상평을 파일에 저장하기
//        1. Scanner를 사용하여 사용자로부터 좋아하는 영화 제목과 감상평을 한 줄로 입력받으세요.
//        2. 입력받은 내용을 src 폴더 내의 src/movie_review.txt 파일에 저장하세요.
//
//        try {
//            // 쓰기
//            // (1) 키보드로부터 아무거나 입력 받기
//            System.out.print("[6번문제] 영화 제목: ");
//            String title = scan.nextLine();
//            System.out.print("[6번문제] 영화 감상평: ");
//            String content = scan.nextLine();
//            // (2) 파일의 경로 지정
//            String movieOutPath = "./src/day16_20250721/movie_review.txt";
//
//            // (3) 파일 쓰기 객체
//            FileOutputStream movieOut = new FileOutputStream(movieOutPath);
//
//            // 저장 이쁘게 하기
//            String movieReview = "영화제목 : "+title+"\n"+"영화 감상평 : "+content;
//
//            // (4) 입력받은 문자열을 바이트 변환
//            byte[] moiveOut = movieReview.getBytes();
//
//            // (5) 변환된 바이트를 내보내기
//            movieOut.write(moiveOut);
//        }catch (Exception e){
//            System.out.println("[6번문제]예외발생"+e);
//        } //try,catch end

//
//[문제 7] 저장된 감상평 파일 읽기
//        1. 문제 3에서 생성된 src/movie_review.txt 파일의 내용을 읽어오세요.
//        2. File 클래스의 .length()를 사용하여 파일 크기만큼 바이트 배열을 선언하고, 파일 전체를 한 번에 읽어오세요.
//        3. 읽어온 내용을 콘솔에 출력하세요.
//        try {
//            //호출
//            // (1) 파일 존재 여부 확인
//            String movieInPath = "./src/day16_20250721/movie_review.txt";
//            File file = new File(movieInPath);
//            System.out.println("[7번문제] 파일 확인 여부:"+file.exists());
//            System.out.println("[7번문제] 파일 용량 확인 :"+file.length());
//
//            // (2) 파일이 존재할 경우
//            if(file.exists()){
//                // (3) 파일 입력 객체 생성
//                FileInputStream movieIn = new FileInputStream(movieInPath);
//                // (4) 읽어왔을때 바이트들을 저장할 바이트 배열 선언
//                byte[] inByte = new byte[64];
//                // (5) 읽어오기
//                movieIn.read(inByte);
//                // (6) 읽어온 바이트배열을 문자열로 변환
//                String moiveReview = new String(inByte);
//                System.out.println(moiveReview);
//            }// if end
//
//        }catch (Exception e){
//            System.out.println("[7번문제] 예외발생"+e);
//        }//try,catch end
//
//[문제 8] 공공데이터 CSV 파일 읽고 분석하기
//        1. **공공데이터포털(data.go.kr)**에서 '부평구_인구현황'을 검색하여 CSV 파일을 다운로드하고, src 폴더에 bupyeong_population.csv 라는 이름으로 저장하세요.
//        2. FileInputStream을 사용하여 해당 파일을 읽어오세요. (주의: 한글 깨짐 방지를 위해 new String(bytes, "EUC-KR") 사용)
//        3. 읽어온 전체 내용을 줄바꿈(\n) 기준으로 분리하여 String 배열에 저장하세요.
//        4. for문을 사용하여 배열의 각 줄(각 동의 인구 정보)을 순회하며, '행정기관'과 '총인구수'만 추출하여 "동별: [ 동별 ], 총 인구: [ 인구수(계)   ]명" 형식으로 출력하세요.
        try {
            //호출
            // (1) 파일 존재 여부 확인
            String bupyeongPath = "src/day16_20250721/bupyeong_population.csv";
            File bupyeongPopFile = new File(bupyeongPath);
            System.out.println("[8번문제] 파일 확인용" + bupyeongPopFile.exists());

            // (2) 파일이 존재할 경우
            if (bupyeongPopFile.exists()) {
                // (3) 파일 입력 객체 생성
                FileInputStream bupyeongPopIn = new FileInputStream(bupyeongPath);
                // (4) 읽어왔을때 바이트들을 저장할 바이트 배열 선언
                byte[] bupyeongByte = new byte[(int)bupyeongPopFile.length()];
                // (5) 읽어오기
                bupyeongPopIn.read(bupyeongByte);
                // (6) 읽어온 바이트배열을 문자열로 변환
                String bupyeongPop = new String(bupyeongByte,"EUC-KR");
                System.out.println(bupyeongPop);

                // (7) CSV 분해하기
                System.out.println(bupyeongPop.split("\n")[1].split(",")[0]); // 첫 행 행정기관
                System.out.println(bupyeongPop.split("\n")[1].split(",")[1]); // 첫 행 총인구

                String[] bupyeongPopCsv = bupyeongPop.split("\n"); // 행단위로 쪼개서 배열에 저장
                for( int i=0; i<bupyeongPopCsv.length;i++){
                    String row=bupyeongPopCsv[i];
                    String[] col= row.split(","); //행을 열 단위로 쪼개서 배열에 저장

                    System.out.printf("동별:[ %s ], 총 인구:[ %s ] \n",col[0],col[1]);
                }//for end

            } // if end
        }catch (Exception e){
            System.out.println("[8번문제]예외발생"+e);
        } // try,catch end
    } //main end
} // class end
