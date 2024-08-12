package in.nsti.ald.routing;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class controller {
	@GetMapping("/")
	public String home() {
		return "index";
	}
	

	@GetMapping("/about")
	public String about() {
		return "about";
		}
}
