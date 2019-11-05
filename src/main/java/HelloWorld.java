package com.edureka.project;

public class TeseHelloWorld {

	public static void getHelloWorld (){
		System.out.println ( "Hello, world :)" ); 
	}

	public static void devproj (){
		System.out.println ( "Completed DevOPS Project" );
	}
	
	public static void main (String[] args) {
		System.out.println("Wel come!! :) ");
		HelloWorld hello = new HelloWorld() ;
		hello.getHelloWorld ();
		hello.devproj () ;
	}
}
