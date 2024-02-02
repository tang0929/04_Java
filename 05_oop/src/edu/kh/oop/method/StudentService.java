package edu.kh.oop.method;

import java.util.Scanner;

// 기능 제공 클래스
public class StudentService {
	
	// 필드
	private Scanner sc = new Scanner(System.in);
	
	public void displayMenu() {
		int input = 0; // scanner로 입력받은 메뉴 번호를 저장할 변수
		
		Student std1 = null;
		Student std2 = null;
		
		do {
			System.out.println("""
==== 학생 관리 프로그램 ====
1. 학생 등록
2. 학생 정보 확인
3. 학생 이름 수정
4. Java 공부하기
5. HTML 공부하기
6. Java 역량 비교하기
7. HTML 역량 비교하기
0. 프로그램 종료					
					""");
			System.out.print("메뉴 선택 >> ");
			input = sc.nextInt();
			switch(input) {
			case 1 : 
				System.out.print("학생을 등록할 변수를 선택하시오(1 : std1 / 2 : std2) : ");
				int select = sc.nextInt();
				if(select == 1) {
					std1 = createStudent();
				}else std2 = createStudent();
				break;
			case 2 : 
				System.out.println("정보를 조회할 학생 선택(1 : std1 / 2 : std2) : ");
				String text = null; // 학생 정보가 담긴 문자열을 저장할 변수 
				if(sc.nextInt() == 1) text = studentInform(std1);
				else text = studentInform(std2);
				System.out.println(text);
				break;
			case 3 : 
				System.out.println("수정할 학생을 선택(1 : std1 / 2 : std2) : ");
				if(sc.nextInt() == 1) updateStudentName(std1);
				else updateStudentName(std2);
				break;
			case 4 : 
				System.out.print("Java 역량을 수정할 학생 선택(1 : std1 / 2 : std2) : ");
				if(sc.nextInt() == 1) updateJava(std1);
				else updateJava(std2);
				break;
			case 5 : 
				System.out.print("HTML 역량을 수정할 학생 선택(1 : std1 / 2 : std2) : ");
				if(sc.nextInt() == 1) updateHtml(std1);
				else updateHtml(std2);
				break;
			case 6 : break;
			case 7 : break;
			case 0 : System.out.println("==== 프로그램 종료 ===="); break;
			default : 
			}
			
			
		} while(input != 0); // input이 0이 아니면 반복(최소 1회는 무조건 실행)
		
	}

	
	// -------------------------------------------------------------------
	/** 학생 정보를 입력받아 생성된 Student 객체를 반환
	 * @return 생성된 Student 객체 주소
	 */
	private Student createStudent() {
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("학번 : ");
		String studentNumber = sc.next();
		System.out.print("성별(남/여) : ");
		char gender = sc.next().charAt(0); // sc.next()로 입력받은 문자열 중 문자 하나를 받아 gender변수에 저장
	
		// Student 객체를 생성한 후 그 주소를 호출한 곳으로 반환
		return new Student(name, studentNumber, gender);
		
		
		
		
	}
	/** 매개 변수로 전달 받은 학생의 정보를 문자열로 만들어서 반환
	 * @param s : std1 또는 std2 (학생 객체 참조 주소)
	 * @return 학생 정보가 작성된 문자열
	 */
	private String studentInform(Student s) {

		// String.format("패턴",변수)
		// - 패턴 모양의 문자열을 반환하는 String 매서드
		return String.format("%s / %s / %c / %s / %d / %d",
				Student.schoolName,s.getStudentNumber(),s.getGender(),s.getName(),s.getJava(),s.getHtml());
	}
	
	
	
	/** 매개 변수로 전달 받은 학생 객체의 이름을 수정
	 * @param s : std1 또는 std2 (학생 객체 참조 주소)

	 */
	
	private void updateStudentName(Student s) {
		System.out.println("수정할 학생 이름 : ");
		String newName = sc.next();
		String beforeName = s.getName();
		// 학생 이름이 수정되었습니다. 전 이름 -> 후 이름
		System.out.println("학생 이름이 수정되었습니다.");
		s.setName(newName);
		System.out.printf("%s -> %s\n",beforeName,newName);
		
	}
	
	// Java 역량이 얼마나 증가/감소했는지 입력받고 학생의 Java 역량 수정
	// 단, 수정된 Java 역량은 최대값, 최소값 범위를 넘어가지 못하게 함
	
	private void updateJava(Student s) {
		System.out.print("Java 점수 증감 점수 : ");
		// changeJava : 점수 증감량 /
		// beforeJava : 이전 Java점수 / 
		// afterJava : 증감 후 Java점수
		int changeJava = sc.nextInt();
		int beforeJava = s.getJava();
		int afterJava = beforeJava + changeJava;
		System.out.printf("Java 점수가 수정되었습니다. 이전 점수 %d -> 현재 점수 %d\n",beforeJava,afterJava);
		s.setJava(afterJava);
	
		
	}
	private void updateHtml(Student s) {
		System.out.print("HTML 점수 증감 점수 : ");
		// changeHtml : 점수 증감량 /
		// beforeHtml : 이전 HTMl점수 / 
		// afterHtml : 증감 후 HTMl점수
		int changeHtml = sc.nextInt();
		int beforeHtml = s.getHtml();
		int afterHtml = beforeHtml + changeHtml;
		System.out.printf("Html 점수가 수정되었습니다. 이전 점수 %d -> 현재 점수 %d\n",beforeHtml,afterHtml);
		s.setHtml(afterHtml);
		
		
	}
	
	
}
