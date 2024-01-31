package edu.kh.loop.ex;
import java.util.Scanner;

public class LoopEx3 {
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		// 문자열 한 글자씩 출력하기
		String str = "Hello World!!!";
		
		int length = str.length(); // str 문자열의 길이를 미리 카운트하여 저장. str.length() 구문을 재 호출할 필요 없음
		
		// 문자열.charAt(인덱스) : 인덱스번째 문자 하나를 얻어와 반환
		// 문자열.length() : 문자열 길이. 괄호 잊지않게 주의
		
		for(int i = 0 ; i <length; i++) {
			System.out.println(str.charAt(i));
		}
		}
		
	public void method2() {
		
		
		// while(조건식) : 끝이 확실하지 않는 반복문
		// -1이 입력될 때 까지 정수를 계속 입력 받아 입력 받은 수의 합계를 구하기
		
		int sum = 0;
		int input = 0;
		
		while(input != -1) {
			// 입력값이 -1이 아니면 반복, -1이면 멈춤
			System.out.print("정수입력 : ");
			input = sc.nextInt();
			sum += input;
		}
		System.out.printf("합계 = %d",+sum);
		}
	
	
	public void method3() {
		
		// 0이 입력될 때 까지 수를 계속 입력받음. 0 입력시 누적된 합계 출력
		int sum = 0;
		int input = 1; // input을 0으로 초기화했기 때문에 앞처럼 작성시 while로 들어가기 전 바로 탈출해버림. 0이 아닌 다른 수로 초기화하거나
						// 다른 구문을 사용해야함.
		
		while(input != 0) { // 입력한 값이 0이 아닐 때 반복
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			sum += input;
			
		}
		
		/*
		 * do {
		 * System.out.print("정수 입력 : ");
		 * input = sc.nextInt();
		 * sum += input;
		 * }
		 * while(input != 0);
		 *  */
		
		/* do - while 문
		 * 조건식이 뒤에 작성된 while문. 최소 1회 이상은 보장 */
		
		System.out.printf("합계 : %d ",sum);}
		
		
		public void method4() {
			// 0이 입력될 때 까지 정수를 계속 입력받고 0 입력 시 누적된 값 초기화
			
			int sum = 0;
			int input = 0;
			
			while(true) { // 무한 반복
				System.out.print("정수 입력 : ");
				input = sc.nextInt();
				if(input == 0) break; // 0이 입력되면 while문 종료
				sum += input;
			
			
		}
			System.out.println("합계 : "+sum);
		
		
	}

		
	
	
		
		
	
		
	
	
	
}
	
	
	




