object countingchangeworksheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
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

}                                                 //> countChange: (money: Int, coins: List[Int])Int
}