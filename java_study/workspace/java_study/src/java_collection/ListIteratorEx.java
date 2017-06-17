package java_collection;

import java.util.*;

class ListIteratorEx {
    //단방향으로만 이동할 수 있는 Iterator를 상속받아
	//양방향으로의 이동이 가능하도록 기능을 추가한것.
	  //List인터페이스를 구현한 컬렉션에서만 사용 가능..
	
	public static void main(String[] args){
		
		ArrayList list = new ArrayList();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		ListIterator it =list.listIterator();
		
		while(it.hasNext()){
			System.out.println(it.next()); 
		}
		
		
		System.out.println();
		
		
		while(it.hasPrevious()){ //읽어올 이전 요소가 있으면 
			System.out.println(it.previous());  //이전요소를 읽어 온다.(역방향 진행)
		}
		
		
	}


}
