package com.edureka.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHelloWorld {

	@Test
	public String testHelloWorld () {
		assertEquals("Hello, world", HelloWorld.getHelloWorld());
	}

	@Test
	public String testdevproj () {
		assertEquals(10, HelloWorld.getdevproj());
	}
	
	@Test
	public void testprint () {
		System.out.println ("Hello") ;
	}
}
