object productoffactworksheet {
  println("Welcome to the Scala worksheet") 
  def product(f:Int=>Int)(a:Int,b:Int):Int ={
  if(a>b) 1
  else f(a)+product(f)(a+1,b)
  } 
  
}