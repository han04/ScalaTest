package Functional_Programming

object Test_01_FunctionAndMethod {

    def main(args: Array[String]): Unit = {
      //define function
      def sayHi(name:String): Unit={
        println("hi," + name)
      }
      sayHi("zzh")

      Test_01_FunctionAndMethod.sayHello("bob")

      val result = Test_01_FunctionAndMethod.sayHello("cary")
      println(result)
    }

    // define constructors
    def sayHello(name:String): String = {
      println("Hello," + name)
      return "hello!"
    }

  }


