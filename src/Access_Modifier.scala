/**
  * Created by risingh on 4/21/2017.
  */
class Access_Modifier {
  val public_variable = "Public variable in Parent"
  protected val protected_variable = "Protected variable in Parent"
  private val private_variable = "Private variable in Parent"

  def print_variables(): Unit ={
    println("========Printing Parent variable from parent")
    println(private_variable)
    println(public_variable)
    println(protected_variable)
  }
}

class SubClass extends Access_Modifier {
  def print_parent_variables(): Unit ={
    println("=======Printing Parent variable from child")
    println("Private variable not accessible in child class")
    println(public_variable)
    println(protected_variable)
  }
}

object Access_Modifier {
  val test = new Access_Modifier
  def print_variables(): Unit ={
    println("========Printing Parent variable from companion object")
    println(test.public_variable)
    println(test.protected_variable)
    println(test.private_variable)
  }
}

object Demo{
  def main(args: Array[String]): Unit = {
    val child_class = new SubClass
    println("************In Demo Object: Accessing subclass method to print parent variables")
    child_class.print_parent_variables()
    println("\n************In Demo Object: Accessing parent method to print parent variables")
    child_class.print_variables()
    println("\n************In Demo Object: Accessing parent variables from instance of child class")
    println("Only public variable available on the instance: " +child_class.public_variable)
    println("\n************In Demo Object: Accessing variables from companion object")
    println("All variables available to companion object")
    Access_Modifier.print_variables()

  }
}