package edu.kh.array.practice;

import java.util.Arrays;
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
		
		
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];
		
		// 1) Stack 영역에 int[]를 참조하기 위한 참조형 변수 arr 선언
		// 2) Heap 영역에 입력받은 len 만큼의 길이를 가지는 int[] 생성 -> 주소 할당
		// 3) 생성된 배열의 주소를 arr변수에 대입해서 참조할 수 있는 형태로 만듦
		
		for(int i = 0;i < arr.length;i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	
		
		
		
		
		
	}
	
	public void practice4() {
		int[] arr = new int[5];
		
		for(int i = 0 ; i < arr.length ; i++) {
		System.out.printf("입력 %d번째 : ",i);
		arr[i] = sc.nextInt();
		}
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		
		// 배열 검색
		
		for(int i = 0; i < arr.length ; i++) {
			
			// i번째 인덱스 요소의 값이 search와 같을경우
			if(arr[i] == search) {
				System.out.println("인덱스 : "  + i);
				return;
			}
				
			
		}
		System.out.println("일치하는 값이 존재하지 않습니다.");
		
	}
	
	
	
	
	
	public void practice5() {
		System.out.print("정수 : ");
		int len = sc.nextInt();
		int[] arr = new int[len];
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ",i+1);
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		// 배열 요소 하나씩 출력
		for(int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println("\n총 합 : "+sum);
		
	}
	
	
	
	
	public void practice6() {
		// 주민등록번호를 저장할 char 배열 생성
		char[] arr = new char[14];
		System.out.print("주민등록번호(-포함) ");
		String input = sc.next();
		
		// 문자열.length() : 문자열의 길이를 반환하는 메서드
		// 배열.length : 배열 길이 반환하는 필드
		for(int i = 0 , len = input.length() ; i < len ; i++) {
			if(i <=7 ) // 주민번호 성별표기 전까지는 그대로 배열에 대입
			arr[i] = input.charAt(i);
			
			// 성별부분 이후(뒷자리 6자리)
			else arr[i] = '*';
		}
		// 배열에 담긴 내용 모두 출력
		for(int i = 0 ; i <arr. length ; i++) {
			System.out.print(arr[i]);
		}
	}
	
	
	
	
	public void practice7() {
		
		// while문으로 조건에 맞는 수가 입력될 때 까지 반복 + break;
		// 배열 요소에 대입되는 숫자는 count 값을 ++, -- 하여 제어
		
		int len = 0;
		
		while(true) {
			// 3 이상의 홀수가 입력될 때 까지 무한 루프
			System.out.print("정수 : ");
			len = sc.nextInt();
			
			// 입력 받은 정수가 3이상의 홀수가 되면 반복 종료
			if(len >= 3 && len % 2 == 1) {
				break;
			}
			// if문 수행이 안되었을 경우 == 3 이상이 아니거나 짝수인 경우
			System.out.println("다시 입력하세요");
		}
		// while 종료 후 입력받은 정수 크기만큼의 배열 선언, 할당
		int[] arr = new int[len];
		int count = 0; // arr 배열 요소에 대입될 수
		
		for(int i = 0 ; i < len ; i++) {
			if(i <= len /2 ) count++;
			else count --;
			arr[i] = count;
		}
		// Arrays.toString(배열명)
		// 배열 내 요소를 [1,2,3] 형식의 문자열로 만들어 반환
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	
	
	public void practice8() {
			
			int[] lottoInput = new int[6];
			
			
			System.out.print("6개의 번호를 입력하세요 : ");
			
			for(int i = 0; i < 6 ; i ++) {
				lottoInput[i] = sc.nextInt();
			}
		
			int[] randoms = new int[6];
		
			String str = ""; // 빈 문자열
		
			for(int i=0 ; i<randoms.length ; i++) {
				randoms[i] = (int)(Math.random() * 10 + 1);
				str += randoms[i] + " ";
			}
		

			System.out.println("발생한 난수 : " + str);
		
		
	
		
		}
	
	
	
	
	
	
	public void practice9() {
		
			int[] randoms = new int[10];
		
			String str = ""; // 빈 문자열
		
			int max = 0; // 최대값 저장용 변수
			int min = 0; // 최소값 저장할 변수
		
			for(int i=0 ; i<randoms.length ; i++) {
			
				randoms[i] = (int)(Math.random() * 10 + 1);
				str += randoms[i] + " ";
			
				if(i == 0) { // 첫 반복인 경우 -> 첫 번째 난수를 비교 기준으로 삼음
					max = randoms[i];
					min = randoms[i];
					continue; // 다음 반복으로 이동
				}
			
				// 첫 반복이 아닌 경우
				if(randoms[i] > max) max = randoms[i];
				if(randoms[i] < min) min = randoms[i];
			}
		
			System.out.println("발생한 난수 : " + str);
			System.out.println("최대값 : " + max);
			System.out.println("최소값 : " + min);
		}
	
	
	
	
	
	

	public void practice10() {
	
		int[] randoms = new int[10];
	
		String str = ""; // 빈 문자열
	
	
		// 난수 생성용 for문 + 중복 제거
		for(int i=0 ; i<randoms.length ; i++) {
			randoms[i] = (int)(Math.random() * 10 + 1);
			
			// 중복 검사 방법
			/* 현재 인덱스에 대입된 난수와 같은 값이 앞쪽 인덱스에 존재하면 다시
			 * 현재 인덱스에 새로운 난수를 생성해서 대입(중복이 없을 때 까지 반복) */
			
			// 현재 인덱스 앞쪽 까지만 순차 접근하는 for문 작성
			for(int x = 0 ; x < i ; x++) {
				// 현재 인덱스에 저장된 값과(지금 발생한 난수와)
				// 앞쪽 인덱스에 저장된 값이(이전에 발생한 난수가)
				// 같을 경우 "중복"으로 판단
				if(randoms[i] == randoms[x]) {
					i--; // 바깥쪽 for문의 i 값 증가를 막아서(-)
						 // 현재 인덱스 번째 요소에 다시 새로운 난수를 대입하게 함
					break; // 중복을 발견했으니 추가적인 검사가 필요 없음.
				}
				
			}
			
		}
	
		// 출력 구문 만들기용 for문
			for(int i=0 ; i<randoms.length ; i++) {
				str += randoms[i] + " ";
			}
				
			System.out.println("발생한 난수 : " + str);
			
			
			
			
	
}
	
	
	
	
	
	public void practice11() {
		
		// 1. 크기가 6인 정수형 배열 생성
		int[] lotto = new int[6];
		
		// 2. 1 ~ 45 사이 중복 없는 난수로 lotto 배열 초기화
		for(int i = 0 ; i < lotto.length ; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			
			for(int x = 0 ; x < i ; x++) {
				if(lotto[i] == lotto[x]) {
					i--;
					break;
				}
			}
		}
		// 3. 오름차순 정렬(주체 > 대상 순이면 오름차순 반대는 내림차순
		for(int i = 0 ; i < lotto.length - 1 ; i++) { // 칸 지정(비교 주체)
			for(int x = 1 ; x < lotto.length ; x++) { // 비교 대상
				if(lotto[i] > lotto[x]) { // 주체가 대상보다 크면 교체(swap)
					int temp = lotto[i];
					lotto[i] = lotto[x];
					lotto[x] = temp;
					
					// Arrays.sort(lotto); : Java에서 제공해주는 배열 오름차순 정렬기능
				}
			}
		}
		
		
		// 결과 출력
		System.out.println(Arrays.toString(lotto));
		
	}

	

	}

	
	

	



	
