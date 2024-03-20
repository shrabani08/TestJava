package com.sh.nestedClassExamples;



class EnclosingClassforStatic{
	private int a=10;
	static private int b =30;
	public int c=40;
	
	public static class nestedClassHere{  //private is not working
		public void display() {
			//System.err.println(a);
			System.err.println(b);
			//System.err.println(c);
		}
		
	}
}
public class NestedClassExample2 {

	public static void main(String[] args) {
		EnclosingClassforStatic.nestedClassHere obj = new EnclosingClassforStatic.nestedClassHere();
		obj.display();

	}

}
