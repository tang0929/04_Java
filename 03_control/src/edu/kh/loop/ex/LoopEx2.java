package edu.kh.loop.ex;
import java.util.Scanner;

public class LoopEx2 {
	

	// 중첩 반복문
	
	public void method9() {
		/* 1234
		 * 1234
		 * 1234  출력
		 */
		for(int x = 1; x <= 3; x++) { // 3줄
			for(int i = 1; i <= 4; i++) { // 1234
			System.out.print(i);
		
			}
			System.out.println(); // 줄바꿈
		}
	}
	
	
	public void method10() {
		// 4321
		// 4321
		
		for(int i = 1; i <= 2; i++) { // 2줄
			for(int n = 4; n >=1; n--) { // 4부터 1까지 출력
				System.out.print(n);
			}
			System.out.println(); // 줄바꿈
		}
		
		
	}
	
	
	public void method11() {
		/* (0,0)(0,1)(0,2)
		 * (1,0)(1,1)(1,2)
		 * (2,0)(2,1)(2,2)
		 */
		
		for(int n = 0; n <= 2; n++) {  // 세로 0,1,2
			for(int m = 0; m <= 2; m++) { // 가로 0,1,2
				System.out.printf("(%d,%d)",n,m);
			}
			System.out.println();
		}
	}
		
		public void method12() {
			/* (2,2)(2,1)(2,0)
			 * (1,2)(1,1)(1,0)
			 * (0,2)(0,1)(0,0)
			 */
			
			for(int n = 2; n >= 0; n--) {  // 세로 2,1,0
				for(int m = 2; m >=0 ; m--) { // 가로 2,1,0
					System.out.printf("(%d,%d)",n,m);
				}
				System.out.println();
			}
			
		}
			
		
		
		public void method13() {
			
			// 2단부터 9단까지 모두 출력
			// 2*1=2 2*2=4 2*3=6 ...
			// 3*1=3 3*2=6 3*3=9 ...
			for(int i=2 ; i<=9 ; i++ ) {
				for(int n=1 ; n<=9 ; n++) {
					System.out.printf("%d*%d=%2d ",i,n,i*n);
				}
				System.out.println(); }}
		
			
		public void method14(){
			
			// 입력받은 단부터 9단까지 구구단 출력하기
			// 입력값은 2~9 사이가 아니면 "잘못입력" 출력
			Scanner sc = new Scanner(System.in);
			System.out.print("단 입력(2~9 사이) : ");
			int input = sc.nextInt();
			if(input < 2 || input > 9 ) {
				System.out.print("잘못입력"); return;}
			else {
			for(int i = 1 ; i <= 9 ; i++) {
			
				System.out.printf("%d * %d = %2d\n",input,i,input*i);
			}
		}
		}
		
		
			
		public void method15() {
			/* 1 2 3
			 * 4 5 6
			 * 7 8 9
			 */
		
			int count = 1;
			
			for(int row = 0 ; row < 3 ; row ++) { // 3행 반복
				
				for(int col = 0 ; col < 3 ; col++) { // 3열 반복
					System.out.print(count++ + " ");
				}
				
				System.out.println(); // 줄바꿈
			}
		}
			
		
		
		public void method16() {
			/*
			 * ****
			 * ****
			 * ****
			 * ****
			 */
			for(int i = 0; i < 4 ; i++) {
				for(int m = 0; m < 4 ; m++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
		
		
		public void method17() {
			/*
			 * *
			 * **
			 * ***
			 * **** */
			
			for(int i = 0; i <= 4 ; i++) {   //4행(0123)
				
				for(int m = 0; m < i ; m++) { //4열(0123)
					System.out.print("*");
				}
				System.out.println();
			}
		
		}
		
		
		public void method18() {
			/*
			 * ****
			 * ***
			 * **
			 * *
			 */
			
			for(int i = 3; i >=0 ; i--) { //4행(3210)
				
					for(int m = 0; m < i+1 ; m++) { // 4행(3210)
						System.out.print("*");
					}
					System.out.println();
				}
		
		}
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	


