package java_io2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx1 {
	public static void main(String[] args) {
		
		
	try {	
		
		String currDir = System.getProperty("user.dir"); //현재 프로그램이 실행중인 디렉토리
		
		File d = new File(".\\src\\java_io2\\BufferedReaderEx1.java");
		//File f = new File(currDir+"\\src\\java_io2","BufferedReaderEx1.java");
		File f = new File(d.getCanonicalPath());
		
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String line = "";
		             
						//데이터를 라인단위로 읽는다.
			for(int i=1; (line=br.readLine())!=null;i++){
					System.out.println(i + " : " + line);
			}
				
		br.close();	
			
	} catch (IOException e) {
		
		e.printStackTrace();
	}
				
	// C:\development\java_study\workspace\java_study\src\java_io2		
	//C:\development\java_study\workspace\java_study\src\java_io2\javaBufferedReaderEx1.java
		
		
	}
}
