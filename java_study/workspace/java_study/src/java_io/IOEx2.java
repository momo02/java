package java_io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx2 {

public static void main(String[] args){
		
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		byte[] temp = new byte[10];
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc); //byte배열을 읽기위한 inputStream 생성
											 //(생성 시 읽을 byte배열을 파라미터로 넘김)
		output = new ByteArrayOutputStream(); //byte배열을 쓰기위한 inputStream 생성
	
		input.read(temp,0,temp.length);  //읽어 온 데이터를 배열 temp에 담는다. 
		output.write(temp,5,5);  //temp[5]부터 5개의 데이터를 write한다. 
		  ///한번에 배열의 크기만큼 읽고 쓸 수 있어 작업 효율 증가  
		
		outSrc = output.toByteArray(); //스트림의 내용을 byte배열로 반환
		
		System.out.println("Input Source : " + Arrays.toString(inSrc)); 
		System.out.println("temp : " + Arrays.toString(temp));
		System.out.println("Output Source : " + Arrays.toString(outSrc));

	}
}
