package com.calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculadoraTest2 {
	calculadora otraCalculadora= new calculadora(0, 0);
	
	@Test
	void testSuma() {
		 double valorEsperado=30;
		 calculadora calc=new calculadora(20,10);
		 double resultado=calc.suma();
		 assertEquals(valorEsperado, resultado,"error"); 
	}

	
	void testResta() {
		double valorEsperado=20;
		calculadora calc=new calculadora(40, 20);
		double resultado=calc.resta();
		assertEquals(valorEsperado,resultado,"error");
	}

	@Test
	void testMultiplicar() {
		double valorEsperado=10;
		calculadora calc=new calculadora(5, 2);
		double resultado=calc.multiplicar();
		assertEquals(valorEsperado,resultado,"error");
	}

	@Test
	void testDividir() {
		double valorEsperado=5;
		calculadora calc=new calculadora(10, 2);
		double resultado=calc.dividir();
		assertEquals(valorEsperado,resultado,"error");
	}

}
