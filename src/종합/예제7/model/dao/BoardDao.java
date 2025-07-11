package 종합.예제7.model.dao;

import 종합.예제7.model.dto.BoardDto;

// (역할) 실제 데이터가 존재하는 데이터 접근하는 기능(CRUD)
public class BoardDao {

    //* 데이터베이스: 추후에 데이터베이스로 변경할 예정
    BoardDto[] boardDB = new BoardDto[100];
    //1. 등록 처리 메소드: controller 로 부터 db(배열)에 저항할 객체를 받아서 저장한다.
        // 매개변수 : BoardDto, 반환값: Boolean
    public boolean boardWrite(BoardDto boardDto){ //(1) 빈공간 찾기 위한 인덱스 0부터 순회
        for(int i=0; i<=boardDB.length-1; i++){   //(2) 배열내 i번째 값이 비어 있으면
            if(boardDB[i]==null){                 //(3) i번째 저장할 객체를 대입
                boardDB[i]=boardDto;              //(4) 성공의 의미로 'true' 반환한다
                return true;
            } //if end
        } // for end
        return false; //(4) 실패의 의미로 'false' 반환 한다
    }
    //2. 조회 처리 메소드: controller 로 부터 모든 db(배열)을 반환 한다.
        // 매개변수:x       , 반환값: BoardDto[];
}//class end
