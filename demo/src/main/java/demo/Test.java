package demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class Test {
	@ResponseBody
	@RequestMapping("/test")
	public String copyProductInfo() {
		return "1234567890888";
	}
}
