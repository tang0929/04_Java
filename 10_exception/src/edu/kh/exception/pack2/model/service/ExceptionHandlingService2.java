package edu.kh.exception.pack2.model.service;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingService2 {
	
	/* finally 
	 * 마지막에 반드시 수행하는 구문 
	 * 
	 * - try 구문에서 예외 발생 여부와 관계 없이 무조건 수행해야되는 구문을 작성 
	 * 
	 * - try ~ catch ~ finally 또는 try ~ finally */
	
	private Scanner sc = new Scanner(System.in);
	
	public void method1() {
		// finally 확인하기
		
		System.out.println("1. 정상 수행 / 2. 강제 예외 발생");
		
		int input = sc.nextInt();
		
		try {
			if(input == 1) System.out.println("정상 수행 출력");
			else throw new RuntimeException(); // 예외 객체 생성 후 throw
			
		} catch(Exception e) {
			// 발생하는 모든 예외를 잡아서 여기서 처리(다형성 업캐스팅)
			System.out.println("강제 예외 발생 출력");
		} finally {
			// try 예외 발생 여부와 관계없이 무조건 수행
			System.out.println("***무조건 수행***");
		}
		
	}
	
	
	// finally 사용 예시
	// java 프로그램 - 외부 프로그램/장치 연결을 끊을 때 주로 사용
	public void method2() {
		
		// Scanner : 외부 장치(키보드)와 연결하는 장
		Scanner scanner = new Scanner(System.in);
		// Resource leak : 'scanner' is never closed
		// 프로그램 수행 중 scan이 메모리에 남아있어 메모리 누수 발생.
		// 해결 방법 : Scanner을 close하기(메모리반환) -> 예외가 발생하든 말든 무조건 close 수행 필수(finally 부합)
		System.out.print("정수 입력 : ");
		try {
			int input = scanner.nextInt();
			
			System.out.println("입력한 정수에 10배 : " + input*10);
			
		}catch(InputMismatchException e){
			System.out.println("유효하지 않은 입력 발생");
		}finally {
			if(scanner != null) {
				// scanner가 참조하는 Scanner객체가 존재할 때
				scanner.close();
			}
		}
	}

}
