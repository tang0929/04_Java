package edu.kh.oop.basic;

public class Nation {
	
	/* 클래스 : 객체가 가져야 할 속성 (값), 기능(메서드)를 
	 * 		글(코드)로 작성해둔 문서(설계도) == 객체를 정의한 것 */
	
	
	// 속성(값)
	
	String name;
	int age;
	char gender;
	String idNumber;
	String tel;
	String address;
	
	// 기능
	public void speakKorean() {
		System.out.println("한국어가능");
	}
	public void welfare() {
		System.out.println("우리나라에서 제공하는 복지");
	}
	public void 납세의의무() {
		System.out.println("세금납부");
	}

}
