package com.sh;

public class MyCalculator {

	public static void main(String[] args) {
		try {
			int c= add(2,3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static int add(int a , int b) {
		return a+b;
	}

}
