
public class Demo1 {
	
//	private int data;
	private Demo2 demo2;
	private Demo3 demo3;
	
	
	
	public Demo3 getDemo3() {
		return demo3;
	}



	public void setDemo3(Demo3 demo3) {
		this.demo3 = demo3;
	}



	public Demo2 getDemo2() {
		return demo2;
	}



	public void setDemo2(Demo2 demo2) {
		this.demo2 = demo2;
	}



	public void info() {
		System.out.println(demo3.getName());
	}
	

}
