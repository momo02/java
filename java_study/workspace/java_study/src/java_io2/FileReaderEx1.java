package java_io2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderEx1 {
	
	
	public static void main(String[] args) {
	
		
		
		try {
			
			
			File f = new File("C:\\Users\\jung\\Desktop\\test1.txt");
			
			FileInputStream fis = new FileInputStream(f);
			
			int data = 0;
			
			//FileInputStream을 이용해서 파일 내용을 읽어 화면에 출력.
			while((data=fis.read())!=-1){
				System.out.print((char)data);
			}
			
			System.out.println();
			//fis.close();
			
			
			FileReader fr = new FileReader(f);
			
		
			
			//FileReader를 이용해서 파일 내용을 읽어 화면에 출력 
			while((data=fr.read())!=-1){
				System.out.print((char)data);
			}
			
			System.out.println( ">>" + fr.getEncoding()); //OS에서 사용하는 기본 인코딩의 문자로 변환 
			
			System.out.println();
			fr.close();
			
			
			FileInputStream fis2 = new FileInputStream(f);
			InputStreamReader isr = new InputStreamReader(fis2,"EUC-KR");
			//바이트기반 스트림을 문자기반 스트림으로 연결시켜주는 역할을 하는 문자기반 보조스트림
			//지정된 인코딩을 사용하는 InputStreamReader를 생성.
			while((data=isr.read())!=-1){
				System.out.print((char)data);
			}
			
			isr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
