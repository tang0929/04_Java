package edu.kh.poly.pack3.model.dto;


// 인터페이스는 다중상속이 가능하다!
// 인터페이스 장점 : 상속받은 클래스들의 형태가 똑같거나 비슷하기 때문에
// 코드 유지 보수 시 참조하는 객체만 변경하면 유지보수가 완료됨



// 각자 구현한 계산기
public class NTHCalculator implements Calculator, Machine{
	
	/* */
	
	@Override
		public int plus(int a, int b) {
			return a+b;
		}
	
	@Override
	public int minus(int a, int b) {
		return a-b;
	}
		
	@Override
	public int multi(int a, int b) {
		return a*b;
	}
	
	@Override
	public double div(int a, int b) {
		return (double)a/b;
	}
	
	@Override
	public int mod(int a, int b) {
		return a%b;
	}
	
	@Override
	public int sum(int...numbers) {
		
		// 가변인자(...) : 전달 인자의 개수(전달 되는 값의 개수)가 변할 수 있는 매개변수(전달 인자)
		// printf()가 가변인자 사용의 가장 대표적인 예시
		// numbers는 int[] 타입
		
		
		int sum = 0;
		for(int i : numbers) {
			sum +=i ;
		}
		return sum;
	}
	
	

	
	@Override
	public double areaOfCircle(double r) {
		return r*r*PI;
	}
	
	@Override
	public boolean rangeCheck(int num) {
		return true;
	}
	
	@Override
	public int pow(int a, int x) {
		int result = (int) Math.pow(a, x);
		return result;

	}
	
	@Override
	public String toBinary(int num){
		return Integer.toBinaryString(num);
	
	}
	
	@Override
	public String toHexadecimal(int num){
		return Integer.toHexString(num);
		
	}
	
	@Override
	public void PowerOn() {
		System.out.println("노태형 게산기 실행");
	}
	@Override
	public void PowerOff() {
		System.out.println("노태형 게산기 종료");
	}
	
	
	
	
	}


	
	
	
	
	
	
	
	
		


	
	


