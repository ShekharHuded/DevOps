package com.edureka.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMessageBuilder {

	@Test
	public void testHelloWorld() {
		assertEquals("Hello, world", MessageBuilder.getHelloWorld());
	}

	@Test
	public void testNumber10() {
		assertEquals(10, MessageBuilder.getNumber10());
	}
	
	@Test
	public void testprint() {
		System.out.println ("Hello") ;
	}
}
