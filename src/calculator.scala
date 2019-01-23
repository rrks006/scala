/**
  * Created by risingh on 4/21/2017.
  */
class Calculator {
//  Defining add function
  def add(num1:Int, num2:Int):Int = num1+num2
//  Defining subtract function
  def subtract(num1:Int, num2:Int):Int = num1-num2
//  Defining multiply function
  def multiply(num1:Int, num2:Int):Int = num1*num2

}

object Calculator {
  def main(args: Array[String]): Unit = {
    val calculate = new Calculator
    println(calculate.add(5,3))
    println(calculate.subtract(5,3))
    println(calculate.multiply(5,3))
  }
}
