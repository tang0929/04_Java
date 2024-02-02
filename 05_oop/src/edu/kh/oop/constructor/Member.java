package edu.kh.oop.constructor;

public class Member {
	
	// 필드(==멤버 변수)
	// - 클래스 변수 : static이 붙은 변수 -> static 메모리에 할당될 때 
	// 클래스명.변수명으로 할당되기 때문
	
	// - 인스턴스 변수 : static이 없는 변수 -> 인스턴스(객체)가 생성될 때 heap메묄에 할당되기 때문

	private String memberID;
	private String memberPW;
	private String memberName;
	private int memberAge;
	
	// 생성자 : 객체 생성시 필드 초기화 + 특정 기능 수행하는 일종의 메서드
	
	
	/* 작성 규칙
	 * 1) 반환 없음
	 * 2) 생성자 이름은 클래스 명과 동일 */
	
	/* 기본 생성자
	 * - 매개 변수가 없는 형태
	 * - 생성자가 하나도 작성되지 않은 경우 컴파일러가 자동으로 추가 */
	
	
	public Member()	{
		// 생성시 수행할 기능
		System.out.println("[기본] 생성자로 Member 객체 생성됨");
		// 생성시 객체 초기화
		memberID = "ID를 입력해 주세요";
		memberPW = "PW를 입력해 주세요";
		memberName = "이름을 입력해 주세요";
		
	}
	
	/* 매개 변수 생성자 
	 * 객체 생성 시 매개 변수로 전달된 값을 생성된 객체의 필드에 초기화하는 용도의 생성자 */
	public Member(String memberID, String memberPW, String memberName, int memberAge) {
		System.out.println("[매개 변수] 생성자로 객체 생성됨");
		
		// this. == 생성되고 있는 객체
		this.memberID = memberID;
		this.memberPW = memberPW;
		this.memberName = memberName;
		this.memberAge = memberAge;
		

		
	}
	
	// 오버로딩을 이용해서 생성자 만들기
	public Member(String memberID) {
		// 매개 변수 개수가 다름
		this.memberID = memberID;
	}
	public Member(String memberID, String memberPW) {
		this.memberID = memberID;
		this.memberPW = memberPW;
	}
	public Member(int memberAge) {
		this.memberAge = memberAge;
	}
	
	public Member(String memberID, int memberAge) {
		this.memberID = memberID;
		this.memberAge = memberAge;
	}
	
	// 매개 변수 순서가 다름
		// public Member(int memberAge, String memberID) {
			// this.memberAge = memberAge;
			// this.memberID = memberID;
		
		
		
		// Duplicate method Member(int, String) in type Member
		// -> Member(int, String) 생성자 중복
		// --> 오버로딩은 변수명이 아닌 자료형이 개수, 순서, 타입 중 하나라도 달라야 성립
		
		// public Member(int memberAge, String memberPW) {}
	
	
	
	/* this() 생성자 */
	// 현재 클래스에 있는 다른 생성자 호출 -> 코드 중복 감소
	public Member(int memberAge, String memberID, String memberPW) {
		this.memberAge = memberAge;
		this.memberID = memberID;
		this.memberPW = memberPW;
	}
			
	
	
	
	
	
	
	// 기능(메서드)
	
	// setter : 전달 받은 매개 변수를 현재 객체의 필드에 대입 
	
	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}
	public void setMemberPW(String memberPW) {
		this.memberPW = memberPW;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}
	
	// getter : 현재 객체의 필드를 외부에서 얻어갈 수 있게 반환
	
	public String getMemberID()	{
		return memberID;
	}
	
	public String getMemberPW()	{
		return memberPW;
	}
	public String getMemberName()	{
		return memberName;
	}
	public int getMemberAge()	{
		return memberAge;
	}
	
	
	// 현재 객체의 필드 값을 한 번에 출력
	
	public void inform() {
		System.out.println("\n---------------------------");
		System.out.println("memberID : "+ memberID);
		System.out.println("memberPW : "+ memberPW);
		System.out.println("memberName : "+ memberName);
		System.out.println("memberAge : "+ memberAge);
		System.out.println("----------------------------\n");
	}
}
