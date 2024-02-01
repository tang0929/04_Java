package edu.kh.oop.basic;

/**
 * 계좌 클래스
 */
public class Account {
	
	// [캡슐화]
	// - 객체의 속성(필드) 직접 접근을 제한하는 것이 원칙
	
	// - 직접 접근을 제한하기 위해서 모든 필드에 private 키워드 작성
	//   (private : 현재 객체만 접근 가능한, 사적인, 개인적인)
	
	// - 속성에 직접 접근을 할 수 없으므로
	//   대신 간접 접근을 할 수 있는 기능을 작성해야 함
	
	
	// 속성(값)
	
	private String name;						// 이름(예금주)
	private String accountNumber;		// 계좌 번호
	private long   balance;					// 잔액
	private String password;				// 비밀번호
	
	// * 매개 변수 : 전달 받아온 값을 저장하는 변수 *
	
	// name 변수에 값을 세팅하는 간접 접근 기능
	public void setName(String inputName) {
		
		// 매개 변수 String inputName
		// -> String 타입의 데이터를 전달 받아 저장할 변수
		name = inputName;
	}
	
	// name 변수의 값을 돌려 보내주는 간접 접근 기능
	
	// void : 반환할 값이 없다
	// <-> 반환할 값이 있을 경우 그 값의 자료형을 작성(반환형)
	public String getName() {
		return name; // Void methods cannot return a value
	}
	
	// accountNumber 값 세팅하는 간접 접근 기능
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
		
		/* this : 현재 객체 */
		
	}
	
	// accountNumber을 반환하는 간접 접근 기능
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	// password 값 세팅하는 간접 접근 기능
	public void setPassword(String password) {
		this.password = password;
	}
	
	// balance 값을 반환하는 간접 접근 기능
	public long getBalance() {
		return balance;
	}
	
	// 전달받은 금액을 balance에 누적한 후 현재 잔액을 콘솔에 출력
	public void deposit(long amount) {
		balance += amount;
		System.out.println(name + "의 현재 잔액 : "+ balance);
	}
	
	
	// 비밀번호와 출금할 금액을 전달받고 잔액 차감 후 잔액의 출력
	// 조건 : 비밀번호가 일치하지 않으면 "비밀번호 불일치", 출금할 금액이 잔액보다 크면 "잔액 부족"
	public void withdrawl(String pw, long amount) {
		
		// Java 에서 기본 자료형 비교는 ==, 객체 비경은 A.equals(B)
		
		// 비밀번호 비교, 전달받은 비밀번호가 같을경우 true 아니면 false
		if(!password.equals(pw)) {
			System.out.println("비밀번호 불일치");
			return;
		}
		// 출금할 금액이 잔액보다 클 경우
		if(amount > balance) {
			System.out.println("잔액 부족");
			return;
		}
		// 조건 만족시 출금할 금액만큼 차감 후 잔액 출력 
			balance-=amount;
			
			System.out.printf("%s 계좌에서 %d원 출금\n",accountNumber, amount);
			System.out.println(name + "의 현재 잔액 : " + balance);
		
	}
	
	
	
}











