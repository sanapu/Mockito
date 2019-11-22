package com.demo_mockito;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.*;

public class CalculatorTest {
	Calculator calculator;
	// mocking a service
//	CalculatorService service = Mockito.mock(CalculatorService.class);
	
	@Mock
	CalculatorService service;
	
	@Rule public MockitoRule rule = MockitoJUnit.rule(); // use rule when using @Mock annotation
	
	@Before
	public void setUp() {
		
		calculator  = new Calculator(service);
	}
	
	
	@Test
	public void testPerform() {
		//fail("Not yet implemented");
		// service that was mocked should return some value for its method.
		when(service.add(5, 5)).thenReturn(10);
		assertEquals(20, calculator.perform(5, 5));
		// make sure if the mock service is being called/used
		verify(service).add(5, 5);  // to test this feature comment in the method that uses service in return
									// so this test fails as we are not using the mock service
		
		
	}

}
