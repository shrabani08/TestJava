package com.sh.nestedClassExamples;

class EnclosingClass{
	private int a=10;
	static private int b =30;
	public int c=40;
	
	 class nestedClassHere{
		public void display() {
			System.err.println(a);
			System.err.println(b);
			System.err.println(c);
		}
		
	}
}

public class NestedClassExample1 {

	public static void main(String[] args) {
		EnclosingClass obj= new EnclosingClass();
	//	EnclosingClass.nestedClassHere innerObject =new  obj.nestedClassHere();  
		//--->this will not work, as inner class need to be based on outer class
		
			EnclosingClass.nestedClassHere innerObject =  obj.new nestedClassHere();
		innerObject.display();
	}

}
