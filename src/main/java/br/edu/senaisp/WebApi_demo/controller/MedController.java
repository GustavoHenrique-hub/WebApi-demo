package br.edu.senaisp.WebApi_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/med")
public class MedController {
	
	
	@GetMapping
	public String message() {
		return "Seu teste funcionou";
	}
}
