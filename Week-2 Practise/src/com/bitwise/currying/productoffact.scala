package com.bitwise.currying


 

object productoffact extends App {
  println("Welcome to the Scala worksheet")
 val x= new Rational(1,0)
 x.numer;
 x.denom;
 val y = new Rational(2,0)
 y + x
 println(y)
val z=x.neg(x)
println(z)
val z1 =x < y

println(z1)
 val z2 = x max y
 println(z2)
 new Rational(2)

}



  class Rational(x:Int, y:Int) {
require(y!=0,"denominator cannot be negative")
 def numer = x/gcd(x,y);
 def denom = y/gcd(x,y);
 
 def this(x:Int)={
   this(x,1)
 }
 
 def gcd(a:Int,b:Int):Int ={
   if (b==0) a else gcd(b,a%b)
   
 }
 
 def +(that:Rational){
new Rational(numer*that.denom,denom*that.numer)
 }
 
 def <(that:Rational):Boolean= {
   numer*that.denom < that.numer *this.denom 
 }
  
 def max(that:Rational)={
   if(this < (that))that else this
 }
 
 
 
 def neg(that:Rational):Rational=new  Rational(-numer,denom)


def -(that:Rational)=new Rational(numer*that.denom,denom*that.numer)

    
override def toString = numer +"/"+denom

}

