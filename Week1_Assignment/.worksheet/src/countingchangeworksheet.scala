object countingchangeworksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(76); 
  println("Welcome to the Scala worksheet");$skip(380); 
  
  
   def countChange(money: Int, coins: List[Int]): Int = {
var totalAmount = 0;
def check(money: Int, coins: List[Int]) {
if (!coins.isEmpty)
if (money>coins.head) {
check(money-coins.head, coins)
check(money,coins.tail)
}

else if (money<coins.head) {
check(money,coins.tail)
}
else if (money-coins.head == 0) {
totalAmount += 1
}
}
check(money,coins.sorted)
totalAmount

};System.out.println("""countChange: (money: Int, coins: List[Int])Int""")}
}
