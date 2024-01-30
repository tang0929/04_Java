package edu.kh.variable.ex;

public class printEx1 {
	public static void main(String[] args) {
		
		/* System.out (Eclipse 프로그램 기준 console 창)
		 * 
		 * System.out.print(); : () 내의 값을 출력
		 * System.out.println(); : () 내의 값을 출력 후 줄 바꿈시킴  
		 * 
		 * System.out.printf("",변수|값); : 정해진 형식(패턴)에 맞게 문자열을 출력하는 구문 
		 * 
		 * * 첫 번째 매개 변수
		 * 	- 패턴이 적용된 문자열을 작성 
		 *  - 패턴 종류
		 * * 두 번째 매개 변수
		 *  - 첫 번째 매개 변수 문자열 중 패턴에 들어갈 변수|값을 순서대로 작성
		 *  
		 * %d : 10진법 정수(Decimal) 
		 * %c : 문자(char) 
		 * %s : 문자열(String)
		 * %b : 논리형(boolean)
		 * %f : 실수형(float/double) 
		 *  
		 * 양수는 오른쪽 정렬, 음수(-)는 왼쪽 정렬 
		 * 
		 * %nd : 정수가 출력된 칸을 n만큼 확보
		 *   ex) %6d : ㅁㅁㅁㅁㅁㅁ
		 * %.nf : 소숫점 아래 n자리까지 표시하는 실수. (n+1자리에서 반올림) */
		
		
		System.out.print("이름 : ");
		System.out.print("노태형");
		System.out.println("입니다. ");
		System.out.println("오늘도 재밌는 자바 공부");
		
		/* 이름 : 노태형입니다.
		  오늘도 재밌는 자바공부*/
		
		System.out.println(); // 줄만 바꿈
		
		String name = "홍길동";
		int age = 30;
		double height = 178.35;
		char gender = '남';
		boolean javaStudy = true;
		
		// 홍길동은 30세 남성으로 키는 178.4cm이며 자바공부 여부는 true
		System.out.printf("%s은 %d세 %c성으로, 키는 %.1fcm이며 자바공부 여부는 %b",name,age, gender, height, javaStudy);
		
		System.out.println();
		System.out.println("--------------------------------------------------------");
		
		// 20240125 홍길동             10000원    입금
		// 20240125 아파트관리비      120000원    출금
		// 20240125 식자재마트          3000원    출금
		System.out.printf("");
		
		System.out.printf("%8s %-6s %7d원 %s \n","20240125","홍길동",10000,"입금");  // \n : 줄바꿈하는 개행문자 
		System.out.printf("%8s %-6s %7d원 %s \n","20240125","아파트관리비",120000,"출금");  // \n : 줄바꿈하는 개행문자 
		System.out.printf("%8s %-6s %7d원 %s \n","20240125","식자재마트",3000,"출금");  // \n : 줄바꿈하는 개행문자 
		
		
		
	}
	

}
