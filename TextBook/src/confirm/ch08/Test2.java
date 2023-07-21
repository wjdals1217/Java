package confirm.ch08;

interface Parent {
	public final static int NUM = 10;
	public void show();
	default void method() {
		System.out.println("default method...");
	}
}

class Child implements Parent {
	@Override
	public void method() {
		System.out.println("default override method...");
	}
	
	@Override
	public void show() {
		
	}
}
public class Test2 {
	private Parent parent;
	
	public void method(Parent parent) {
		
	}
	
	public static void main(String[] args) {
		System.out.println(Parent.NUM);
		
		Parent[] parents = {};
	}

}
