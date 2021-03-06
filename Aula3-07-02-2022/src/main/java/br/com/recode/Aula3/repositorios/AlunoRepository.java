package br.com.recode.Aula3.repositorios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import br.com.recode.Aula3.entidades.Aluno;
@Component
public class AlunoRepository {
	
	private Map<String, Aluno> map= new HashMap<String, Aluno>(); // gambiarra provisoria
	
	public void save(Aluno aluno) {
		map.put(aluno.getMatricula(), aluno);
	}
	
	public Aluno findById(String matricula) {
		return map.get(matricula);
	}
	
	public List<Aluno> findAll(){
		return new ArrayList<>()<Aluno>(map.values());
	}
	

}
