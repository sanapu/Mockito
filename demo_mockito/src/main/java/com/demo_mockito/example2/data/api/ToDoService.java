package com.demo_mockito.example2.data.api;

import java.util.List;

// To test the ToDoBusinessImpl we need to create ToDoservice Stub
// Test thge Impl using this ToDoServiceStub

public interface ToDoService {
	
	public List<String> retrieveToDos(String user);

}
