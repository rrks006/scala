/**
  * Created by mail2 on 3/22/2017.
  */
object gcd {

  def main(args: Array[String]): Unit = {
    if(args.length!=2)
      throw new IllegalArgumentException("Usage: gcd <argument1> <argument2>")
    else{
      print(gcd(args(0).toInt,args(1).toInt))
    }
  }

  def gcd(num1:Int, num2:Int): Int ={
    if (num1 == 0 || num2 == 0){
      return (num1+num2)
    }
    else {
      gcd(num2, num1%num2)
    }
  }

}
