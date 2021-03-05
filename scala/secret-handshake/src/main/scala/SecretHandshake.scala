object SecretHandshake {
  def commands(cmd: Int): List[String] = {
    cmd match {
    case cmd if (cmd / 16 > 0) => commands(cmd - 16).reverse
    case cmd if (cmd / 8 > 0) => commands(cmd - 8) ++ List("jump") 
    case cmd if (cmd / 4 > 0) => commands(cmd - 4) ++ List("close your eyes")
    case cmd if (cmd / 2 > 0) => commands(cmd - 2) ++ List("double blink")
    case cmd if (cmd == 1) => List("wink")
    case cmd if (cmd == 0) => List()
    }
  }
}