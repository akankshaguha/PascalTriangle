object pascalworksheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
   def f(a:Int):Int = if(a<0) 1 else a*f(a-1);    //> f: (a: Int)Int
    def pascal(n:Int,k:Int) = f(n)/(f(k)*f(n-k)); //> pascal: (n: Int, k: Int)Int
     for(r<- 0 to 10){
       for(c<-0 to r){
        println(pascal(r,c)+"")                   //> java.lang.ArithmeticException: / by zero
                                                  //| 	at pascalworksheet$$anonfun$main$1.pascalworksheet$$anonfun$$pascal$1(pa
                                                  //| scalworksheet.scala:4)
                                                  //| 	at pascalworksheet$$anonfun$main$1$$anonfun$apply$mcV$sp$1$$anonfun$appl
                                                  //| y$mcVI$sp$1.apply$mcVI$sp(pascalworksheet.scala:7)
                                                  //| 	at scala.collection.immutable.Range.foreach$mVc$sp(Range.scala:160)
                                                  //| 	at pascalworksheet$$anonfun$main$1$$anonfun$apply$mcV$sp$1.apply$mcVI$sp
                                                  //| (pascalworksheet.scala:6)
                                                  //| 	at scala.collection.immutable.Range.foreach$mVc$sp(Range.scala:160)
                                                  //| 	at pascalworksheet$$anonfun$main$1.apply$mcV$sp(pascalworksheet.scala:5)
                                                  //| 
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at pascalworksheet$.ma
                                                  //| Output exceeds cutoff limit.
      }
   
     }
}