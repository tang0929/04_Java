package edu.kh.array.practice;

import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		int sum = 0;
		
		
		int[] arr = new int[9];
		
		for(int i = 0; i < arr.length; i++ ) {
			arr[i] = i + 1;
			if(i % 2 == 0) {
				sum += arr[i];
			}
		}
			
		for(int i = 0;i < arr.length; i++) {
		System.out.print(arr[i] + " ");}
		System.out.println();
		System.out.print("짝수 번째 인덱스 합 : " + sum);}
	
	

	
	public void practice2()	{
		
		int sum = 0;
		int[] arr = new int[11];
		
		for(int i = 10; i >= 2; i--) {
			arr[i] = i - 1;
			if(i % 2 == 1) {
				sum += arr[i];
			}}
			for(int i = 10; i >= 2 ; i--) {
			System.out.print(arr[i] + " ");}
			System.out.println();
			
			System.out.print("홀수 번째 인덱스 합 : "+ sum);}
	
	
	
	
	public void practice3() {
		
		
		int[] arr;
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		arr = new int[input];
		
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		
		
	}
		
	}

	
	

	
