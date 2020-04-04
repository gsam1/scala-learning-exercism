object SpaceAge extends App {

  def calcEarthYears(age: Int): Float = age / (60 * 60 * 24 * 365)
  def getPlanetModifier(planet: String): Double = planet match {
    case "Mercury" => 0.2408467
    case "Venus" => 0.61519726
    case "Earth" => 1.0
    case "Mars" => 1.8808158
    case "Jupiter" => 11.862615
    case "Saturn" => 29.447498
    case "Uranus" => 84.016846
    case "Neptune" => 164.79132
  }

  def getSpaceAge(age: Int, planet: String): Double = {
    val earthYears = calcEarthYears(age)
    val planetModifier = getPlanetModifier(planet)
    return earthYears / planetModifier
  }

  println(getSpaceAge(30*24*3600*365, "Mercury"))
}