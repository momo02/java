package java_io2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


// FileInput/OutputStream은 파일에 입출력을 하기 위한 스트림
public class FileCopy {
	public static void main(String[] args) {
		try {
			
			FileInputStream fis = new FileInputStream("C:\\Users\\jung\\Desktop\\test.txt");
			FileOutputStream fos = new FileOutputStream("C:\\Users\\jung\\Desktop\\testCopy.txt",true); 
									  						//2번째 인자는 출력 시 기존의 파일내용의 마지막에 덧붙일지 여부
			
			int data = 0;
			while((data=fis.read())!=-1){
				fos.write(data); 
			}
			
			fis.close(); //사용하고 있던 자원을 반환
			fos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
