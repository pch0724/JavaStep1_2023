package chapter06;

public class Can {

	// 필드
	private String canName;//private : get/set or overloading constructor
	private int price;
	
	//overloading
	public Can(String canName, int price) {
		this.canName = canName;
		this.price = price;
	}
	
	//getter
	public String getCanName() {
		return canName;
	}

	public int getPrice() {
		return price;
	}
	
	
	
}
