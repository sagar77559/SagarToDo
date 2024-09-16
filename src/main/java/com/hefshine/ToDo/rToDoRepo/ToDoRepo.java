package com.hefshine.ToDo.rToDoRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hefshine.ToDo.model.Data;

public interface ToDoRepo extends JpaRepository<Data, Integer>{

}
