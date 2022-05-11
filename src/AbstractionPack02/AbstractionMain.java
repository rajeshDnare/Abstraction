package AbstractionPack02;

abstract class classAbstract {
	
//01/07***********************
	// there is not any restriction on variables, we can create any type of variales
	// inside absract class

	int a;
	static int b;

//02/07***********************
	
	// we can create instance as well as static block inside abstract class

	{ // static block
		System.out.println("I am a instance block");
	}
	// instance block will get executed when we create object of the child class

	static { // static block
		System.out.println("I am a static block");
	}

//03/07***********************
	
	public classAbstract() { // abstract class can have constructors inside it.
		System.out.println("I am constructor of Abstract class");
	}

//04/07***********************
	// an abstract class can have abstract as well ass non absrtact methods
	public abstract void method01();

	public abstract void method02();

//05/07***********************
	
//	public static abstract void method03(); 
	//we can not make abstract method as static

	public static void method04() { // can have static methods
		System.out.println("Rajesh");

	}

	public final void method05() { // can have final methods
		System.out.println("Rajesh");

	}

}

class classChild extends classAbstract {
	
//06/07***********************
	// child class of an abstract class must implement all the abstract methods of
	// the Abstract class

	@Override
	public void method01() {

	}

	@Override
	public void method02() {

	}

//	@Override
//	public void method03() {
//
//	}

}

public class AbstractionMain {
	public static void main(String[] args) {
		
//07/07***********************
		// we can not create object of an abstract class

//		classAbstract a=new classAbstract();

		classChild d = new classChild();

	}

}
