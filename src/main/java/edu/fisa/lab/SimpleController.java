package edu.fisa.lab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	@GetMapping("getdata")
	public String get() {
		System.out.println("*******Test*******");
		return "0221_Jenkins_Test";
	}
}
