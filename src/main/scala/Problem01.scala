object Problem01 {
  def main(args: Array[String]) {
    val ans = List
      .range(0, 1000)
      .filter((x:Int) => x%5==0||x%3==0)
      .sum

    println(ans)
  }
}
