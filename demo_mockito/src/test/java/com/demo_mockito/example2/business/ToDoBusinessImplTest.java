package com.demo_mockito.example2.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;

import com.demo_mockito.example2.data.api.ToDoService;
import com.demo_mockito.example2.data.api.ToDoServiceStub;
import org.junit.jupiter.api.Test;

public class ToDoBusinessImplTest {

//	@Test
//	public void retrieveTodosRelatedtoSpringTest() {
//		ToDoService ts = new ToDoServiceStub();
//		ToDoBusinessImpl t = new ToDoBusinessImpl(ts);
//		
//		assertEquals(2,t.retrieveTodosRelatedtoSpring("dummy").size());
//		
//	}
	
	
	//what is mock
	// mocking is creating objects that stimulate the behavior of real objects
	// unlike stubs mocks can be dynamically created from the code at runtime
	// they offer more functionalities than stubs

	
	@Test
	public void retrieveTodosRelatedtoSpringTestMock() {
		ToDoService ts = mock(ToDoService.class);
		when(ts.retrieveToDos("dummy")).thenReturn(Arrays.asList("spring framework","Learn spring","Learn Dance "));
		
		ToDoBusinessImpl t = new ToDoBusinessImpl(ts);
		
		assertEquals(Arrays.asList("spring framework","Learn spring"),t.retrieveTodosRelatedtoSpring("dummy"));
		
	}
	
	@Test
	public void retrieveTodosRelatedtoSpringTestMock1() {
		ToDoService ts = mock(ToDoService.class);
		when(ts.retrieveToDos("dummy")).thenReturn(Arrays.asList("spring framework","Learn spring","Learn Dance ")).thenReturn(Arrays.asList(""));
		
		ToDoBusinessImpl t = new ToDoBusinessImpl(ts);
		
		ArrayList<String> list = new ArrayList();
		assertEquals(Arrays.asList("spring framework","Learn spring"),t.retrieveTodosRelatedtoSpring("dummy"));
		assertEquals(list,t.retrieveTodosRelatedtoSpring("dummy"));
		//verify(ToDoService)
		
	}
	
	
	@Test
	public void testList() {
		List listMock = mock(List.class);
		
		when(listMock.getName()).thenReturn("tt").thenReturn("12");
		assertEquals("tt", listMock.getName());
		assertEquals("12", listMock.getName());
		
		
		
	}
	
	@Test
	public void testException() {
	//	List listMock = mock(List.class);
		
		//when(listMock.getItem(0)).thenThrow(new NullPointerException("exception here"));
		
		Assertions.assertThrows(ArithmeticException.class, () -> Math.floorDiv(5, 0));
	}
}
