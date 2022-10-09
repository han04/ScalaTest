package Functional_Programming

object Test07_Practice_CollectionOperation {
  def main(args: Array[String]): Unit = {

    val arr: Array[Int] = Array(12,45,75,98)

    //对数组进行处理， 将操作抽象出来， 处理完毕
    def arrayOperation(array: Array[Int], op: Int => Int):Array[Int]={
      for (elem <- array) yield op(elem)
    }

    def addOne(elem: Int):Int = {
      elem + 1
    }

    //调用函数
    val newArray : Array[Int] = arrayOperation(arr,addOne)

    println(newArray.mkString(","))

    val newArray2 = arrayOperation(arr, _ * 2)
    println(newArray2.mkString(", "))
  }

}
