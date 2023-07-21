package confirm.ch08;

interface A {}

class B implements A {}

class C implements A {}

class D extends B {}

class E extends C {}

public class Test4 {
	
	public static void method(A a) {
		System.out.println("method 호출...");
	}
	
	public static void main(String[] args) {
		method(new B()); 
		method(new C()); 
		method(new D()); 
		method(new E()); 
	}
}
