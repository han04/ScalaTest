package Functional_Programming

object Test_03_FunctionParameter {
  def main(args: Array[String]): Unit = {
    // (1) 可变参数
    def f1(str:String*):Unit={
      println(str)
    }
    f1("bob")
    f1("alice","tom")

//    （2）如果参数列表中存在多个参数，那么可变参数一般放置在最后
    def f2(str1:String,str2:String*):Unit={
      println("str1: "+str1+"  str2:"+str2)
    }
    f2("abc ","q","w")
    //（3）参数默认值，一般将有默认值的参数放置在参数列表的后面
    def f3(name: String = "Ash"): Unit = {
      println("Legend " + name)
    }
    f3()
    f3("Aki")

    //（4）带名参数
    def f4(name:String="Tom",age:Int=12):Unit={
      println(s"${name} is ${age} years old")
    }
    f4()
    f4(age=14)
    f4(age=13,name="Alice")
  }

}
