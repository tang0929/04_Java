package edu.kh.loop.ex;

import java.util.Scanner;

public class LoopEx {
	
	// 필드 (객체의 속성 == 객체가 가지고 있는 값/변수)
	
	Scanner sc = new Scanner(System.in);
	
	// 1~10 출력하기
	
	public void method1() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
	}
	
	public void method2() {
		// 첫 번째 입력받은 수 부터 두 번째 입력받은 수까지 1씩 증가하며 출력하기
		System.out.print("두 개의 수 입력 : ");
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		for(int i = input1 ; i <= input2 ; i++){
			System.out.println(i);
		}
		
	}
	
	public void method3() {
		// 10부터 1까지 1씩 감소하며 출력
		for(int i=10;i>=1;i--){
			System.out.println(i);
		}
	}
	
	public void method4() {
		
		// 두 수를 입력 받아 반복 출력하는 구문을 작성. 첫 번째 입력은 A, 두 번째 입력은 B
		// 조건 : B가 A보다 크면 A ~ B까지 1씩 증가하며 출력, A가 B보다 크면 A ~ B까지 1씩 감소하며 출력
		// A와 B가 같으면 "같은 수 입력됨"
		
		System.out.println("첫 번째 수 : ");
		int a = sc.nextInt();
		System.out.println("두 번째 수 : ");
		int b = sc.nextInt();
		
		
		if(a == b) {
			System.out.println("같은 수 입력됨");
			return;
		} 
		
		if(b > a) {
			for(int i = a ; i <= b ; i++) {
				System.out.println(i);
			} 
			}else {
				for(int i = a ; i >= b ; i++) {
					System.out.println(i);
				}
			}
			
		}
	
		
	public void method5() {
		/**
		 * 두 수를 입력 받아 1씩 증가하며 반복 출력하기
		 * 
		 * (첫 번째 입력 A, 두 번째 입력 B)
		 * 
		 * - 입력 받은 두 수 중
		 *   작은 값이 초기식 , 큰 값이 조건식에 사용되게 작성
		 *   (같은 경우는 초기식 A, 조건식 B)
		 */
		
		System.out.print("첫 번째 수 : ");
		int input1 = sc.nextInt();
		System.out.print("두 번째 수 : ");
		int input2 = sc.nextInt();
		
		if (input1 > input2) {
			for(int i = input2;i<=input1;i++) {
				 System.out.println(i);} 
			}else if (input2 > input1) {
				for(int i = input1 ; i <= input2 ; i++)
				{
					System.out.println(i);
				}
			}
		
		// 두 수를 비교해서 최대, 최솟값 구하는 방식으로 계산
		/*
		 * int min;
		 * int max; 
		 * if (input1 <= input2) {
		 * min = a;
		 * max = b;}
		 * else{ min = b; max = a;
		 * 
		 * for int(i = min ; i <= max; i++);
		 * {System.out.println(i);} */
		
		
		
		
		
	}
	// 최대 최솟값 구하기 2(Math)
	public void method5b() {
		System.out.print("첫 번째 수 : ");
		int a = sc.nextInt();
		System.out.print("두 번째 수 : ");
		int b = sc.nextInt();
		
		
		int min = Math.min(a, b); // 두 수 중 가장 작은 값을 반환
		int max = Math.max(a, b); // 두 수 중 가장 큰 값을 반환
		// Java API 이용한 방법
		for(int i = min ; i <= max; i++) System.out.println(i);
		
	}
	
	// 변수 값 교환(swap)
	
	public void method5c() {
		System.out.print("첫 번째 수 : ");
		int a = sc.nextInt();
		System.out.print("두 번째 수 : ");
		int b = sc.nextInt();
		
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		for(int i = a ; i <= b ; i++) System.out.println(i);
		
	}
	
	
	public void method6() {
		// 1~100 사이 7의 배수의 개수 세기
		int count = 0;
		for(int i = 1;i<=100;i++) {
			if(i % 7 == 0) 
			count++;}
			
		System.out.println(count);
	}
	
	public void method6a() {
		// 1~100 사이 7의 배수의 개수 세기2
		int count = 0;
		for(int i = 7;i<=100;i+=7) {
				count++;}
		
		System.out.println(count);
	}
	
	
	public void method7() {
		// 1부터 100 사이 정수 중 3의 배수 개수, 3의 배수를 제외한 수들의 합 출력
		int count = 0;
		int sum = 0;
		for(int i = 1 ; i <= 100 ; i++) {
			sum = sum + i;
			if(i % 3 == 0) {
				count++;
				sum -= i;
			}
		}
		System.out.println(count); // 3의 배수 개수
		System.out.println(sum); // 3의 배수를 제외한 수들의 합
	}
	
	public void method8() {
		// 구구단 5단 출력하기	
		for (int i = 1 ; i <= 9 ; i++) {
			System.out.printf("5 * %d = %2d\n",i,5*i);
		}
		
	}
	
	public void method8a() {
		System.out.print("출력할 단 : ");
		int input = sc.nextInt();
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.printf("%d * %d = %2d\n",input,i,input*i);
		}
	}

}

	