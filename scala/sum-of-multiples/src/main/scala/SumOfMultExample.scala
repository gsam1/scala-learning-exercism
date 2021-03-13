object SumOfMultExample extends App {

  
  def genMultiples(factors: Set[Int], limit: Int): List[Int] = {
    if (factors.size == 1) List.range(0, limit, factors.head)
    else {
      List.range(0, limit, factors.head) ++ genMultiples(factors.tail, limit)
    }
  }

  def sum(factors: Set[Int], limit: Int): Int = {
    val multiples = genMultiples(factors, limit)
    multiples.distinct.sum
  }

  println(sum(Set(3,5), 20))
}