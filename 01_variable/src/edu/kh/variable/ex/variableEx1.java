package edu.kh.variable.ex;

public class variableEx1 {
	
	public static void main(String[] args) {
		
		// 변수 : 메모리에 값을 저장하기 위한 공간. 이 때, 저장되는 값이 변할 수 있어 변수라고 한다.
		
		// 자료형(data type) : 변수 또는 값의 크기와 형식
		
		/* 자바 기본 자료형 (Java Primitive Types)
		 * 
		 * [논리형]
		 * boolean (1byte) - true/false
		 * 
		 * [정수형]
		 * byte    (1byte)
		 * short   (2byte)
		 * int     (4byte)  * 정수 기본형.
		 * long    (8byte)  * 숫자 뒤에 L
		 * 
		 * [실수형]
		 * float   (4byte)  * 숫자 뒤에 f
		 * double  (8byte)  * 실수 기본형
		 * 
		 * [문자형]
		 * char    (2byte)  * 문자 하나, 문자 양옆을 '' */ 
		
		
		
		// 변수 선언 : 메모리에 공간 할당
		boolean isTrue; // 메모리에 boolean 저장 공간 1byte을 할당하고 그 공간을 isTrue이라고 부르겠다
		
		double number1; // 메모리에 double 저장 공간 8byte을 할당하고 그 공간을 number1이라고 부르겠다
		
		
		// 값 대입 : 변수에 값을 집어 넣는 것. 이미 값이 있는 변수에 대입하면 덮어쓰기
		
		isTrue = true;
		
		// sysout -> ctrl + space -> enter
		System.out.println("isTrue : "+ isTrue);  // true
		
		isTrue = false; // 변수 false로 덮어씌우기
		
		System.out.println("isTrue : "+ isTrue);  // false
		
		
		// 변수 선언 + 초기화 + 값의 범위 확인
		int number2 = 2100000000; // 21억
		
		// int number3 = 2200000000; // 22억 
		// The literal 2200000000 of type inㄴt is out of range -> 22억이 type int의 범위를 초과했다는 오류
		// int보다 범위가 큰 정수 자료형으로 변경해야됨
		// 자료형을 long, 숫자 뒤에 'L' 리터럴 표기법 추가
		
		long number4 = 2200000000L;
		System.out.println("number2 : "+ number2);
		System.out.println("number4 : "+ number4);
		
		// 'L'같은 리터럴 표기법은 컴퓨터가 자료형을 구분하기 위한 기호이기 때문에 출력시에는 보이지 않음
		
		
		
		/* 다른 리터럴 표기법 확인 */
		char temp1 = 'A';
		float temp2 = 1.23f;
		
		
		// float temp2 = 1.23;
		// Type mismatch : cannot convert from double to float -> 타입 불일치 : double이 float로 전환될 수 없음
		
		double temp3 = 3.14;
		
		
		
		/* String (문자열) 
		 * 기본 자료형이 아닌 객체 
		 * String을 저장하는 변수는 객체 대신 주소를 저장 하기 때문에 "참조형"이라고 한다.
		 * 
		 * (저장된 주소에 위치한 객체를 참조)
		 * String의 리터럴 표기법 : 쌍따옴표("") */
		
		String str1 = "쌍따옴표가 String 리터럴 표기법";
		System.out.println("str1 : "+ str1);  
		
		
		
	
		
		
		
		
		
		
	}

}
