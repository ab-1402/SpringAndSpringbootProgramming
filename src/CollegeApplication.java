
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class CollegeApplication {
	public static void main(String[] args) {
		ApplicationContext container=new FileSystemXmlApplicationContext("C:\\Users\\abhay\\eclipse-workspace\\FirstSpringProgram\\spring.xml");
		
		Object obj=container.getBean("address1");
		
		Address a1=(Address)obj;
		
		a1.printMyAddress();
		System.out.println(a1.getLocation());
		
		obj=container.getBean("address1");
		
		Address a2=(Address)obj;
		
		a2.setLocation("Chadwad");
		
		System.out.println(a2.getLocation());
		a2.printMyAddress();
		
		Student s1=(Student)container.getBean("student1");
		
		s1.setAddress(a2);
		System.out.println(s1.getName());
		System.out.println(s1.getRollnumber());
		System.out.println(s1.getAddress().getLocation());
		
	}
	
	
	

}
