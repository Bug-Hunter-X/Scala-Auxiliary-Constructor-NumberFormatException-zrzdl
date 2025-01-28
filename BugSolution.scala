```scala
class MyClass(val x: Int) {
  def this(s: String) = {
    try {
      this(s.toInt)
    } catch {
      case e: NumberFormatException => 
        println(s"Error: Invalid input string: $s. Using default value 0.")
        this(0) // or throw a custom exception
    }
  }
}

val myObj = new MyClass("123")
println(myObj.x) // Prints 123

val myObj2 = new MyClass("abc")
println(myObj2.x) // Prints 0, handles exception gracefully
```