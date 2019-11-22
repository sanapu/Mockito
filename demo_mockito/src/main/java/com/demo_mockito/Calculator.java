package com.demo_mockito;

public class Calculator {
	CalculatorService service ;
	
	Calculator(CalculatorService service){
		this.service = service;
	}
	
	public int perform(int a, int b) {
		return service.add(a, b) * 2;
		//return (a+ b) * 2; // used to verify verfy() method of mockito
	}
}
