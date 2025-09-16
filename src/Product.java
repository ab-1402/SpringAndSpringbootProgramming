
public class Product {
	private int productId;
	private String productName;
	private double productPrice;
	private boolean isExpired;

	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		System.out.println("Product id set by settermethod ");
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		System.out.println("Product name set by settermethod ");

		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		System.out.println("Product price set by settermethod ");

		this.productPrice = productPrice;
	}
	public boolean getIsExpired() {
		return isExpired;
	}
	public void setIsExpired(boolean isExpired) {
		System.out.println("Product expired set by settermethod ");

		this.isExpired = isExpired;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", isExpired=" + isExpired + ", getProductId()=" + getProductId() + ", getProductName()="
				+ getProductName() + ", getProductPrice()=" + getProductPrice() + ", getIsExpired()=" + getIsExpired()
				+ "]";
	}
	
	

}
