package com.helloword.hello.P2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/HelloP2")


public class helloP2 {
	@GetMapping
	public String Hello()
	{
	return "Eu espero, aprender sem copiar e colar dos outros!!!";
}
	
	
}

