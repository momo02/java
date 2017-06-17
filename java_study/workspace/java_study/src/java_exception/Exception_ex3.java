package java_exception;


import java.io.*;

class File{
	void run()throws Exception{
	
        BufferedReader bReader = null;
        String input = null;
        
        bReader = new BufferedReader(new FileReader("out.txt"));
        input = bReader.readLine();
        
     /*   try {
            bReader = new BufferedReader(new FileReader("out.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try{
            input = bReader.readLine();
        } catch (IOException e){
            e.printStackTrace();
        }
           */ 
        System.out.println(input); 
    }
}

class File2{
    void run(){
    	File f = new File();
    	
    	try{
    		
            f.run();
    		
    	}catch(Exception e){
    		
    		e.printStackTrace();
    	}
        		System.out.println("안녕안녕");
    }
}


public class Exception_ex3 {
	public static void main(String[] args) throws IOException {
		File2 f2 = new File2();
        f2.run();
	 }
}
