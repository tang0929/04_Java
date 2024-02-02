package edu.kh.oop.constructor;

public class MemberRun {
	
	public static void main(String[] args) {
		
		// 회원 객체 생성 -> 기본 생성자를 이용해서 생성
		
		Member member1 = new Member();
		
		// null == "참조하는 객체가 없다"를 나타내는 값.(저장된 주소 없음)
	
		
		// member1이 참조하는 Member 객체의 필드값을 세팅
		
		member1.setMemberID("member01");
		member1.setMemberPW("pass01");
		member1.setMemberName("김회원");
		member1.setMemberAge(27);
		
		
		// 새로운 Member 객체 생성 후 필드 값 세팅
		Member member2 = new Member();
		
		member2.setMemberID("tang0929");
		member2.setMemberPW("qwe123");
		member2.setMemberName("노태형");
		member2.setMemberAge(26);
		
		System.out.println("[member1]");
		member1.inform();
		
		System.out.println("[member2]");
		member2.inform();
		
		
		// 매개 변수 생성자를 이용해서 Member 객체 생성 -> 코드 길이 감소
		
		Member member3 = new Member("test3","pw3pw3","김철수",30);
		System.out.println("[member3]");
		member3.inform();
		
		Member member4 = new Member("test4","pw4pw4","김이박",41);
		System.out.println("[member4]");
		member4.inform();
		
		
	}

	
	// 프로그래밍 언어에서 변수명, 함수명, 메서드명은 중복 허용 X
	
	// 변수명 중복
	int a = 10;
	// int a = 20;
	
	
	/* 오버로딩(OverLoading : 과적) 
	 * 
	 * 한 클래스 내에 동일한 이름의 메서드를 여러개 작성하는 기법 
	 * 같은 이름의 메서드가 수행하는 기능은 기본적으로 같지만 전달받은 매개 변수에 따라 조금씩 동작이 달라야 하는 경우
	 * 상황별로 정의
	 * 
	 * 오버로딩의 조건
	 * 1) 메서드 이름은 똑같아야 한다
	 * 2) 매개 변수는 개수, 타입, 순서가 하나라도 달라야 한다.  */
	
}
