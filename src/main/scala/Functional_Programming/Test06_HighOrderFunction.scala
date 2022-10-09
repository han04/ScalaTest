package Functional_Programming

object Test06_HighOrderFunction {
  def main(args: Array[String]): Unit = {
    def f(n: Int): Int = {
      println("f is used")
      n + 1
    }

    def fun(): Int ={
      println("fun is used")
      1
    }

    val result = f(123)
    println(result)

    // 1. 函数作为值传递
    val f1 = f _
    val f2 : Int => Int = f

    println(f1)
    println("----------------------------")
    println(f1(12))
    println("----------------------------")
    println(f2)
    println("----------------------------")
    println(f2(23))

    fun
    fun()

    val f3 = fun
    val f4 = fun _
    println(f3)
    println(f4)

    // 2. 函数作为参数进行传递
    // 定义二元运算
    def dualEval(op : (Int, Int)=> Int, a: Int, b: Int):Int = {
      op(a,b)
    }

    def add(a:Int , b:Int):Int = {
      a+b
    }

    println(dualEval(add,12,33))
    println(dualEval((a,b)=> a+b,12,34))
    println(dualEval(_+_,12,35))

    // 3. 函数作为返回值
    def f5(): Int => Unit = {
      def f6(a:Int):Unit={
        println("f6 is used " + a)
      }
      f6//return
    }
    println(f5())
    println(f5()(25))

  }
}
