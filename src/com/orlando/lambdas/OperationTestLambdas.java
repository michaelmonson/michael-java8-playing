package com.orlando.lambdas;

/**
 * <b>Lambda expressions</b> are a new feature included in Java SE 8. 
 * <p>Lambda Expressions provide a way to represent functional interface using an expression.</p>
 * 
 * <p>A Functional interface is one which has only one abstract method. The method declared in 
 *    a functional interface must not be a public member of Object class.</p>
 * 
 * <p>For more information on Functional interface read this link:
 *    http://self-learning-java-tutorial.blogspot.in/2014/06/functional-interface.html</p>
 * 
 * <p>Lambda Expression is composed of three parts:
 *       1. Argument List
 *       2. Arrow Token
 *       3. Body
 * </p>
 * <p>The body can be either a single expression or a statement block. 
 *    In the expression form, the body is simply evaluated and returned.</p>
 *    
 * <p>The code below implements ALL arithmetic operations using Lambda Expressions.</p>
 * 
 * @author michaelmonson
 *
 */
public class OperationTestLambdas {
	
	
	
	/**
	 * In the block form (like {} ), the body is evaluated like a method body 
	 * and a return statement returns control to the caller of the method. 
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		
        Operation addition = (int a, int b) -> {  return (a + b);  };
        Operation subtract = (int a, int b) -> {  return (a - b);  };
        Operation multiply = (int a, int b) -> {  return (a * b);  };
        Operation divide   = (int a, int b) -> {  return (a / b);  };
        Operation remainder= (int a, int b) -> {  return (a % b);  };        
        
        System.out.println("Summation of 11 and 5 is: " + addition.operation(11, 5));
        System.out.println("Subtraction of 11 and 5 is: " + subtract.operation(11, 5));
        System.out.println("Multiplication of 11 and 5 is: " + multiply.operation(11, 5));
        System.out.println("Division of 11 and 5 is: " + divide.operation(11, 5));
        System.out.println("Remainder of 11 and 5 is: " + remainder.operation(11, 5));
        
        //Now run through the streamlined methods below.
        
        System.out.println("\nLambda's (evenMoreConcise):");
        evenMoreConcise(args);
        
        System.out.println("\nLambda's (stillMoreConcise!):");
        stillMoreConcise(args);
    }
	
	
	/**
	 * We can re write the above lambda expressions (from the main method) 
	 * in expression form, since it has only one statement.  :-)
	 * 
	 * @param args
	 */
	public static void evenMoreConcise(String args[]) {
		
        Operation addition = (int a, int b) ->  (a + b);
        Operation subtract = (int a, int b) ->  (a - b);
        Operation multiply = (int a, int b) ->  (a * b);
        Operation divide   = (int a, int b) ->  (a / b);
        Operation remainder= (int a, int b) ->  (a % b);        
        
        System.out.println("Summation of 11 and 5 is: " + addition.operation(11, 5));
        System.out.println("Subtraction of 11 and 5 is: " + subtract.operation(11, 5));
        System.out.println("Multiplication of 11 and 5 is: " + multiply.operation(11, 5));
        System.out.println("Division of 11 and 5 is: " + divide.operation(11, 5));
        System.out.println("Remainder of 11 and 5 is: " + remainder.operation(11, 5));
		
	}
	
	
	/**
	 * In addition to dropping the curly braces and return statements (e.g. block form),
	 * we can further simplify our lambda expressions by omitting the data types in the 
	 * Argument list!  This makes for extremely tight expressions!  
	 * 
	 * Long gone are the anonymous functions, and these easily fit on single lines!
	 * 
	 * @param args
	 */
	public static void stillMoreConcise(String args[]) {
		
        Operation addition = (a, b) ->  (a + b);
        Operation subtract = (a, b) ->  (a - b);
        Operation multiply = (a, b) ->  (a * b);
        Operation divide   = (a, b) ->  (a / b);
        Operation remainder= (a, b) ->  (a % b);        
        
        System.out.println("Summation of 11 and 5 is: " + addition.operation(11, 5));
        System.out.println("Subtraction of 11 and 5 is: " + subtract.operation(11, 5));
        System.out.println("Multiplication of 11 and 5 is: " + multiply.operation(11, 5));
        System.out.println("Division of 11 and 5 is: " + divide.operation(11, 5));
        System.out.println("Remainder of 11 and 5 is: " + remainder.operation(11, 5));
		
	}
	
	
	/*
	 * As you observed, an anonymous class implementing the Interface appears like this (verbose!)
	 *
	 *    Operation add = new Operation() {
     *        public int operation(int a, int b) {
     *            return (a+b);
     *        }
     *    };
     *  
     *  can now be replaced with a concise lambda definition:
     *  
     *    Operation add = (int a, int b) -> {  return (a+b);  };
	 */
}
