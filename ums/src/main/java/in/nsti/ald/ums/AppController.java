package in.nsti.ald.ums;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

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
	
	@GetMapping("/fees")
	public String fees() {
		return "fees";
	}
	
	@GetMapping("/myprogreess")
	public String myprogreess() {
		return "myprogreess";
	}
	@GetMapping("/result")
	public String result() {
		return "result";
	}
	
	@GetMapping("/student_afterlogin")
	public String student_afterlogin() {
		return "student_afterlogin";
	}
	
}
