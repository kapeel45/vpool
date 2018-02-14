package com.vpool.carpool;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarPoolController {

	@RequestMapping("/run")
	public String sayHi(){
		return "Running...";
	}
	
	
	
}
