package com.sh.Multithreading;


/*
 * 1. public class PlaywithThreadPriority implements Runnable {
 * 
 * public static void main(String[] args) {
 * System.err.println("In main Thread with id:"+Thread.currentThread().getId()
 * +" with priority:"+Thread.currentThread().getPriority());
 * PlaywithThreadPriority obj =new PlaywithThreadPriority(); Thread t = new
 * Thread(obj); t.start();
 * 
 * } public void run() {
 * System.err.println("In new Thread with id:"+Thread.currentThread().getId()
 * +" with priority:"+Thread.currentThread().getPriority());
 * System.err.println("priority:::"); }
 * 
 * 
 * }
 */


//2.

/*
 * public class PlaywithThreadPriority {
 * 
 * public static void main(String[] args) {
 * System.err.println("In main Thread with id:"+Thread.currentThread().getId()
 * +" with priority:"+Thread.currentThread().getPriority());
 * Thread.currentThread().setPriority(16); System.err.println("priority:::"+
 * Thread.currentThread().getPriority()); } }
 */
  
  

 // 3. 
  public class PlaywithThreadPriority implements Runnable {
  
  public static void main(String[] args) {
	  System.err.println("In main Thread with id:"+Thread.currentThread().getId()
	  +" with priority:"+Thread.currentThread().getPriority());
	  Thread.currentThread().setPriority(6); 
	  System.err.println("priority:::"+Thread.currentThread().getPriority());
	  PlaywithThreadPriority obj =new PlaywithThreadPriority(); 
	  Thread t = new Thread(obj); 
	  t.setPriority(8); 
	  t.start();
  
  } 
  
  
  public void run() {
	  Thread.currentThread().setPriority(9); 
	  System.err.println("In new Thread with id:"+Thread.currentThread().getId()
	  +" with priority:"+Thread.currentThread().getPriority());
	  System.err.println("priority:::"); 
  }
  
  
  }
  
  
  
 