package edu.kh.condition.ex;

import java.util.Scanner;

/**
 * 조건문 기능용 클래스
 */

public class ConditionEx {
	
	// 필드 (객체의 속성 == 객체가 가지고 있는 값/변수)
	// Scanner 입력 후 자동완성(ctrl + space)에서 Scanner 자동 완성 가능
	
	// 나이를 입력받아 19세 이상은 성인, 19세 미만은 성인이 아닙니다.
	public void method1(){
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		if(age > 19) {
			System.out.println("성인입니다.");
		}
		else {
			System.out.println("성인이 아닙니다.");
		}
		
	}
	// 나이를 입력받아 13세 이하면 어린이, 14~18세면 청소년, 19세 이상은 성인
	public void method2() {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		String result;
		
		if(age <= 13) {
			result = "어린이";
		}
		else if(age <= 18) {
			result = "청소년";
		}else
			result = "성인";
		System.out.printf("%s입니다.\n",result);
		
		}
	}

	
	// 월을 입력받아 해당 계절 출력하기 
	// (봄 : 3,4,5월 / 여름 : 6,7,8월 / 가을 : 9,10,11월 / 겨울 : 12,1,2월 / 그 외는 "잘못 입력")
	public void method3(){
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.print("월을 입력해주세요 : ");
		int month = sc.nextInt();
		String result;
		
		if(month >= 3 && month <= 5) {
			result = "봄";
		}
		else if(month >= 6 && month <= 8) {
			result = "여름";
		}
		else if(month >= 9 && month <= 11) {
			result = "가을";
		}
		else if(month == 12 || month == 1 || month == 2) {
			result = "겨울";
		}else {
			result = "잘못 입력하셨습니다.";
		}
		System.out.printf("%s\n",result);
		
		
		// 또 다른 방법 1  (잘못 입력 하는 경우를 먼저 제시하고 조건이 제일 긴 겨울을 제일 나중에 제시하여 
		// 더 효율적인 코드를 작성)
		
		/* String result;
		 * if( month < 1 || month > 12 ) {
		   result = "잘못 입력";
		}
		 if(month >= 3 && month <= 5) {
			result = "봄";
		}
		else if(month >= 6 && month <= 8) {
			result = "여름";
		}
		else if(month >= 9 && month <= 11) {
			result = "가을";
	 	else{
	 	result = "겨울";  */
		 
	
		// 또 다른 방법 2 (switch문)
		
		/* switch(month){
		 * case 3,4,5 : result = "봄"; break;
		 * case 6,7,8 : result = "여름"; break;
		 * case 9,10,11 : result = "가을"; break;
		 * case 12,1,2, : result = "겨울"; break;
		 * default : result = "잘못 입력";
		 * }
		 * */
		}
	}
	
	// P/F 판별하기
	// 중간고사, 기말고사, 과제 점수를 입력받아 총점 60점 이상일 경우 PASS 아니면 FAIL
	// 중간고사 40%, 기말고사 50%, 과제 10% 비율. 각각 100점 만점.
	// Pass인 경우, 90점 이상 A, 80점 이상 B, 70점 이상 C, 60점 이상 D
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("중간고사 점수를 입력하세요. : ");
		int score1 = sc.nextInt();
		System.out.println("기말고사 점수를 입력하세요. : ");
		int score2 = sc.nextInt();
		System.out.println("과제 점수를 입력하세요. : ");
		int score3 = sc.nextInt();
		
		
		double result = score1 * 0.4 + score2 * 0.5 + score3 * 0.1;
		String grade = ""; // 변수 선언 + 초기화
		// 변수에 아무런 값이 대입되지 않는 경우 사용 불가능 
		// 해결1) 모든 경우에 변수에 값을 대입
		// 해결2) 변수 선언시 특정한 값으로 초기화 진행
		//  숫자는 0, String은 null이나 "", boolean은 false로 초기화시킴
		
		
		
		/* if (result < 60) {
			System.out.print("FAIL");
			
		}else if(result >= 60 && result < 70) {
			grade = "D";
		}
		else if(result < 80) {
			grade = "C";
		}
		else if(result < 90) {
			grade = "B";
		}
		else if(result <= 100) {
			grade = "A";
		}
		else {
			System.out.print("잘못입력");
		}
		System.out.print(grade);
	}
	


}*/
		
		// switch 문에서는 정수, 문자열, 문자만 사용 가능
		switch((int)(result/10)) {
		case 6 : grade = "D"; break;
		case 7 : grade = "C"; break;
		case 8 : grade = "B"; break;
		case 9,10 : grade = "A"; break;
		default : System.out.print("잘못 입력");break;
		}
		System.out.print(grade);
	}
	
	
	
	/* 국어, 영어, 수학, 사탐, 과탐 점수를 입력받아 
	 * 40점 미만 과목이 있으면 FAIL [40점 미만 과목 : (과목명)]
	 * 평균이 60점 미만이면 FAIL [점수 : (점수) 평균 미달]
	 * 모든 과목이 40점 이상, 평균이 60점 이상인 경우 PASS [점수 : (점수)/100]
	 * 40점 미만 과목이 존재하는 경우 FAIL
	 */
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수 입력 : ");
		int korean = sc.nextInt();
		System.out.println("영어 점수 입력 : ");
		int english = sc.nextInt();
		System.out.println("수학 점수 입력 : ");
		int math = sc.nextInt();
		System.out.println("사탐 점수 입력 : ");
		int social = sc.nextInt();
		System.out.println("과탐 점수 입력 : ");
		int science = sc.nextInt();
		
		int avg = 0;
		String failSubject = "";
		avg = (korean+english+math+social+science)/5;
		
		if(korean < 40 || english < 40 || math < 40 || social < 40 || science < 40 ) {
			if (korean < 40) {
				failSubject += "국어 ";
			}
			if (english < 40) {
				failSubject += "영어 ";
			}
			if (math < 40) {
				failSubject += "수학 ";
			}
			if (social < 40) {
				failSubject += "사탐 ";
			}
			if (science < 40) {
				failSubject += "과탐 ";
			}
			System.out.printf("FAIL [40점 미만 과목 : %s] ",failSubject);}
			
		else {
			if(avg < 60) {
			System.out.printf("FAIL : %d [평균미달]",avg);}
			else {
				System.out.printf("PASS");
			}
		}
			
		}
		
		
	}
		

		

	

	