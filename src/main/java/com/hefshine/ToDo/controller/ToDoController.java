package com.hefshine.ToDo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.hefshine.ToDo.model.Data;
import com.hefshine.ToDo.rToDoRepo.ToDoRepo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("api/ToDoData")
public class ToDoController {

	@Autowired
	ToDoRepo repo;
	
	@GetMapping
	public List<Data> findAll() {
		return repo.findAll();
	}
	
	@GetMapping("/{id}")
	public Data findDataById(@PathVariable int id) {
		return repo.findById(id).orElse(null);
	}
	
	@PostMapping
	public Data create(@RequestBody Data data) {
		return repo.save(data);
	}
	
	@PostMapping("/{id}")
	public Data  update(@PathVariable int id,@RequestBody Data data) {
		return repo.save(data);
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id) {
		repo.deleteById(id);
		
		return "done";
	}
	
	
}
