package edu.kh.oarr.model.service;

import java.util.Random;

import edu.kh.oarr.model.dto.Student;

// Service 클래스 : 기능 제공 클래스
// -> 입력, 출력 빼고 나머지
// ex) 로직(if, for)을 이용한 데이터 가공, 저장

public class StudentService {

	// 필드
	private Student[] students = new Student[10];
	// 학생 객체 참조 변수 10개 묶음인 Student[] 생성(할당)하고
	// 그 주소를 students 참조 변수에 대입
	
	
	// 기본 생성자
	public StudentService() {
		
		// 학생 객체 배열 (students)에 샘플 학생 3명 추가
		
		// students    의 자료형 : Student[] 
		// students[0] 의 자료형 : Student
		
		students[0] = new Student("24001", "최미영", '여');
		students[1] = new Student("24002", "홍길동", '남');
		students[2] = new Student("24003", "신짱구", '남');
				
		// students[3~9] == null
		
		
		// 자바에서 제공하는 난수 생성 객체
		Random random = new Random();
		
		// 샘플 학생 점수 초기화
		for(int i=0 ; i<students.length ; i++) { // 10바퀴
			
			// i번째 인덱스에 참조하는 학생이 없으면 반복 종료
			if(students[i] == null) break;
			
			// random.nextInt(101) : 0 이상 101 미만 정수형 난수 생성
			
			students[i].setHtml( random.nextInt(101) );
			students[i].setCss( random.nextInt(101) );
			students[i].setJs( random.nextInt(101) );
			students[i].setJava( random.nextInt(101) );
			
		}
		
	}
	
	
	/** 전달 받은 학생 객체(주소)를
	 *  students 객체 배열에서 
	 *  빈칸(null인 칸)에 대입
	 * 
	 * @param newStd : 전달 받은 학생
	 * @return 대입 성공 시 true, 실패 시(== 꽉 찼을 때) false
	 */
	public boolean addStudent( Student newStd ) {
		
		// students 배열의 인덱스 요소 중
		// 맨 처음 null인 부분을 찾아 newStd 대입
		
		for(int i=0 ; i<students.length ; i++) {
			if(	students[i] == null ) {
				students[i] = newStd;
				return true;
			}
		}
		
		return false; 
	}
	
	
	/** 학생 객체 배열(students) 참조 주소 반환
	 * @return students (주소)
	 */
	public Student[] getStudents() {
		return students;
	}
	
	
	/** 학생 1명 정보 조회(index 검색) 
	 * @param index
	 * @return 조회된 학생 또는 null
	 */
	public Student selectIndex(int index) {
		
		// java.lang.ArrayIndexOutOfBoundsException
		// -> 배열 인덱스 범위 초과 (0 부터 배열길이-1 까지)
		
		if(index < 0 || index >= students.length) {
			return null;
		}
		
		return students[index];
	}
	
	
	// 이름 일치하는 학생 조회
	// 일치하는 학생 정보 or null 반환
	public Student selectName(String name) {
		
		
		// students 객체 배열에서 null이 아니면서 이름과 name이 일치하는 학생 return
		
		/* 향상된 for문
		 * for(변수 : 배열 || 컬렉션) 
		 * - 배열 || 컬렉션의 요소를 처음부터 끝까지 순차 접근한 for문 
		 * - 매 반복마다 (배열 || 컬렉션) 요소를 하나씩 꺼내와 변수에 저장함*/
		
		for(Student s : students) {
			if (s == null) {// 저장된 학생이 없을 경우
				break;}
			if (s.getName().equals(name)) // 문자열을 비교하므로 비교연산자 == 를 쓰지 않음
			{return s;
				}
			}
		
		
		return null;
	}
	
	
	
	
	
	
// 학생 점수 조회
	public String selectScore(int index) {
		
		int html = students[index].getHtml();
		int css  = students[index].getCss();
		int js   = students[index].getJs();
		int java = students[index].getJava();
		
		int sum = html + css + js + java;
		double avg = (double) sum / 4;
		
		String result = String.format("HTML(%d) CSS(%d) JS(%d) Java(%d)", html,css,js,java);
		result += "\n합계 : " + sum;
		result += "\n평균 : " + avg;
	
		return result;
		
		
	}
	
	// 평균 최고점/최저점 구하기
	public String selectMaxMin() {
		
		Student maxStudent = null;
		Student minStudent = null;
		
		double maxAvg = 0.0;
		double minAvg = 0.0;
		
		
		for(Student s : students) {
			if(s == null) break; // 학생이 없으면 반복종료
			int sum = s.getHtml() + s.getCss() + s.getJs() + s.getCss();
			double avg = sum / 4.0;
			if(maxAvg == 0) { // 첫 번째 바퀴
				maxStudent = s;
				minStudent = s;
				maxAvg = avg;
				minAvg = avg;
				continue;
			}
			if(maxAvg < avg) {// 기존 최댓값보다 새로운 평균값이 더 큰경우
				maxAvg = avg;
				maxStudent = s;
			}
			if(minAvg > avg) {// 기존 최솟값보다 새로운 평균값이 더 작은경우
				minAvg = avg;
				minStudent = s;
			}
		}
		return String.format("최고점 : %s(%.1f)\n"
				+ "최저점 : %s(%.1f)\n",maxStudent.getName(),maxAvg,minStudent.getName(),minAvg);
	}
	
	
	
	
	
	
	
	
}
