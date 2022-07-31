package com.eduardofacf.crudmongo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.eduardofacf.crudmongo.domain.Register;
import com.eduardofacf.crudmongo.domain.User;
import com.eduardofacf.crudmongo.repository.RegisterRepository;
import com.eduardofacf.crudmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RegisterRepository registerRepository;
	
	@Override
	public void run(String... arg0) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userRepository.deleteAll();
		registerRepository.deleteAll();
		
		User joao = new User(null, "Joao Silva", "Male", "joaosilva@mail.com", sdf.parse("01/01/1971"), "Sao Paulo", "Brasil", "111.111.111-11");
		User maria = new User(null, "Maria Souza", "Female", "mariasouza@mail.com", sdf.parse("02/02/1972"), "Rio de Janeiro", "Brasil", "222.222.222-22");
		User jose = new User(null, "Jose Campos", "Male", "josecampos@mail.com", sdf.parse("03/03/1973"), "Curitiba", "Brasil", "333.333.333-33");
		
		Register reg1 = new Register(null, joao, sdf.parse("01/01/2021"));
		Register reg2 = new Register(null, maria, sdf.parse("02/02/2022"));
		
		userRepository.saveAll(Arrays.asList(joao, maria, jose));
		registerRepository.saveAll(Arrays.asList(reg1, reg2));
		
	}

}
