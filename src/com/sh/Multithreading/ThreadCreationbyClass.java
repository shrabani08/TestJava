package com.sh.Multithreading;

public class ThreadCreationbyClass extends Thread{

	public static void main(String[] args) {
		System.err.println("In main Thread with id:"+Thread.currentThread().getId());
		ThreadCreationbyClass obj =new ThreadCreationbyClass();  //this object will inherit thread class methods , as extends Thread class 		
		System.err.println("before start");
	//	obj.start();
		obj.run();
		System.err.println("after start");

	}
	public void run() {  //run method is case sensitive, to override we need to match it
		System.err.println("In new Thread with id:"+Thread.currentThread().getId());

	}

}

//while debugging, after the completion of execution of main method, the flow invokes the run method. And that is triggered by the start method.


 
/*
 * class ThreadExampleClass extends Thread { public static void main(String
 * args[]) { System.out.println("Thread id of Main thread is = "+
 * Thread.currentThread().getId()); ThreadExampleClass t1= new
 * ThreadExampleClass(); t1.start(); } public void run() {
 * System.out.println("Thread is running...");
 * System.out.println("Thread id of new thread is = "+Thread.currentThread().
 * getId()); } }
 */