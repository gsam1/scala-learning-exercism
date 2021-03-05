object SecretHandshakeExplore extends App {
  val resp = SecretHandshake.commands(1)
  
  def test(a: Int): List[String] = {
    println(a)
    a match {
      case a if (a / 16 > 0) => test(a - 16).reverse
      case a if (a / 8 > 0) => test(a - 8) ++ List("jump") 
      case a if (a / 4 > 0) => test(a - 4) ++ List("close your eyes")
      case a if (a / 2 > 0) => test(a - 2) ++ List("double blink")
      case a if (a == 1) => List("wink")
      case a if (a == 0) => List()
    }
  }
  println(test(15))
}