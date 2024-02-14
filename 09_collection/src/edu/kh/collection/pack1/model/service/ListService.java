package edu.kh.collection.pack1.model.service;

import java.util.List;
import java.util.Scanner;

import edu.kh.collection.pack1.model.dto.Book;

import java.util.ArrayList;
import java.util.LinkedList;

// Collection (프레임 워크) : Java에서 자료구죠를 만들어서 모아둔 것
// java.util에 존재


/* 컬렉션의 특징
 * 1) 크기 제한이 없음(부족하면 자동으로 증가)
 * 2) 추가, 수정, 삭제, 검색 등 다양한 기능 구현
 * 3) 객체만 저장 가능(기본 자료형은 안됨 하지만 Wapper 클래스 이용하면 가능)
 * 
 */

public class ListService {
	
	// List : 자료를 순차적으로 나열한 자료 구조(배열 비슷)
	// - 인덱스가 존재함 -> 인덱스로 순서가 구분되기 때문에 중복 데이터 저장 가능
	
	
	// List 사용해보기
	public void method1() { 
		// List 객체 생성
		// List(인터페이스) -> 객체 생성 불가 -> 다형성 이용
		// ArrayList(클래스) List의 후손
		
		// List list = new ArrayList(); // 기본 10칸짜리로 생성
		List list = new ArrayList(3); // 3칸 짜리로 생성
		
		
		// 반환명 메서드명(매개변수)
		
		// 1. boolean add(E e) : 마지막 요소로 추가
		//     E(Element) : 요소를 뜻하는 상징적인 글자로 자료형아님
		//     Object, String, Student 등 자료형 가리지 않고 들어감
		
		list.add("아무거나");
		list.add(new Object());
		list.add(123456);
		list.add(3.14159);
		list.add(false);
		System.out.println(list);
		// list가 3칸을 초과했음에도 오류 없음. 자동으로 늘어났기 때문
		
		
		// 2. E get(int index) : List에서 index 번째 요소 반환 받기
		
		// 3. int size() : List에 저장된 요소(객체)의 개수 반환
		
		
		// 0번 부터 List에 저장된 개수 미만까지 1씩 증가하여 반복
		// (0 ~ 마지막 인덱스)
		for(int i = 0 ; i<list.size(); i++) {
			System.out.printf("%d번째 인덱스 : ", i);
			System.out.println(list.get(i));
			
		// List의 i번째 요소가 String인 경우
		
		if(list.get(i) instanceof String) {
			System.out.println("[String 자료형 입니다]\n");
			continue;
		} 
			
		// List의 i번째 요소가 int인 경우
		// if(list.get(i)  instanceof int ) {}
		// Incompatible conditional operand types Object and int 오류
		
		// int가 Integer(Wrapper Class)로 컴파일러가 자동으로 변환
		
		if(list.get(i) instanceof Integer) {
			System.out.println("*Integer 자료형입니다*\n");
		}
		
		// List의 i번째 요소가 double인 경우 (Double 변환)
		if(list.get(i) instanceof Double) {
			Double d = (Double)list.get(i); // 다운 캐스팅
			System.out.println("double의 바이트 크기 : "+d.BYTES);
		}
			
		
		// Object 타입은 최상위 부모이기 때문에 아무거나 다 참조 가능
		Object[] test = new Object[5];
		test[0] = "가나다라";
		test[1] = 135;
		test[2] = true;
		test[3] = 2.71;
		
		
		}
		
		
		
	}
	
	
	
	// 컬렉션 List + 제네릭(타입 제한)
	public void method2() {
		
		/* 컬렉셔 장점 중 "여러 타입을 저장 가능"이 
		 * 코드 길이를 증가시키는 주범 
		 * generic을 이용해 타입을 하나로 제한시키고 코드 길이를 감소시킴 */
		
		// String 타입으로 제한된 ArrayList 객체 생성
		List<String> strList = new ArrayList<String>();
		
		
		// 제네릭의 타입 제한 확인
		strList.add("볶음밥");  // 괄호 안에 Object가 아닌 String만 집어넣도록 바뀜
		strList.add("감자"); 
		strList.add("치킨");  
		// strList.add(123);  
		// String이 아닌 다른 타입이 들어갈 경우 오류발생
		
		
		for(int i = 0 ; i < strList.size(); i++) {
			String foodName = strList.get(i);
			System.out.printf("%d번째 인덱스 : %s\n",i,foodName);
		}
		
		
		
		
		// 3. void add(int index, E e) : index번재에 중간 삽입
		strList.add(1,"찜닭");
		// strList[1]에 찜닭이 들어가고 뒤의 index가 밀림
		
		
		// 4. String toString() : List에 저장된 모든 요소 문자열 반환
		System.out.println(strList.toString());
		
		
		// 5. E set(int index,E e) : index번째 요소를 e로 수정
		// -> 수정 전 요소가 반환
		String before = strList.set(2, "양념치킨");
		// strList[2]를 양념치킨으로 수정 
		System.out.println("수정 전 : " + before);
		System.out.println("수정 후 : " + strList.get(2));
		System.out.println(strList);
		
		
		
		// int indexOf(E e) : List 내부에 e와 같은 요소가 있으면 해당 인덱스
		// 없으면 -1 반환
		
		System.out.println(strList.indexOf("볶음밥")); // List 내부에 있음 0 반환
		System.out.println(strList.indexOf("떡볶이")); // List 내부에 없음 -1 반환
		
		
		
		// 7. boolean contains(E e)
		// List 내부에 e와 같은 요소가 있으면 true 없으면 false
		System.out.println(strList.contains("볶음밥")); // true
		System.out.println(strList.contains("떡볶이")); // false
		
		
		// 8. E remove(int index)
		// index 번째 요소를 제거(추출) -> 제거된 요소 반환
		String target = strList.remove(0); // 0번째 인덱스 요소 제거
		
		System.out.println("제거된 요소 : " + target);
		System.out.println(strList);
		// 0번째 index가 제거되고 나머지가 인덱스 요소가 앞당겨짐
		
		
		
		
	}
	
