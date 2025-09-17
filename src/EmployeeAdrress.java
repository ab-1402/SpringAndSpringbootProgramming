
public class EmployeeAdrress {
	private int pincode;
	private String city;
	private String country;
	
	 public EmployeeAdrress() {
		 System.out.println("Contsrutoe of adressemployee called");
	 }
	public int getPincode() {
		return pincode;
	}
	@Override
	public String toString() {
		return "EmployeeAdrress [pincode=" + pincode + ", city=" + city + ", country=" + country + "]";
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
