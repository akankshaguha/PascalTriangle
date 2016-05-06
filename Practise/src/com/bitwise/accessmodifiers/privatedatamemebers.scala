package com.bitwise.accessmodifiers

object privatedatamemebers {
  private def companyname() =
  {print("Company is bitwise")}
  object Employee{
    companyname()
    private def employeename() ={print("My name is")}
  }
  //employeename(); cannot be called as it is declared as private in Inner Class cant accessible in outer class
}