package in.nsti.ald.firstBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstBootApplication {

	public static void main(String[] args) {
		ApplicationContext cxt = SpringApplication.run(FirstBootApplication.class, args);
//		System.out.println("my Spring");
//		studentC s1 = new studentC();
//		s1.allahabad();
		studentC s1 = cxt.getBean(studentC.class);
		s1.allahabad();
		
		
	}

}
