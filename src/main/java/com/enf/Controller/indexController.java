package com.enf.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "ENF")
public class indexController {
	
	@GetMapping(value = "/index")
	public String index() {
		
		return "index";
	}

}
