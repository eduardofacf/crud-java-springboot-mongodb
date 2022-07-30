package com.eduardofacf.crudmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.eduardofacf.crudmongo.domain.User;
import com.eduardofacf.crudmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... arg0) throws Exception {
		
		userRepository.deleteAll();
		
		User joao = new User(null, "Joao Silva", "Male", "joaosilva@mail.com", null, "Sao Paulo", "Brasil", "111.111.111-11");
		User maria = new User(null, "Maria Souza", "Female", "mariasouza@mail.com", null, "Rio de Janeiro", "Brasil", "222.222.222-22");
		User jose = new User(null, "Jose Campos", "Male", "josecampos@mail.com", null, "Curitiba", "Brasil", "333.333.333-33");
		
		userRepository.saveAll(Arrays.asList(joao, maria, jose));
		
	}

}
