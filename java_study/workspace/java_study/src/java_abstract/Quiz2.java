package java_abstract;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Quiz2 {
	
	static HashMap phoneBook = new HashMap();
	
	public static void main(String[] args) {
		
		addPhoneNo("가족","철수","010-111-1111");
		addPhoneNo("가족","영희","010-222-2222");
		addPhoneNo("친구","짱구","010-333-3333");
		addPhoneNo("친구","훈이","010-444-4444");
		addPhoneNo("회사","맹구","010-555-5555");
		addPhoneNo("회사","짱구","010-666-6666");
	
		printList();
	
	}
    
	
	//그룹을 추가하는 메서드
	static void addGroup(String groupName){
		if(!phoneBook.containsKey(groupName)){ //HashMap에 지정된 키가 포함되어있는지 확인 
			//System.out.println(groupName);	
			
			phoneBook.put(groupName, new HashMap()); 
				
		}
	}
	
	//그룹에 전화번호를 추가하는 메서드
	static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap group = (HashMap)phoneBook.get(groupName);
		group.put(tel,name); 
	}
	
	
	//전화번호부 전체를 출력하는 메서드를 작성하시오!!
	static void printList(){
		
		
		
		
	}

}
