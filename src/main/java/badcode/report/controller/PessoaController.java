package badcode.report.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import badcode.report.entity.Pessoa;
import badcode.report.service.PessoaService;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;

	@GetMapping
	@ResponseBody
	public List<Pessoa> getPessoas() {
		return null; 
	}
	
	@PostMapping
	public List<Pessoa> addPessoa(@RequestBody Pessoa pessoa) {
		return pessoaService.add(pessoa); 
	}
}
