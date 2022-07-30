package com.eduardofacf.crudmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eduardofacf.crudmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		User joao = new User("1", "Joao Silva", "Male", "joaosilva@mail.com", null, "Sao Paulo", "Brasil", "111.111.111-11");
		User maria = new User("2", "Maria Souza", "Female", "mariasouza@mail.com", null, "Rio de Janeiro", "Brasil", "222.222.222-22");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(joao, maria));
		return ResponseEntity.ok().body(list);
		
	}
}
