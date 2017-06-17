package java_collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetEx {

	
	public static void main(String[] args){
		                      
		Object[] objArr = {"1",new Integer(1),"2","2","2","A","A","B","B"};
		
		Set set = new HashSet(); 
		
		for(int i=0; i<objArr.length; i++){
			
			set.add(objArr[i]); //HashSet에 objArr요소들을 저장 
		}
		
		System.out.println(set);
		
		
	}
	
}




