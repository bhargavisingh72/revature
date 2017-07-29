package com.revature;

public class Sample38 {
    int tryAgain() { 
        int a = 10; 
        try { 
            ++a; 
        } 
        finally { 
            a++; 
        } 
        return a; 
    } 
    public static void main(Sample50 args[]) { 
        System.out.println(new Sample38().tryAgain()); 
    } 

}
