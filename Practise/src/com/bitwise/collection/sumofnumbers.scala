package com.bitwise.collection

object sumofnumbers {
  def main(args:Array[String]){
    var array = new Array[Integer](3)
    array(0)=1
    array(1)=2
    array(2)=3
    
    
    for(x <- array){
      print(x)
    }
    var count:Int = 0
    var total:Int =0;
    for(x <-0 to (array.length-1)){
     
      total+=array(x);
      count=count+1
    }
    println()
   var average :Float =total/count;
    print(total,count,average)
  
  }
}