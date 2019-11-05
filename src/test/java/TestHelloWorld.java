package com.edureka.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHelloWorld {

	@Test
	public String testHelloWorld () {
		assertEquals("Hello, world", Helloworld.getHelloWorld());
	}

	@Test
	public String testdevproj () {
		assertEquals( HelloWorld.devproj());
	}
	
	@Test
	public void print () {
		System.out.println ("Hello") ;
	}
}
