package com.app.raghu.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {

	@GetMapping("/message")
	public String showMsg() {
		return "WELCOME TO SPRING BOOT REST( BY MR. RAGHU)";
	}
}
