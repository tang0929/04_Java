package edu.kh.inheritance.model.dto2;

import edu.kh.inheritance.model.dto.Parent;

// final 클래스 -> 상속 불가
// 제공되는 클래스 그대로 사용해야 하는 경우 ex)String

public class Child2 extends Parent {
	
	private String smartPhone;
	
	public Child2() {
		// super();
		// super() 생성자 미작성시 컴파일러가 자동으로 추가함(초월번역기)
		
		System.out.println("Child2 기본 생성자");
	}
	

	// 매개 변수 생성자(부모 필드 + 자식 필드)
	public Child2(String lastName,String address, int money, String car, String smartPhone) {
		// 전달 받은 매개변수 5개 중 4개는 Child2 내부에 생성된 Parent에 초기화 되어야 하는 값.
		// -> Parent의 매개 변수 생성자 호출
		
		super(lastName, address, money, car);
		this.smartPhone = smartPhone;
		
		System.out.println("CHild2 매개변수 생성자로 객체 생성");
	}

	// SmartPhone getter/setter 생성 (alt + s)
	public String getSmartPhone() {
		return smartPhone;
	}


	public void setSmartPhone(String smartPhone) {
		this.smartPhone = smartPhone;
	}
	
	
	// 부모 메서드 inform + 자식 필드 내용 
	// -> 중복되는 코드를 제거해서 코드 길이를 감소 시켜 코드의 재사용성이 증가함
	public String informChild2() {
		return String.format("%s / %s / %d / %s / %s", 
			lastName, address, getMoney(), getCar(), smartPhone);
		// return inform() + "/" + smartPhone;
	}

	
	
	
	// 부모로부터 상속받은 introduce() 메서드
	// Overriding(재정의) 하기
	// + 오버라이딩 코드를 잘 작성하고 있는지 컴파일러한테 검사해 달라고하기(@Override)
	// (2) == Annotation
	
	
	
	@Override
	public /*int*/ String introduce() {
		// The return type is incompatible with Parent.introduce()
		// -> 반환형을 int로 쓰니까 부모 코드랑 다르다고 오류 발생
		return "Child2입니다.";
	}
	
	
	
	
	// toString() 오버라이딩
	@Override
	public String toString() {
		return super.toString() + "\nChild2 : " + smartPhone;
	}
	
		
		
		
		
	}
	
	
	



