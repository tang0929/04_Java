package edu.kh.variable.ex;

public class variableEx2 {
	
	// 메인 메서드(프로그램 실행)
	public static void main(String[] args) {
		
		/* 컴퓨터의 값 처리 원칙 
		 * 
		 * 같은 자료형 끼리 연산, 결과도 같은 자료형 
		 * 
		 * [형변환]
		 * 
		 * 다른 자료형 끼리 연산하는 경우 자료형을 맞게 변환 
		 * 
		 * [자동 형변환]
		 * 
		 * 연산 시 값의 범위가 작은 자료형을 값의 범위가 큰 자료형으로 변환 */
		
		
		/* 자동 형변환 확인 1 */
		
		int num1 = 10;
		long num2 = 10000000000L; // 100억
		long result1 = num1 + num2;
		System.out.println("result1 : " + result1);
		
		// int result1 = num1 + num2;
		// Type mismatch : cannot convert from long to int -> long 자료형을 int로 전환하지 못함.
		// int + long이 long + long 으로 자동 형변환 되어 long 값이 나와야하는데 result1를 int로
		// 대입하였으므로 오류가 발생
		
		
		
		/* 자동 형변환 확인2 */
		int num3 = 300;
		double num4 = 12.34;
		
		// int와 double을 더하게 되면 값의 범위가 작은 int가 double로 전환
		// (int) 300 + (double) 12.34 => (double) 300 + (double) 12.34
		
		double result2 = num3 + num4;
		System.out.println("result2 : " + result2);
		
		
		
		/* 자동 형변환 확인3 */
		long num5 = 20L;
		float num6 = 3.14f;
		
		// long과 float를 더하면 값의 범위가 작은 long이 float로 변환.(long이 더 크기 크다고 혼동 주의)
		// (long) 20L + (float) 3.14f => (float) 20.0f + (float)3.14f
		// (double) result3 = (float) 23.14f
		// (double) result3 = (double) 23.14
		double result3 = num5 + num6;
		System.out.println("result3 : " + result3);
		
		// double, float는 실수를 근사치로 표현한 자료형이라 정확하지 않다. -> 부동 소수점의 문제
		// 은행이나 숫자에 민감한 프로젝트에서는 사용하지 않음
	}

}
