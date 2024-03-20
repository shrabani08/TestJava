package com.sh;

import java.io.IOException;

class ParentClass 
{  
   void color() 
   {
       System.out.println("Red");
   }  
}
class ExceptionOverriding extends ParentClass {
   //It throws a checked exception
   void color() throws NullPointerException
   {
       System.out.println("White");
   }  
   public static void main(String args[]){  
       ParentClass obj = new ExceptionOverriding();  
       try 
       {
        obj. color();
       } 
       catch (Exception e) 
       {
        e.printStackTrace();
       } 
   } 
}

//throws IOException
//throws NullPointerException
