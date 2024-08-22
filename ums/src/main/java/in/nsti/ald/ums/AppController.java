package in.nsti.ald.ums;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	@GetMapping("/")
	public String home() {
		return "index";
	}
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	@GetMapping("/team")
	public String team() {
		return "team";
	}
	@GetMapping("/courses")
	public String courses() {
		return "courses";
	}
	@GetMapping("/instructor")
	public String instructor() {
		return "instructor";
	}
	@GetMapping("/testimonial")
	public String testimonial() {
		return "testimonial";
	}
	
	@GetMapping("/Login")
	public String Login() {
		return "Login";
	}
	
}
