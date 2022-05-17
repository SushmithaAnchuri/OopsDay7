package ai.jobiak.usesource;

import ai.jobiak.source.A;

public class NonSubClass extends A {

	public NonSubClass() {
		A obj=new A();
		//System.out.println(obj.a);
		//System.out.println(obj.b);
		System.out.println(c);
		//System.out.println(obj.c);
		System.out.println(obj.d);
	}
}
