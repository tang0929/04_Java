package edu.kh.javatest;

// 한 줄 주석
/* 범위 주석 */

// 주석 : 컴파일러가 해석하지 않는 구문. 코드 설명 작성시 사용
public class JavaTest {
	
	/* class : 자바 코드를 작성하는 영역      
			   객체의 내용(속성, 기능)을 정의함
			   (JS 의 생성자 함수와 비슷한 형태)*/
	// alt + shift + j : 클래스/메서드 설명용 주석(html 방식으로 작성)
	/* <p> 자바 프로그램을 실행시키기 위해서 반드시 필요한 구문(기능)</p>
			   
	@param args
	// alt + shift + j */
	
	
			   
public static void main (String[] args) {
		// 자바 코드 실행 방법
		// 1) 위에 Run 버튼(재생버튼처럼 생긴 것) 클릭
		// 2) 실행 단축기 = ctrl + f11
	
	
	
		// System.out.println();
		// -> () 안의 문자열을 console에 출력한 후 줄바꿈하는 기능
		
		System.out.println("Hello World!");
		System.out.println("Java는 코드 끝에 꼭 ;(세미콜론)을 붙여야 합니다.");
		System.out.println("println() 구문 자동완성은 sysout -> ctrl + space");
		System.out.println(100+200); // 숫자 연산 기능
		System.out.println(100+30+"입니다.");
		System.out.println("합계 : " + (2222 + 333) + "원");
	}

}


