
public class Patient {
	private String pname;
	private int pid;
	private long mobile;
	public Patient( int pid, String pname,long mobile) {
		System.out.println("Contructor is invoked");
		this.pname = pname;
		this.pid = pid;
		this.mobile = mobile;
	}
	

}
