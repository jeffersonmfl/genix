package br.com.sistemaescolar.genix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class GenixApplication {

	public static void main(String[] args) {
		SpringApplication.run(GenixApplication.class, args);
	}
	
	@RequestMapping
	@ResponseBody
	public String home (){
		return "Genix";
	}

}
