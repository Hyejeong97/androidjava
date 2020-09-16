package 상속;

public class Truck extends Car {
	int size;
	
	public void stop() {
		System.out.println("정차하다.");
	}

	@Override
	public String toString() {
		return "Truck [size=" + size + ", color=" + color + ", price=" + price + "]";
	}
	
	
}
