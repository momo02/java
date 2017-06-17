package java_abstract;

public abstract class Employee {
	private String name;
	private int age;
	
	public Employee(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public abstract int pay();
	public abstract void print();
	
	public void display(){
		System.out.println("이름 : "+ name+"  나이 : "+ age);
	}
	
	// 정규직은 고정급 
	static class Regular extends Employee{
		
		private int salary;
		
		public Regular(String name, int age, int salary) {
			super(name, age);
			this.salary = salary;
			
		}


		@Override
		public int pay() {
			return salary;
		}
		
		//정규직은 고정급을 출력 
		@Override
		public void print() {
			super.display();
			System.out.println("급여는 " + pay() + "입니다.");
		}
		
	}
	//임시직은 일수*일당 
	static class Temporary extends Employee{
		private int day; 
		private int dailyPay; 
		
		public Temporary(String name,int age,int day,int dailyPay){
			super(name, age);
			this.day = day;
			this.dailyPay = dailyPay;
		}

		@Override
		public int pay() {
			return day * dailyPay;
		}
	
		
		// 일수 * 일당 
		@Override
		public void print() {
			super.display();
			System.out.println("급여는 " + pay() + "입니다.");
		}
		
	}
}


