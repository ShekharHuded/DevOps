package com.edureka.project;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

public class HelloWorld {

	public static void getHelloWorld () {
		System.out.println ( "Hello, world :)" ); 
	}

	public static void getdevproj () {
		System.out.println ( "Completed DevOps Training @ Edureka" ) ;
	}
	
	public static void main (String[] args) {
		HelloWorld hello = new HelloWorld() ;
		hello.getHelloWorld ();
		hello.getdevproj () ;
		System.out.println ( "The Current Time is " + dtf.format(now) );
	}
}
