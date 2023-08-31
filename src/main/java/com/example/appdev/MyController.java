package com.example.appdev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {		
	
	@GetMapping(value="/deyyy")
	public String get() {
		return "PAAL DABBAA REALLY VERY NICEE DEY HAIR CUT THIS IS F4 U CUTEEEEHH, KISS EMOJI VERA ILA ITHULA SO TAKE IT THIS UMMMAA EEEEEE THEN GOOOD NYT MY GEM EHHH";
	}
		
}
