package com.helloword.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Hello")

public class HelloController {
	@GetMapping
	public String Hello()
	{
	return "Mentalidade de orientação ao detalhe,";
}
	
	
}
