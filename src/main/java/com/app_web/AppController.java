package com.app_web;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "*")
public class AppController {
	
	@GetMapping("/Backend_info")
	public AppService showInfo() {
		AppService info = new AppService();
		return info;
	}
}
