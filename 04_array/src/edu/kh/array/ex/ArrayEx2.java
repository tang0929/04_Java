package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayEx2 {

	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		
		// 얕은 복사 : 주소만 복사 
		
		int[] arr1 = {100,200,300,400};
		
		int[] arr2 = arr1;
		
		System.out.println("arr1 : "+ Arrays.toString(arr1));
		System.out.print("arr2 : "+ Arrays.toString(arr2));
		
		// 서로 다른 변수를 이용해서 값을 변경
		arr1[0] = 1234;
		arr2[1] = 9876;
		System.out.println("==========================================");
		System.out.println("arr1 : "+ Arrays.toString(arr1));
		System.out.print("arr2 : "+ Arrays.toString(arr2));
		// arr1와 arr2 모두 [1234,9876,300,400] 출력
		// 얕은 복사(같은 주소 참조) 상태이기 때문에 같은 결과가 나온다.
		
		
	}
	
	public void method2() {
		
		// 깊은 복사 : 값을 똑같이 복사한 배열/객체를 생성
		
		int[] arr1 = {10,20,30,40,50};  // 원본 배열
		
		// 값을 복사할 배열(깊은 복사)
		int[] arr2 = new int[arr1.length]; // arr1의 길이와 동일한 arr2 만듬
		int[] arr3 = new int[arr1.length]; 
		
		// 깊은 복사 방법 1 : for 문 이용
		for(int i = 0 ; i < arr1.length; i++) {
			arr2[i] = arr1[i]; // arr1의 요소를 arr2에 그대로 대입
		}
		
		// 깊은 복사 방법 2 : System.arraycopy() 이용
		// System.arraycopy(원본 배열명, 원본 복사 시작 인덱스, 복사 배열명, 복사 배열 삽입 시작 인덱스, 복사길이)
		System.arraycopy(arr1, 0, arr3, 0, arr1.length); 
		// arr1의 0번 인덱스를 arr3의 0번 인덱스에다 arr1의 길이만큼(전체) 복사 붙여넣기시킴
		
		System.out.println("arr1 : " + Arrays.toString(arr1)); // 원본
		System.out.println("arr2 : " + Arrays.toString(arr2)); // for
		System.out.println("arr3 : " + Arrays.toString(arr3)); // arraycopy
		
		// 모든 배열의 0번 인덱스의 값을 변경하기
		arr1[0]=999;
		arr2[0]=888;
		arr3[0]=777;
		System.out.println("==========================================");
		System.out.println("arr1 : " + Arrays.toString(arr1)); // 원본 [999,20,30,40,50]
		System.out.println("arr2 : " + Arrays.toString(arr2)); // for [888,20,30,40,50]
		System.out.println("arr3 : " + Arrays.toString(arr3)); // arraycopy [777,20,30,40,50]

		
	}
	
	
	
	
	
	public void method3() {
		
		/* 2차원 배열
		 * * 1차원 배열 참조 변수의 묶음 */
		
		// 2차원 배열 선언 방법
		int[][] arr = new int[2][3]; // 3칸짜리 1차원 배열 참조변수 2개 묶은 배열.
		
		
		// 2차원 배열 초기화
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		
		// 2차원 배열 내 모든 요소 순차 접근
		// arr.length = 1차원 배열 참조 변수의 개수(행의 개수)
		// arr[0].length = arr[0]이 참조하는 1차원 배열의 길이
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[0].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println(); // 줄바꿈
			
		}
		
		
	}

}

/*
 * 추상화 : 구체적인 것이 아닌 추상적이지만 공통적인 기능을 이용하여 만드는 것
 * 캡슐화 : 데이터들을 다른 외부의 요소에 영향을 받지 않게 하나로 묶어 보호하는 것.
 * 상속 : 부모가 자식에게 물려주는 형식을 이용해 관련있는 코드에 영향을 주게함
 * 다형성 : 다양한 형태를 지닐 수 있는 성질로 부모와 자식의 역할이 서로 변하게한다.
 * */
