package in.nsti.allahabad.firstSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Dbconn1Application {

	public static void main(String[] args) {
		SpringApplication.run(Dbconn1Application.class, args);
		System.out.println("connected");
	}

}
