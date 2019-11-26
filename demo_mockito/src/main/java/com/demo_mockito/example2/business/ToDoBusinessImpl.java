package com.demo_mockito.example2.business;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.demo_mockito.example2.data.api.ToDoService;


// this class is called system under test (SUT)
// ToDoservice is the dependency
public class ToDoBusinessImpl {
	
	
	private ToDoService toDoService;
	
	public ToDoBusinessImpl(ToDoService toDoService) {
		this.toDoService = toDoService;
	}
	
	public List<String> retrieveTodosRelatedtoSpring(String user){
		
		List<String> toDos = toDoService.retrieveToDos(user);
		List<String> filteredTodos = toDos.stream().filter(toDo -> toDo.contains("spring"))
				.collect(Collectors.toList());
		
		return filteredTodos;
	}

}
