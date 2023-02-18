package br.com.ifms.lp2.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Teste")
public class Teste {

	@GetMapping("/mensagem")
	public String Message() {
		return "Teste";
	}
}