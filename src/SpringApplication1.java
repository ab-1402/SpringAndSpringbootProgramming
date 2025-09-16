import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import java.util.List;

public class SpringApplication1 {

	public static void main(String[] args) {
		ApplicationContext container=new FileSystemXmlApplicationContext("C:\\Users\\abhay\\eclipse-workspace\\FirstSpringProgram\\spring.xml");
		Product p1=(Product)container.getBean("product1");
		System.out.println(p1);
		OrderInformation o1=(OrderInformation)container.getBean("order1");
		System.out.println(o1.getProductId());
		System.out.println(o1.getProductNames());
		System.out.println(o1.getEmials());
		System.out.println(o1.getProductandprice());
	}

}
