package java_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


//커맨드라인으로 부터 파일명과 숫자를 입력받아서,
//입력받은 파일의 내용의 처음부터 입력받은 숫자만큼의 라인을 출력하는 프로그램을 작성.
// bufferedReader의 readLine()을 사용할 것.
public class Quiz {
   public static void main(String[] args){
	   
	   if(args.length != 2 || args[0] == null || args[1] == null){
		   System.out.println("USAGE : java Quiz 10 aaa");
		   System.exit(0); //or EXIT_SUCCESS;  ---> 정상적인 종료
	   }
	   
	
	   Integer lineNum = Integer.parseInt(args[0]);
	   
	   File f = new File(args[1]);
	   
	   //입력한 파일이 디렉토리이거나, 존재하지않을 경우 메시지 출력 후 종료
	   if(!f.exists() || f.isDirectory()){
		  System.out.println(f.getName()+"은/는 디렉토리이거나, 존재하지 않는 파일입니다.");
		  System.exit(0); //시스템 정상 종료
	   }
	   
	   try {
		   
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String line = "";
		
		
		for(int i=1; i<=lineNum; i++){ //입력받은 라인 수 만큼 출력한다.
			
			if((line = br.readLine()) != null){ //읽을 라인이 있을 경우에만 출력한다
				
				System.out.println(i + ":" + line);
				
			}else{
				
				System.out.println("더이상 읽어 올 데이터가 없습니다. 종료합니다.");
				break;
			}
			
		}
	
		/*int i = 1;
		while((line = br.readLine())!=null && i <= lineNum) {
			System.out.println(i + ":" + line);
			i++;
		}*/
		
		
		br.close(); 
		
		
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	   
	   
	     
   }
	
}
