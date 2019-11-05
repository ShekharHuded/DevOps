package com.edureka.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHelloWorld {

	@Test
	public void testHelloWorld () {
		assertEquals("Hello, world");
	}

	@Test
	public void testdevproj () {
		assertEquals( HelloWorld.devproj ());
	}
	
	@Test
	public void print () {
		System.out.println ("Hello") ;
	}
}
