package java_io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

// ByteArrayInputStream,ByteArrayOutputStream
// 메모리,즉 바이트배열에 데이터를 입출력하는데 사용되는 스트림 
// 주로 다른 곳에 입출력하기 전에 데이터를 임시로 바이트배열에 담아서 변환 등의 작업을 하는데 사용.

//자주 사용되지않지만 스트림을 이용한 입출력 방법을 보여주는 예제.. 
//(스트림의 종류가 달라도 읽고 쓰는 방법은 동일)

public class IOEx1 {
	
	public static void main(String[] args){
		
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc); //byte배열을 읽기위한 inputStream 생성
											 //(생성 시 읽을 byte배열을 파라미터로 넘김)
		output = new ByteArrayOutputStream(); //byte배열을 쓰기위한 inputStream 생성
		
		/////이부분 중요(스트림의 종류가 달라도 읽고 쓰는 방법은 동일.)
		int data = 0;
		
		while((data = input.read())!=-1){ //더 이상 읽어 올 데이터가 없을때까지 반복
			output.write(data); 
		}
		////////read()와 write(int b)를 사용하기때문에 한번에 1byte만 읽고 쓰므로 작업효율 떨어짐 
		
		outSrc = output.toByteArray(); //스트림의 내용을 byte배열로 반환
		
		
		System.out.println("Input Source : " + Arrays.toString(inSrc)); 
		System.out.println("Output Source : " + Arrays.toString(outSrc));

		// cf) System.out으로 배열을 출력해야할때. 
		//     String.toString() Integer.parseInt() 처럼 
		//     (java.util.)Arrays.toString()을 사용 
		
		// cf) 바이트 배열을 사용하는 자원이 메모리 밖에 없으므로 가비지 컬렉터에 의해 자동적으로 자원을 반환하므로
		//     close()를 이용해서 스트림을 닫지않아도 됨 
	}
	
	
}
