import java.util.List;
import java.util.Map;
import java.util.Set;

public class CartItem {
	
	private String name;
	private List<String> itemNames;
	private Set<Integer> itemnumbers;
	private Map<String,Double> itemprice;
	
	
	public CartItem() {
		super();
		System.out.println("Constructor is called with  no argument");

		
	}

	public CartItem(Map<String,Double> itemprice) {
		super();
		System.out.println("Constructor is called with  map argument");

		
	}

	public Set<Integer> getItemnumbers() {
		return itemnumbers;
	}

	public void setItemnumbers(Set<Integer> itemnumbers) {
		this.itemnumbers = itemnumbers;
	}

	public CartItem(Set<Integer> itemnumbers, Map<String,Double> itemprice) {
		super();
		System.out.println("Constructor is called with  no argument");
		this.itemnumbers=itemnumbers;	
		this.itemprice=itemprice;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getItemNames() {
		return itemNames;
	}

	public void setItemNames(List<String> itemNames) {
		this.itemNames = itemNames;
	}

	public CartItem(String name, List<String> itemNames) {
		System.out.println("Constructor is called with two argument");
		this.name = name;
		this.itemNames = itemNames;
	}
	public CartItem(String name) {
		System.out.println("Constructor is called with onr name argument");

		this.name = name;
	}
	public CartItem(List<String> itemNames) {
		System.out.println("Constructor is called with onr list argument");

		this.itemNames = itemNames;
	}

	public Map<String,Double> getItemprice() {
		return itemprice;
	}

	public void setItemprice(Map<String,Double> itemprice) {
		this.itemprice = itemprice;
	}
	
	

}
  