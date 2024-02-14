package edu.kh.collection.pack2.model.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import edu.kh.collection.pack2.model.dto.Person;

public class SetService {

	/* Set
	 * - '집합'과 비슷한 개념
	 * - 기본적으로 순서를 유지하지 않음(index가 없음, get() 메서드가 없음
	 * - 중복 데이터를 저장 안함. 같은 객체가 들어오면 덮어씌움 
	 * 
	 * 
	 * Set 인터페이스의 자식 클래스
	 * 1. HashSet (대표) : 처리 속도가 빠른 Set 
	 * 2. LinkedHashSet : 순서를 유지하는 Set 
	 * 3. TreeSet : 자동 정렬되는 Set */
	
	
	/* HashSet 사용법 
	 * - 객체에 equals()가 Override 되어있어야함
	 * - 객체에 hashCode()가 Override 되어 있어야 함
	 * 
	 * String, Integer 등 자바에서 제공하는 객체는 모두 오버라이딩 되어있는 상태
	 * 
	 */
	
	public void method1() {
		
		// HashSet 객체 생성
		Set<String> set = new HashSet<String>(); // 다형성 업캐스팅
		// Set<String> set = new LinkedHashSet<String>(); // 다형성 업캐스팅
		
		// 1. boolean add(E e) : 추가
		set.add("네이버");
		set.add("카카오");
		set.add("라인");
		set.add("쿠팡");
		set.add("배민");
		set.add("당근마켓");
		set.add("토스");
		set.add("직방");
		set.add("야놀자");
		
		System.out.println(set); // 적은 순서대로 나오지 않음
		// LinkedHashSet을 사용하면 순서대로 출력
		
		set.add("배민");
		set.add("배민");
		set.add("배민");
		System.out.println(set); // 중복 출력 안됨.
		
		
		// null도 중복 X 확인
		set.add(null);
		set.add(null);
		System.out.println(set); // null 1회만 출력
		
		
		
		
		// 2. int size() : Set에 저장된 객체의 수 반환
		System.out.println("set.size() : " + set.size());
		
		
		
		// 3. boolean remove(E e) : 전달받은 e를 Set에서 제거
		// 제거를 성공하면 true 아니면 false 반환
		
		System.out.println(set.remove("배민")); // set 요소 제거 시도 -> true 
		System.out.println(set.remove("가마다")); // set 아닌 요소 제거 시도 -> false
		System.out.println(set); 
		// set에서 "배민"이 제거된 채로 출력
		
		
		
		
		// 4. contains(E e) : Set 안에 e가 있으면 true 없으면 false
		
		System.out.println("네이버가 있는지 확인 : " + set.contains("네이버")); 
		// set 안에 있는 요소 -> true
		System.out.println("다음이 있는지 확인 : " + set.contains("다음")); 
		// set 안에 없는 요소 -> false
		
		
		
		
		// 5. void clear() : Set에 저장된 내용 모두 삭제
		set.clear();
		
		
		// 6. boolean isEmpty() : 비어있으면 true, 아니면 false
		System.out.println("비어 있음? : " + set.isEmpty());
		// 앞서 set.clear()에서 모두 삭제했으므로 true 출력
		
		
		

	}
	
