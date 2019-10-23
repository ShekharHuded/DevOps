package com.edureka.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMagicBuilder {

	@Test
	public void testLucky() {
		assertEquals(7, MagicBuilder.getLucky());
	}
	@Test
	public void printline() {
		System.out.println ("Hello, Test Case") ;
	}
}
