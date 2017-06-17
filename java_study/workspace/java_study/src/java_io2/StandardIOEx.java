package java_io2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class StandardIOEx {
	public static void main(String[] args){
		
		/*System.out.println("out : 안녕안녕");
		System.err.println("err : 안녕안녕");*/
		//System.out, System.err 모두 출력 대상이 콘솔 
		
		File f = new File("C:\\Users\\jung\\Desktop\\test2.txt");
		
		FileOutputStream fos = null;
		PrintStream ps = null;
		
		try {
			
			fos = new FileOutputStream(f);
			ps = new PrintStream(fos);
			
			System.setOut(ps);
			
			
			System.out.println("out : 안녕안녕");
			System.err.println("err : 안녕안녕");
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
