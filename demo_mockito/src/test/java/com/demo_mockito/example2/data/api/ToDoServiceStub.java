package com.demo_mockito.example2.data.api;

import java.util.Arrays;
import java.util.List;

public class ToDoServiceStub implements ToDoService{

	@Override
	public List<String> retrieveToDos(String user) {
		// TODO Auto-generated method stub
		return Arrays.asList("spring framework","Learn Spring","Learn Dance ");
	}

}
