package com.matheus.springbootmng.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.matheus.springbootmng.domain.User;
import com.matheus.springbootmng.dto.UserDTO;
import com.matheus.springbootmng.repository.UserRepository;
import com.matheus.springbootmng.services.exception.ObjectNotFoundException;

public class UserService {
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
	public User findById(String id) {
		User user = repo.findOne(id);
		if (user == null) {
			throw new ObjectNotFoundException("Objeto não encontrado");
		}
		return user;
	}
	
	
}
