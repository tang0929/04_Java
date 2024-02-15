package edu.kh.io.pack3.run;

import edu.kh.io.pack3.model.service.ObjectService;

public class ObjectRun {
	
	public static void main(String[] args) {
		
		ObjectService service = new ObjectService();
		service.objectInput();
		// NotSerializableException 오류 발생 [직렬화 안됨]
		// edu.kh.io.pack3.model.dto.Member
		
	}

}
