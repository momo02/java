package java_abstract;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

import java_abstract.Employee.Regular;
import java_abstract.Employee.Temporary;

public class AbstractTest {
	public static void main(String[] args) {
		//정규직 
		Regular r = new Regular("박정하",25,500);
		
		
		//임시직
		Temporary t = new Temporary("홍길동", 300, 3, 500);
		
		r.print();
		t.print();
		
	}
}
