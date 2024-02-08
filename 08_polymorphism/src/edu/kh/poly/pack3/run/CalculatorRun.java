package edu.kh.poly.pack3.run;

import edu.kh.poly.pack3.model.dto.Calculator;
import edu.kh.poly.pack3.model.dto.Machine;
import edu.kh.poly.pack3.model.dto.NTHCalculator;

public class CalculatorRun {

	
	public static void main(String[] args) {
		Calculator cal = new NTHCalculator();
		
		System.out.println(cal.plus(1, 5));
		System.out.println(cal.minus(5, 2));
		System.out.println(cal.multi(4, 8));
		System.out.println(cal.div(12, 3));
		System.out.println(cal.mod(15, 4));
		System.out.println("-----------------");
		System.out.println("sum : " + cal.sum(1,2,3,4,5,6,7,8,9,10));
		System.out.println(cal.areaOfCircle(4));
		System.out.println(cal.rangeCheck(5555));
		System.out.println(cal.rangeCheck(200_000_000));
		System.out.println(cal.pow(2,8));
		
		Machine machine = (Machine)cal;
		machine.powerOn();
		machine.powerOff();
		// 참조 변수의 자료형을 Machine으로 강제 형변환해야지만
		// powerOn(), powerOff(호출 가능)
		
		

	}
}
