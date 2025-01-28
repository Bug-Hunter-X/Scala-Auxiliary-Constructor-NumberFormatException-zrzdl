```scala
class MyClass(val x: Int) {
  def this(s: String) = this(s.toInt)
}

val myObj = new MyClass("123")
println(myObj.x) //Prints 123

val myObj2 = new MyClass("abc")
println(myObj2.x) // throws NumberFormatException
```