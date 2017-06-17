package java_thread;

public class Thread1 {
	


	public static void main(String[] args) {
		
		Go g = new Go();
		Come c = new Come();
		
		Thread tg = new Thread(g);
		Thread tc = new Thread(c);
		
		tg.start();
		tc.start();
	}
}

class Go implements Runnable{
	
	void go(){
		for(int i=1; i<10; i++){
			
			System.out.println("go: " + i);
		}
	}

	@Override
	public void run() {
		go();
	}
	
}

class Come implements Runnable{
	
	void come(){
		for(int i=1; i<10; i++){
			
			System.out.println("come: " + i);
		}
	}

	@Override
	public void run() {
		come();
		
	}
	
	
	
}
