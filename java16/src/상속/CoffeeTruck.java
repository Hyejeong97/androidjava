package 상속;

public class CoffeeTruck extends Truck{
	String coffee;
	
	public void sell() {
		System.out.println("팔다.");
	}

	@Override
	public String toString() {
		return "CoffeeTruck [coffee=" + coffee + ", size=" + 
							size + ", color=" + color + ", price=" + price + "]";
	}
	
}
