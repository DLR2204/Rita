package oops;

interface Demo { // interface

	public void display();                  //100% security

}

abstract class Test {						//0%-100% security

	public abstract void display();          

	public void hi() {
		System.out.println("Iam from the child class");
	}

}

public class Child3 { // class				//0% security

	public void hi() {
		System.out.println("Iam from the child class");
	}

}
