package com.edureka.project;

public class HelloWorld {

	public static String getHelloWorld (){
		System.out.println ( "Hello, world :)" ); 
	}

	public static String getdevproj (){
		System.out.println ( "Completed DevOPS Project" );
	}
	
	public static void main (String[] args) {
		System.out.println("Wel come!! :) ");
		HelloWorld hello = new HelloWorld() ;
		hello.getHelloWorld ();
		hello.getdevproj () ;
	}
}
