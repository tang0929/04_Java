package edu.kh.oop.basic;

public class BasicRun {
	public static void main(String[] args) {
		// 국민 객체 생성(==Nation 클래스를 내용대로 Heap 영역에 할당
		
		Nation n1 = new Nation();
		
		n1.name = "홍길동";
		n1.age = 34;
		n1.gender='남';
		
		// 점, 하위 접근 연산자(.)
		// - 객체의 속성/기능을 접근, 호출, 실행시키는 연산자
		
		System.out.println("객체 생성 확인");
		System.out.printf("내 이름은 %s이고 %d세 %c성입니다.",n1.name,n1.age,n1.gender);
		
		Nation n2 = new Nation();
		
		// Nation 객체 참조 변수 n2에 Heap 영역에 Nation 클래스를 이용해 생성된 객체의 주소 대입
		
		n2.name= "신짱구";
		n2.age = 5;
		n2.gender='남';
		
		Nation n3 = new Nation();
		n3.name = "봉미선";
		n3.age = 29;
		n3.gender = '여'; 
		
	}

}
