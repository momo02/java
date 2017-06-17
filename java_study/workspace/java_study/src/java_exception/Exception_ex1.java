package java_exception;

class EX1{
    private int[] arr = new int[3];
    
    EX1(){
        arr[0]=0;
        arr[1]=10;
        arr[2]=20;
    }
   
    public void z(int f, int s){
    	// 예외처리
    	
    	
    	try{
    		
    		System.out.println(arr[f] / arr[s]);
    		
    	
    	}catch(Exception e){
    		
    		System.out.println(e.getMessage()); //에러가 발생한 이유를 간단히 보여줌
    		System.out.println(e.toString());  //어떤 종류의 에러가 발생했는지. 해당 Exception클래스를 알려주고
    										   //에러가 발생한 이유를 간단히 보여줌
    		e.printStackTrace();  //위 내용 + 에러가 발생한 클래스와 그 위치를 알려준다.
    		
    	}
    
       System.out.println("여기도 출력된당");
    }
    
    
    
    
}

public class Exception_ex1 {
	public static void main(String[] args) {
		EX1 e = new EX1();
    	e.z(2,0);
    	e.z(10,1);
    }
}