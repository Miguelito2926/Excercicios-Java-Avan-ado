package br.com.recode.Aula3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.recode.Aula3.entidades.Aluno;
import br.com.recode.Aula3.entidades.Turma;
import br.com.recode.Aula3.repositorios.AlunoRepository;
import br.com.recode.Aula3.repositorios.TurmaRepository;

@SpringBootApplication
public class Aula3Application implements CommandLineRunner {
	@Autowired
	private TurmaRepository turmaRepository;
	
	@Autowired
	private AlunoRepository alunoRepository;


	public static void main(String[] args) {
		SpringApplication.run(Aula3Application.class, args);
	}		
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Turma turmaJava = new Turma(1L,11L,"Java Web");
		Turma turmaReact = new Turma(2L,22L,"ReactJS");
		
		Aluno aluno1 = new Aluno (10L,"1010","Ednaldo",10,10);
		Aluno aluno2 = new Aluno (20L,"2020","Ednaldojr",9,9);
		
	}
	aluno1.setTurma(turmaJava);

}
