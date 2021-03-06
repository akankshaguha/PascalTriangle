package com.bitwise.currying

object sumofcube {
  
  def main(args:Array[String]){
    
  
   def sum(f:Int =>Int):(Int,Int) => Int = {
     def sumF(a:Int,b:Int):Int =
       if(a>b) 0
       else f(a)+ sumF(a+1,b)
       return sumF
   }
  println( sum(cube)(1,1))
   
   def cube(a:Int)={
     a*a*a
   }
   
  }
}