	/* set에 저장된 요소(객체)를 꺼내는 방법 
	 * 1. Iterator(반복자) 이용 
	 * 2. List로 변환
	 * 3. 향상된 for문 이용 */
	
	
	public void method2() {
		
		Set<String> set = new HashSet<String>();
		
		set.add("몽쉘");
		set.add("초코파이");
		set.add("쿠크다스");
		set.add("초코하임");
		set.add("콘칩");
		
		
		
		/* 1. Iterator(반복자) 
		 * 컬렉션 객체에 저장된 요소를 하나씩 순차 접근하는 객체 */
		
		// 사용 전 Iterator를 import하기
		// Iterator set.iterator() : 현재 set을 순차 접근할 수 있는 Iterator 객체 반환
		Iterator<String> it = set.iterator();
		
		// boolean Iterator.hasNext() 
		// 다음 순차 접근할 요소가 있으면 true 없으면 false 
		
		while(it.hasNext()) {
			// 다음 반복 요소가 있으면 반복 없으면 탈출
			
			// E Iterator.next() : 다음 요소를 꺼내와 반환
			String temp = it.next();
			System.out.println(temp);
			
			// set.add()한 요소들이 한 줄 씩 출력됨
			
		}
		
		System.out.println("----------------------------------");
		System.out.println("[List로 반환]");
		
		// 2. Set 저장된 객체를 이용해서 List를 생성
		List <String> list = new ArrayList<String>(set);
		
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		// 3. 향상된 for문으로 출력
		System.out.println("----------------------------------");
		System.out.println("[향상된 for문]");
		for(String snack:set) {
			System.out.println(snack);
		}
		
		
	}
	
	
	// 직접 만든 클래스(Person)를 이용해 만든 객체를 Set에 저장해서 중복 제거 확인)
		public void method3() {
			Person p1 = new Person("홍길동",25,'남');
			Person p2 = new Person("홍길동",25,'남');
			Person p3 = new Person("홍길동",30,'남');
			Person p4 = new Person("김길순",20,'여');
			
			// hashCode() : 객체 식별 번호(정수)
			// - 같은 필드 값을 가진 객체는 번호가 같다!!
			System.out.println("p1 : " + p1.hashCode());
			System.out.println("p2 : " + p2.hashCode());
			System.out.println("p3 : " + p3.hashCode());
			System.out.println("p4 : " + p4.hashCode());
			
			// A.equals(B) : A와 B가 가지고 있는 필드 값이 같다면 true
			System.out.println("p1.equals(p2) : " + p1.equals(p2));
			System.out.println("p1.equals(p3) : " + p1.equals(p3));
			
			
			// Set 중복 제거 확인
			Set<Person> personSet = new HashSet<Person>();
			personSet.add(p1);
			personSet.add(p2);
			personSet.add(p3);
			personSet.add(p4);
			
			for(Person p : personSet) {
				System.out.println(p); // 25세의 홍길동이 한 번만 출력
			}
			
			/* Hash 라는 단어가 포함된 컬렉션 이용 시 
			 * hashCode(), equals() 오버라이딩은 필수!!*/
		}
		
		
		
		
		// TreeSet : 이진 트리 구조를 이용해 객체를 저장하는 Set
		// 기본 오름차순 정렬
		// 전제조건 : 저장되는 객체는 Comparable 인터페이스 상속 필수
		public void method4() {
			// 난수 생성
			// 1) Math.random()
			// 2) Random.nextInt() -> 사용할 것
			
			Random random = new Random();
			
			
			// Integer(객체, Wrapper Class) <=> int(기본 자료형)
			// Treeset import
			Set<Integer> lotto = new TreeSet<Integer>();
			
			while(lotto.size() < 6) {
				// lotto에 저장된 값 개수가 6개 미만일때 반복. 6개면 탈출
				lotto.add(random.nextInt(45)+1); // 1~45사이 난수 추가 중복은 알아서 제거
				
			}
			System.out.println(lotto);
		}

		
		
		
		// 로또 번호 생성기
		/* 금액을 입력받아(1000원 단위)
		 * 1000원당 1회씩 생성해서 List에 저장한 후 생성 종료시 한번에 출력 
		 * 
		 * 금액 입력 : 3000
		 * 1회 : [1,2,3,4,5,6]
		 * 2회 : [7,8,9,10,11,12] 
		 * 3회 : [13,14,15,16,17,18] */

		public void lottoNumberGenerator() {
			
			Random random = new Random();
			
			System.out.print("금액 입력 : ");
			Scanner sc = new Scanner(System.in);
			int money = sc.nextInt();
			
			
			// 생성된 로또 번호 묶음을 저장
			List<Set<Integer>> lottoList = new ArrayList<Set<Integer>>();
			
			if(!(money % 1000 == 0)) {
				System.out.println("1000원 단위로 다시 입력하시오");
				return;
			}
			
			
			Set<Integer> lotto = new TreeSet<Integer>();
			for(int i = 1;i<=(money/1000);i++) {
			while(lotto.size() < 6) {
				System.out.print("6개 번호를 입력 : ");
				 
				lotto.add(random.nextInt(45)+1);
				
				
				
				}
			lottoList.add(lotto); // List에 Set 추가
			
			/* for(int i = 0 , i < lottoList.size() ; i < size ; i++){
			 * System.out.println((i+1) + "회 : " + lottoList.get(i));
			 * + for문 안에 Set<Integer>를  .  집어넣어야 함
			 * 반복시 마다 List 안에 각 인덱스에 서로 다른 Set 참조 주소가
			 * 저장되어야 함*/ 
			       
			System.out.println(i+"회 : "+lotto);
			lotto.clear(); 
			// 출력시킨 로또 번호를 지우고 다시 for문 처음으로 돌아가 재생성
				
			}
		
	
		}
		
		
		
		
	
}

