package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/")
	public String index() {
		return "Hello World from chòa!";
	}

	@GetMapping("/user")
	public String userPage() {
		return "Only for User can access this page";
	}

	@GetMapping("/admin")
	public String adminPage() {
		return "Only for Admin can access this page";
	}

}
