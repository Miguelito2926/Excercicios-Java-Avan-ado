package com.example.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.backend.model.User;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {
@Autowired
	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

@Override
public void run(String... args) throws Exception {
	
	
	user.Repo.save(new User("Oswaldo","peres","Osvaldoperes@recode"));
	user.Repo.save(new User("Oswaldo","peres","Osvaldoperes@recode"));
	
	
	
}


}
