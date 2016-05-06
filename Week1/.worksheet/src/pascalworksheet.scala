object pascalworksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(68); 
  println("Welcome to the Scala worksheet");$skip(47); 
   def f(a:Int):Int = if(a<0) 1 else a*f(a-1);System.out.println("""f: (a: Int)Int""");$skip(50); ;
    def pascal(n:Int,k:Int) = f(n)/(f(k)*f(n-k));System.out.println("""pascal: (n: Int, k: Int)Int""");$skip(78); ;
     for(r<- 0 to 10){
       for(c<-0 to r){
        println(pascal(r,c)+"")}
      }
   
     }
}
