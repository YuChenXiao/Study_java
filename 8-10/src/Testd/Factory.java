package Testd;

public class Factory {
	
	public static Product getProduct(){
		System.out.println("Do something");
		return new Product();
	}
}
