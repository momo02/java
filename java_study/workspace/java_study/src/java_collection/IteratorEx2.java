package java_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratorEx2 {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		
		map.put("짱구",60);
		map.put("철수",100);
		map.put("영희",90);
		map.put("맹구",30);
		map.put("훈이",10);
		
		
		
		
		Set set = map.entrySet();	
		//HashMap에 저장된 키와 값을 엔트리(키와 값의 결합)의 형태로 Set에 저장해서 반환 
		
		Iterator it = set.iterator();
		
		while(it.hasNext()){
			
			Map.Entry e =(Map.Entry)it.next();
			
			System.out.println("이름 : " + e.getKey()+", 점수 : " + e.getValue());
			
		}
		
		
	}
	
}
