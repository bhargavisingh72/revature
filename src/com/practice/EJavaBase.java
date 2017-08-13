package com.practice;

public class EJavaBase {

	void myMethod() throws ExceptionInInitializerError {
		System.out.println("Base");
		}
		}
		class EJavaDerived extends EJavaBase {
		void myMethod() throws RuntimeException {
		System.out.println("Derived");
		}
		}
		
