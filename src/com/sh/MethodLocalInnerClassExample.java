package com.sh;

class OuterExample{
	String outerVar ="abc";
	
	public void displayName(String name) {
		System.err.println(name);
	}
	
	public void checkMethodInnerClass() {
		String innerVar="Shrabani";
		
		 class InnerExample{
			String name = outerVar + innerVar;
			 void callDisplay() {
				displayName(name);
			}
			
		}
		 
		 InnerExample innerExample=new InnerExample();  //need to instantiate and call the mthod
		 innerExample.callDisplay();
		 
	}
}

public class MethodLocalInnerClassExample {

	public static void main(String[] args) {
		OuterExample outerExample = new OuterExample();
		outerExample.checkMethodInnerClass();

	}

}
