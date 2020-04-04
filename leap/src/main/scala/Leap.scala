object Leap extends App {
  def leapYear(year: Int): Boolean = {
    if (year % 400 == 0) {
      true
    } else {
      year % 4 == 0 && year % 100 != 0
    }
  }

  println(leapYear(1900))
}
