package in.nsti.ald.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

//import ch.qos.logback.core.model.Model;

@Controller
public class AppController {
	
	@Autowired
	private studentRepository std;
	
	
	@GetMapping("/")
	public String home(Model m1) {
		m1.addAttribute("s1", new StudentModel());
		return "index";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute StudentModel s, Model m) {
		System.out.println(s);
		System.out.println("Welcome" + " "+ s.getFname());
		m.addAttribute("id",s.getId() );
		m.addAttribute("fname",s.getFname() );
		m.addAttribute("lname",s.getLname() );
		m.addAttribute("mail",s.getMail() );
		m.addAttribute("password",s.getPassword() );
		m.addAttribute("Cpassword",s.getCpassword() );

		std.save(s);
		return "register";
	}

}
