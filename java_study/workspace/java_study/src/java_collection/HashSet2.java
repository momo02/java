package java_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet2 {

	public static void main(String[] args){
		
		
		HashSet list = new HashSet();
		
		list.add("1");
		list.add(4);
		list.add("3");
		list.add(5);
		list.add("O");
		
		System.out.println(list);
		
		//Enumeration 
		//컬렉션 프레임웍이 만들어지기 이전에 사용하던 것으로 
		//이전버전으로 작성된 소스와의 호환을 위해서 남겨두고 있을뿐이므로 가능하면 Enumeration 대신 Iterator을 사용할 것.
		  
							//get the Enumeration object
		/*Enumeration enu = Collections.enumeration(list);
			
		while(enu.hasMoreElements()){
			
			String st= (String)enu.nextElement();
			System.out.println(st);
			
		}*/
	
		

		
        /*Iterator it = list.iterator();
        while(it.hasNext()){
        	int st = (int)it.next();
        	
        	System.out.println(st);
        }
		*/
        //컬렉션의 요소를 읽어오는 방법을 표준화했기 때문에 
        //코드의 재사용성을 높다. 
        
        
		
		
	}


}
