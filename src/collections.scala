/**
  * Created by mail2 on 4/22/2017.
  *
  * */

object collections {
  def isListPalindrome[A](list: List[A]) = list == list.reverse

  def isStringPalindrome(string: String):Boolean = {
    val len = string.length;
    for(i <- 0 until len/2) {
      if(string(i) != string(len-i-1)) return false
    }
    return true
  }

  def joinTuples(t1: (Int,Int), t2:(Int,Int)) = {
    val tupToList1 = t1.productIterator.toList
    val tupToList2 = t2.productIterator.toList
    val mergedList = tupToList1:::tupToList2
    val finalTuple = mergedList match {
      case List(a,b,c,d) => (a, b, c,d)
    }
    finalTuple
  }

  def getPalindromeList(list: List[String]): List[String] = {
    var returnList = List("")
    for(j <- 0 until(list.length)){
      if(isStringPalindrome(list(j))) returnList= list(j)::returnList
    }
    returnList.dropRight(1).reverse
  }

  def main(args: Array[String]): Unit = {
    val tuple1 = (1,2)
    val tuple2 = (3,4)
    val nums : List[Int] = List(1,4,3,2)
    val palindrome_nums: List[Int] = List(1,2,3,2,1)
    val listOfStrings : List[String] = List("hello","abc", "mom", "A", "laonoal")

    println("1. Getting last element of "+nums+". Result: "+nums.last)
    println("2. Print last but one element of "+nums+". Result: "+ nums.dropRight(1).last)
    println("3a. Checking if the "+nums+" is palindrome or not. Result: "+isListPalindrome(nums))
    println("3b. Checking if the "+palindrome_nums+" is palindrome or not. Result: "+isListPalindrome(palindrome_nums))
    println("4. Take two tuples "+tuple1+" and "+tuple2+" and join them to make a tuple. Result: " + joinTuples(tuple1,tuple2))
    println("5. Given a list of strings "+listOfStrings+", print all palindrome strings from the list. Result: "+getPalindromeList(listOfStrings))
  }
}
