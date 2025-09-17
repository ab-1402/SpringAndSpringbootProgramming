import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SprintApplication2 {

	public static void main(String[] args) {
		
		ApplicationContext container=new FileSystemXmlApplicationContext("C:\\Users\\abhay\\eclipse-workspace\\FirstSpringProgram\\spring2.xml");
		// TODO Auto-generated method stub
		Patient p1=(Patient)container.getBean("patient1");
		
		CartItem cr=(CartItem)container.getBean("cart1");
		CartItem cr1=(CartItem)container.getBean("cart2");
		
		System.out.println(cr1.getItemNames());
		CartItem cr2=(CartItem)container.getBean("cart3");
		
		System.out.println(cr2.getItemnumbers());
		System.out.println(cr2.getItemprice());



	}

}
