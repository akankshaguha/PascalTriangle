package com.bitwise.Rationale


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
