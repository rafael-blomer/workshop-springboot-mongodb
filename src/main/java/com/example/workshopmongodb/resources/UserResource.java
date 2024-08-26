package com.example.workshopmongodb.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.workshopmongodb.domain.User;

@RestController
@RequestMapping("/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		User gabriela = new User("1", "Gabriela", "gabi@gmail.com");
		User rafael = new User("2", "Rafael", "rafa@gmail.com");
		List<User> list = new ArrayList<User>();
		list.addAll(Arrays.asList(rafael, gabriela));
		return ResponseEntity.ok().body(list);
	}
}
