package com.hellodocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ControllerClass {
	
		@GetMapping("/hellodocker")
		public String helloWorld() {
			
			return "Hello!! Welcome to world of jenkins with docker";
		}

}
