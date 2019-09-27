package com.orlando.lambdas;

public class OperationTestAnonymousClasses {
	
	public static void main(String args[]) {
		
        Operation add = new Operation() {
            public int operation(int a, int b) {
                return (a + b);
            }
        };
        
        Operation subtract = new Operation() {
            public int operation(int a, int b) {
                return (a - b);
            }
        };
        
        Operation multiply = new Operation() {
            public int operation(int a, int b) {
                return (a * b);
            }
        };
        
        
        Operation divide = new Operation() {
            public int operation(int a, int b) {
                return (a / b);
            }
        };
        
        Operation remainder = new Operation() {
            public int operation(int a, int b) {
                return (a % b);
            }
        };
        
        System.out.println("Summation of 11 and 5 is: " + add.operation(11, 5));
        System.out.println("Subtraction of 11 and 5 is: " + subtract.operation(11, 5));
        System.out.println("Multiplication of 11 and 5 is: " + multiply.operation(11, 5));
        System.out.println("Division of 11 and 5 is: " + divide.operation(11, 5));
        System.out.println("Remainder of 11 and 5 is: " + remainder.operation(11, 5));
        
    }
}
