package java_exception;



class EX2{
    private int[] arr = new int[3];
    int first;
    int second;
    
    EX2(){
        arr[0]=0;
        arr[1]=10;
        arr[2]=20;
    }
    
    public void num(int first, int second)throws Exception{
     //ArrayIndexOutOfBoundsException 발생 
   // if(first > 2 || second > 2{
    //	throw new ArrayIndexOutOfBoundsException("2이하의 인덱스 값만 사용할 수 있습니다."); //에러메시지를 지정해줄 수 있음
    	
   // }
    
    
     this.first = first;
     this.second = second;
    }
   
    public void z(){
     //ArithmeticException 발생 
    
     System.out.println(arr[first] / arr[second]);  // 2가지 형태의 예외가 발생할 수 있다.
    }
   
}

public class Exception_ex2 {
 public static void main(String[] args) {
  EX2 e = new EX2();
 
        //예외처리
	  try{
	        e.num(4, 0);
	        e.z();
	  }catch(Exception ex){

		ex.printStackTrace();
	  }
         
        //
    }
}