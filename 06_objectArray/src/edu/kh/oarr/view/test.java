package edu.kh.oarr.view;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("2 ~19 사이 정수 입력 : ");
			
			int input = sc.nextInt();
			
			if(input >= 2 && input <= 19 ) {
				for(int num = 1 ; num <= 19 ; num++) {
					System.out.printf("%d * %d = %d\n", input, num, input*num);
					
					
				}break;
				
			}else {
				System.out.println("2이상 9이하의 정수만 입력해주세요");
			} 
		}
		
	}

}
