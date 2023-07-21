package confirm.ch07;

class Parent {
	public String name;
	
	public Parent(String name) {
		this.name = name;
	}
}

class Child extends Parent {
	public int stdNo;
	
	public Child(String name, int stdNo) {
		super(name);
		this.stdNo = stdNo;		
	}
}

public class Test06 {	
	public static void main(String[] args) {
		
	}

}
