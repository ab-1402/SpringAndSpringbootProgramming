
public class Address {
	private String location;
	private int pincode;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public void printMyAddress() {
		System.out.println(this.location + " " + this.pincode);
	}

}
