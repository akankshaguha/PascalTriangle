object HelloWorld1 {





def fibonacci(n : Int) : Long = {
if(n <= 1)
1
else
fibonacci(n - 1) + fibonacci(n - 2)
}                                                 //> fibonacci: (n: Int)Long
 
 fibonacci(6);                                    //> res0: Long = 13
 
 def triangularNumber(n : Int) : Long = {
if(n <= 1)
1
else
n + triangularNumber(n - 1)
}                                                 //> triangularNumber: (n: Int)Long
triangularNumber(9)                               //> res1: Long = 45



def factorial(n : Int) : Long = {
if(n <= 1)
1
else
n * factorial(n - 1)
}                                                 //> factorial: (n: Int)Long
factorial(3);                                     //> res2: Long = 6
}