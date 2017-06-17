package java_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Quiz1 {
	
	
	public static void main(String[] args){
		

		ArrayList original = new ArrayList(10);
		ArrayList copy = new ArrayList(10);
		
		//1. original 컬렉션 객체(인스턴스)에 문자열 "1"부터 "10"까지 저장.
	
		
		//2. original 컬렉션 객체를 통해  Iterator객체를 반환.
	
		
		//3. Iterator 객체를 이용해
		//  original객체에 저장된 요소를 copy 객체에  저장하고, 저장한 값을 original 객체에서 삭제한다. 
	
		
		//4. 결과 출력 
		print(original,copy);
		
	
	}

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("original: "+list1);
		System.out.println("copy: "+list2);
	}
	
	
}
