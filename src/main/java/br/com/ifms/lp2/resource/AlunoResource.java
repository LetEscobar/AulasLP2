package br.com.ifms.lp2.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import br.com.ifms.lp2.repository.AlunoRepository;
import br.com.ifms.lp2.javabeans.Aluno;

@RestController
@RequestMapping(value = "api/Aluno")

public class AlunoResource {
	@Autowired
	AlunoRepository alunoRepository;

	@GetMapping("/MeuNome/{nome}")
	public String getMeuNome(@PathVariable String nome) {
		return "Meu nome é: " + nome;
	}

	@GetMapping("/MeuNomeSobrenome")
	public String getNomeSobreNome(@RequestParam String nome, @RequestParam String sobreNome) {
		return "Meu nome completo é: " + nome + " " + sobreNome;
	}

	@PostMapping("/inserir")
	public Aluno salvarAluno(@RequestBody Aluno aluno) {
		return alunoRepository.save(aluno);
	}
}
