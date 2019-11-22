package com.demo_mockito.example2.data.api;

import java.util.List;

public interface ToDoService {
	
	public List<String> retrieveToDos(String user);

}
