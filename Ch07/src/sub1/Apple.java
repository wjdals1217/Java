package sub1;

//extends Object가 Apple 뒤에 생략 되어 있음
public class Apple {

	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	@Override
	public String toString() {
		System.out.println("해시값 : " + hashCode());
		System.out.println("원산지 : "+country);
		System.out.println("가격 : "+price);
		return super.toString();
	}
}
