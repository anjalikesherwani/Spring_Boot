package in.nsti.ald.routing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbconnectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbconnectionApplication.class, args);
		System.out.println("connected");
	}

}
