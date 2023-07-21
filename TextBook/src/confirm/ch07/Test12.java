package confirm.ch07;

class _A {
	public void method1() {
		System.out.println("A-method1...");
	}
}

class _B extends _A {
	public void method1() {
		System.out.println("B-method1...");
	}
}

class _C extends _A {
	public void method1() {
		System.out.println("C-method1...");
	}
	
	public void method2() {
		System.out.println("C-method2...");
	}
}

public class Test12 {

	public static void action(_A a) {
		a.method1();
		
		if(a instanceof _C c) {
			c.method2();
		}
	}
	public static void main(String[] args) {
		action(new _A());
		action(new _B());
		action(new _C());
	}
}
