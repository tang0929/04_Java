package edu.kh.poly.pack3.model.service;

import edu.kh.poly.pack3.model.dto.Computer;
import edu.kh.poly.pack3.model.dto.Machine;
import edu.kh.poly.pack3.model.dto.Washer;

public class MachineService {
	public void method1() {
		// 인터페이스(접점)도 부모 타입 참조 변수ㅗㄹ 사용 가능
		// -> 다형성의 업캐스팅
		// + 반환형의 다혓ㅇ성
		// + 부모 타입 객체 배열
		// + 동적 바인딩
		
		Machine[] arr = new Machine[2];
		// Machine[] arr : Machne[] 배열을 참조하는 주소를 저장할 참조형 변수 arr선언
		
		// new Machine[2] : Heap  영역에 Machine 참조 변수 2칸짜리 배열 생성
		
		arr[0] = new Computer();  // 업캐스팅 적용
		arr[1] = new Washer();
		
		for(Machine temp : arr) {
			temp.powerOn();
			temp.powerOff();
			System.out.println("------------------------------------------");
			
			
		}
		
	}
}
