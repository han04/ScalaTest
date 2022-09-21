package Functional_Programming

object Test_05_Lambda {
  def main(args: Array[String]): Unit = {
    val fun = (name: String) => {
      println(name)
    }

    //    fun("abc")
    // 函数作为一个参数输入
    def f(func: String => Unit): Unit = {
      func("qwe")
    }


    f(call => {
      println(call+call)
    })

    f(println(_))
  }

  def dualFunction(fun:(Int, Int)=>Int):Int={
    fun(1,2)
  }

  val add = (a:Int,b:Int) => a + b
  val minus = (a:Int, b:Int) => a - b
  println(dualFunction(add))
  println(dualFunction(minus))
}
