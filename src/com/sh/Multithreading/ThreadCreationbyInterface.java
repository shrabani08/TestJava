package com.sh.Multithreading;

public class ThreadCreationbyInterface implements Runnable{

	public static void main(String[] args) {
		System.err.println("In main Thread with id:"+Thread.currentThread().getId());
		ThreadCreationbyInterface obj =new ThreadCreationbyInterface();
		Thread t = new Thread(obj);
		System.err.println("before start");
		t.start();
		System.err.println("after start");
	}
	public void run() {
		System.err.println("In main Thread with id:"+Thread.currentThread().getId());
	}

}
