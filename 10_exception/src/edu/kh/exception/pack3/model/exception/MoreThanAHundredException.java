package edu.kh.exception.pack3.model.exception;


/* 100 초과하면 예외 발생 
 * RuntimeException 상속
 * Unchecked Exception
 * 예외처리 구문 작성 해도 안해도 상관없음 
 * 사용자 정의 예외는 RuntimeException 상속 받는 경우가 많음*/
public class MoreThanAHundredException extends RuntimeException {
	
	public MoreThanAHundredException() {
		super("100을 초과하였습니다.");
	}
	public MoreThanAHundredException(String message) {
		super(message);
	}

}
