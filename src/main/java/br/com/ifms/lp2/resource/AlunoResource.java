package br.com.ifms.lp2.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="api/Aluno")

public class AlunoResource {
	@GetMapping("/MeuNome/{nome}")
	public String getMeuNome(@PathVariable String nome) {
		return "Meu nome é: "+ nome;
	}
}