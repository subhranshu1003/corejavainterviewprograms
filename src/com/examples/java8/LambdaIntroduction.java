package com.examples.java8;

public class LambdaIntroduction {

	public static void main(String[] args) {
		/*CallFunInterface funInter = new CallFunInterface();
		funInter.funMethod();*/
		
		MyFunctionalInterface funInterLambda = () -> System.out.println("FunctionalMethod");
		funInterLambda.funMethod();
		
	}

}

interface MyFunctionalInterface{
	public void funMethod();
}



/*
 class CallFunInterface implements MyFunctionalInterface{
 

	@Override
	public void funMethod() {

		System.out.println("FunctionalMethod");
	}
} 
*/

