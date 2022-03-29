package br.com.recode.Aula3.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.recode.Aula3.entidades.Turma;
import br.com.recode.Aula3.repositorios.TurmaRepository;

@Controller
@RequestMapping (value = "/turmas")
public class TurmaResource {
	@Autowired
	private TurmaRepository turmaRepository;
	
	GetMapping
public ResponseEntity<List<Turma>> findAll(){
		List<Turma> turmas = turmaRepository.findAll();
		return ResponseEntity.ok().body(turmas);
	}
	@GetMapping(value = "/{codigo}")
	public ResponseEntity<Turma>findById(@PathVariable String codigo ){
		Turma turma = turmaRepository.findById(codigo);
		return ResponseEntity.ok().body(turma);
	}
	
}