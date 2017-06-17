package java_io2;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx1 {
	public static void main(String[] args) {
		
		
		try {
			
			
			File f = new File("C:\\Users\\jung\\Desktop\\NewFile.txt");
				
			FileOutputStream fos = new FileOutputStream(f);
			//BufferedOutputStream의 버퍼의 크기를 5로 한다.
			BufferedOutputStream bos = new BufferedOutputStream(fos,5);
				
			for(int i='1'; i<='9'; i++){
				bos.write(i);
			}
		
			bos.close(); 
			 //flush를 호출해서  버퍼를 비우고(버퍼의 모든 내용을 출력소스에 출력)
			 //사용하던 모든 자원 반환.
			
			 
			 //* BufferedOutputStream의 close를 호출해주어야 버퍼에 남아있던 모든 내용이 출력됨.
			 //보조스트림을 close하면 내부적으로 기반 스트림의 close를 호출하기 떄문에  
			 //기반스트림의 close나 flush를 호출할 필요 x.
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
