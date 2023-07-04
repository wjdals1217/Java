package sub3;

import java.util.Set;

public class Person {
	
	private String name;
	private int age;
	
	// 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Getter, Setter

	public void setName(String name) {
	this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
