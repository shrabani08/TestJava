package com.sh;

public class AnonymousInterfaceEx {
	static Hello h =new Hello() {
		  public void display() {
			System.err.println("shrabani");
		}
	};

	public static void main(String[] args) {
		
	h.display();
	}
	
	interface Hello{
		  void display();
	}

}
