object pascalworksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(68); 
  println("Welcome to the Scala worksheet");$skip(60); 
  def fact(a:Int):Int = {
  if(a<=0) 1
  else a*fact(a-1)
};System.out.println("""fact: (a: Int)Int""");$skip(120); 

def pascal(c:Int,r:Int):Int={
  
if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
    
   
  };System.out.println("""pascal: (c: Int, r: Int)Int""")}
}
