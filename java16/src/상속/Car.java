package 상속;

public class Car {
	String color;
	int price;
	
	public void drive() {
		System.out.println("운전하다.");
	}
	public void ride() {
		System.out.println("타다.");
	}
	@Override
	public String toString() {
		return "Car [color=" + color + ", price=" + price + "]";
	}
	
	
}
