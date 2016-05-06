package com.bitwise.Rational

object rationals {
  println("Welcome to the Scala worksheet")
 val x= new Rational(2,5)
 x.numer;
 x.denom;
 val y = new Rational(1,2)
 y.add(x)
 println(y)
}



  class Rational(x:Int,y:Int){

 def numer = x;
 def denom = y;
 
 
 
 def add(that:Rational){
new Rational(numer*that.denom,denom*that.numer)
 }
 
 
 
 def neg(that:Rational){
 new Rational(-numer,denom)
}



def sub(that:Rational)=new Rational(numer*that.denom,denom*that.numer)

}
