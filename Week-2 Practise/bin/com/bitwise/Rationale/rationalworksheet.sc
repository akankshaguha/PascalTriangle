package com.bitwise.Rational

object rationalworksheet {
  println("Welcome to the Scala worksheet")
 val x= new Rationals(2,5)
 x.numer;
 x.denom;
 val y = new Rationals(1,2)
 y add x    //y.add(x)
 
 println(y)
}


class Rationals(x:Int,y:Int){

 def numer = x;
 def denom = y;
 
 
 
 def add(that:Rationals)=  new Rationals(this.numer*that.denom,this.denom*that.numer)
 
 
 
 
 def neg(that:Rationals){
 new Rationals(-numer,denom)
}



def sub(that:Rationals)=new Rationals(numer*that.denom,denom*that.numer)

def toString = numer +"/"+ denom
}