package com.edureka.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHelloWorld {

	@Test
	public void testHelloWorld () {
		assertEquals("Hello, world", HelloWorld.getHelloWorld());
	}

	@Test
	public void testdevproj () {
		assertEquals(10, HelloWorld.getdevproj ());
	}
	
	@Test
	public void main (Strings[] args) {
		System.out.println ("Hello") ;
	}
}
