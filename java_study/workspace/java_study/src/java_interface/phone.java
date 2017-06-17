package java_interface;


interface inter1{
	void mp3();
}
interface inter2{
	void internet();
}
//inter1, inter2를 상속받으시오   //인터페이스만   유일하게 다중상속을 할 수 있다
interface iphone extends inter1, inter2 {
	
	void iph();
}
	//inter1, inter2를 상속받으시오
interface galaxy extends inter1, inter2  {
	
	void aaa();
	
}

//interface iphone과 galaxy를 구현
public class phone implements iphone, galaxy{

	
	public static void main(String[] args) {
		phone  p = new phone();
		
		p.mp3();
		p.internet();
		p.iph();
		
		
	}

	@Override
	public void mp3() {
		// TODO Auto-generated method stub
		System.out.println("노래가 나옵니다~");
	}

	@Override
	public void internet() {
		// TODO Auto-generated method stub
		System.out.println("인터넷을 접속합니다~");
	}

	@Override
	public void iph() {
		// TODO Auto-generated method stub
		System.out.println("~?");
	}

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}
	
}
