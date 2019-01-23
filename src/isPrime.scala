/**
  * Created by risingh on 3/18/2017.
  */
object isPrime {
  def main(args: Array[String]): Unit = {
    if(args.length!=1)
      throw new IllegalArgumentException("Usage: iPrime <argument>")
    else{
        println("Value passed: "+args(0))
        println("Is the value prime: "+isPrime(args(0).toInt))
    }
  }

  def isPrime(number: Int) =
    if (number <= 1)
      false
    else if (number == 2)
      true
    else
      !(2 to number/2).exists(x => number % x == 0)
}
