package com.revature;

public class Sample39 {
    void myMethod() throws ExceptionInInitializerError { 
        System.out.println("Base"); 
    } 
 } 
class MainDerived extends Sample39 { 
    void myMethod() throws RuntimeException { 
        System.out.println("Derived"); 
    } 
 } 

