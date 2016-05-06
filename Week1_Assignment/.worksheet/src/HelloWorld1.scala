object HelloWorld1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(117); 





def fibonacci(n : Int) : Long = {
if(n <= 1)
1
else
fibonacci(n - 1) + fibonacci(n - 2)
};System.out.println("""fibonacci: (n: Int)Long""");$skip(17); val res$0 = 
 
 fibonacci(6);System.out.println("""res0: Long = """ + $show(res$0));$skip(92); ;
 
 def triangularNumber(n : Int) : Long = {
if(n <= 1)
1
else
n + triangularNumber(n - 1)
};System.out.println("""triangularNumber: (n: Int)Long""");$skip(20); val res$1 = 
triangularNumber(9);System.out.println("""res1: Long = """ + $show(res$1));$skip(78); 



def factorial(n : Int) : Long = {
if(n <= 1)
1
else
n * factorial(n - 1)
};System.out.println("""factorial: (n: Int)Long""");$skip(14); val res$2 = 
factorial(3);;System.out.println("""res2: Long = """ + $show(res$2))}
}
