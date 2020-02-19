

public final class Product {
	private final String productName;
	private final String productDesc;
	private final double productPrice;
	private final int maxQuantity;
	
	
	
	public Product(String n, String d, double p, int m) {
		productName = n;
		productDesc = d;
		productPrice = p;
		maxQuantity = m;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public String getProductDesc() {
		return productDesc;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public int getMaxQuantity() {
		return maxQuantity;
	}
	
	
	public String toString() {
		return productName + " " + productDesc + " " + productPrice + " " + maxQuantity;
	}
	
	
}
