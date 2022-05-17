package ai.jobiak.source;

public class NonSubClass extends A {

	public NonSubClass(){
		
		A obj=new A();
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
	}
}
