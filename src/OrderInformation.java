import java.util.List;
import java.util.Map;
import java.util.Set;

public class OrderInformation {
	private int productId;
	private List<String> productNames;
	private Set<String> emials;
	
	private Map<String,Double>  productandprice;
	
	public Set<String> getEmials() {
		return emials;
	}
	public Map<String, Double> getProductandprice() {
		return productandprice;
	}
	public void setProductandprice(Map<String, Double> productandprice) {
		this.productandprice = productandprice;
	}
	public void setEmials(Set<String> emials) {
		this.emials = emials;
	}
	public int getProductId() {
		return productId;
	}
	@Override
	public String toString() {
		return "OrderInformation [emials=" + emials + "]";
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public List<String> getProductNames() { 
		return productNames;
	}
	public void setProductNames(List<String> productNames) {
		System.out.println("Setter method is called");
		this.productNames = productNames;
	}

}
