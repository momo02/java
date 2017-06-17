package java_collection;

import java.util.HashMap;

public class HashMapEx2 {
	
	public static void main(String[] args){
		
		HashMap hsMap = new HashMap();
	
		hsMap.put("name","박정하");
		hsMap.put("age",25);
		hsMap.put("address","인천");
		
	    String name = (String)hsMap.get("name");
		int age =(int)hsMap.get("age");
		String address= (String)hsMap.get("address");
		
		System.out.println(name+" "+age+" "+address+" ");
		
	}

}