	/* Book으로 제한된 List객체를 생성 후 추가 조회 수정 제거 구현
	 * */
	public void BookManage () {
		
		
		/* ArrayList : 배열 형태의 리스트
		 * 장점 : 검색이 빠름
		 * 단점 : 중간 삽입 및 제거가 어려움
		 * 
		 * LinkedList : 연결된 형태의 리스트(기차)
		 * 장점 : 중간 삽입 및 제거가 빠름
		 * 단점 : 검색이 느림 */
		
		List<Book> bookList = new ArrayList<Book>();
		// ArrayList를 LinkedList로도 사용 가능(import는 해줘야함)
		
		Scanner sc = new Scanner(System.in);
		
	
		int input = 0; // 메뉴 번호 입력하기 위한 변수

		
		do {
			System.out.println("------------도서 관리 프로그램----------");
			System.out.println("1. 추가");
			System.out.println("2. 전체 조회");
			System.out.println("3. index로 조회");
			System.out.println("4. 수정");
			System.out.println("5. 제거");
			System.out.println("0. 종료");
			
		
		
		System.out.println("----------------------------------------");
		
		System.out.print("메뉴 번호 입력 >>>>> "); 
		
		input = sc.nextInt();
		
		sc.nextLine(); // 스캐너 버퍼에 남아있는 개행 문자 제거
		
		switch(input) {
		
		case 1: 
			System.out.print("제목 입력 : ");
			String title = sc.nextLine();
			System.out.print("작가 입력 : ");
			String writer = sc.nextLine();
			System.out.print("가격 입력 : ");
			int price = sc.nextInt();
			
			// BookList.add()는 boolean속성을 띄어 true를 반환함
			if(bookList.add(new Book(title, writer, price))) {
				System.out.println("추가 성공");
			}
			break;
		case 2:
			System.out.println("\n--------전체 조회---------\n");
			for(Book b : bookList) System.out.println(b);
			
			break;
			
		case 3: 
			System.out.print("조회할 책의 인덱스를 입력 : ");
			int index = sc.nextInt();
			if(index >= 0 && index < bookList.size()) { // 정상
				System.out.println(bookList.get(index));
			} else {
				System.out.println("[인덱스 범위 불일치]");
			}
			break;
		case 4: 
			// index를 정상적으로 입력했다고 가정
			System.out.print("\n------------[책 수정]----------\n");
			System.out.println("수정할 책의 인덱스 번호 : ");
			index = sc.nextInt();
			sc.nextLine(); // 버퍼 개행문자 제거
			System.out.print("수정할 책 제목 : ");
			title = sc.nextLine();
			System.out.print("수정할 책 작가 : ");
			writer = sc.nextLine();
			System.out.print("수정할 책 가격 : ");
			price = sc.nextInt();
			
			Book after = new Book(title, writer, price); // 새로운 책
			Book before = bookList.set(index, after); // 책 바꾸고 이전 책 추출
			System.out.print("전 : \n" + before);
			System.out.print("후 : " + after);
			break;
		case 5: 
			System.out.print("\n---------[책 정보 제거]----------\n");
			System.out.println("제거할 책의 인덱스 번호 : ");
			index = sc.nextInt();
			Book target = bookList.remove(index);
			System.out.println("제거된 책 : " + target);
			break;
		case 0: System.out.println("\n[프로그램 종료]\n"); break;
		default: System.out.println("\n[잘못 입력]\n"); break;
		}
		
	}while( input != 0 ); // input이 0이 아닐때까지 반복(최소 1회 시행)

}
}

