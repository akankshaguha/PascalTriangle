object sumofcubesworksheet {
  println("Welcome to the Scala worksheet")
  object sumofcube {
  
  def main(args:Array[String]){
    
  
   def sum(f:Int =>Int):(Int,Int) => Int = {
     def sumF(a:Int,b:Int):Int =
       if(a>b) 0
       else f(a)+ sumF(a+1,b)
       return sumF
   }
   sum(cube)(1,4)
   
   def cube(a:Int)={
     a*a*a
   }
  }
}
}