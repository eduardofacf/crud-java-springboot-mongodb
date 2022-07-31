package com.eduardofacf.crudmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardofacf.crudmongo.domain.User;
import com.eduardofacf.crudmongo.dto.UserDTO;
import com.eduardofacf.crudmongo.repository.UserRepository;
import com.eduardofacf.crudmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}
	
	public User fromDTO(UserDTO objDTO) {
		return new User(objDTO.getId(), objDTO.getName(), objDTO.getGender(), objDTO.getEmail(), objDTO.getBirth(), objDTO.getNaturalness(), objDTO.getNationality(), objDTO.getCpf());
	}
}
