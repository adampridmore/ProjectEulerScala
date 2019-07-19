//Each new term in the Fibonacci sequence is generated by adding the previous two terms.
// By starting with 1 and 2, the first 10 terms will be:
//
// 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//
// By considering the terms in the Fibonacci sequence whose values do not exceed four
// million, find the sum of the even-valued terms.

object Problem02 {
  def main(args: Array[String]) {
    val nextFib = (a:Int, b:Int)=>(b,a+b)

    def sum3(xs: List[Int]): Int = {
      if (xs.isEmpty) 0
      else xs.head + sum3(xs.tail)
    }

    def fib(index :Int):Int = {
      index match {
        case 0 => 1
        case 1 => 2
        case x => fib(x - 1) + fib(x - 2)
      }
    }

    println(nextFib(0,1))

    println(fib(0))
    println(fib(1))
    println(fib(2))
    println(fib(3))
    println(fib(4))
    println(fib(5))
    println(fib(6))
    println(fib(7))
    //List.fill(0,10)
  }
}