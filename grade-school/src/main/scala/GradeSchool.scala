class School {
  type DB = Map[Int, Seq[String]]

  private val _db = scala.collection.mutable.Map.empty[Int, Seq[String]]

  def db: Map[Int, Seq[String]] = _db.toMap

  def add(name: String, g: Int): Unit =
    _db.update(g, db.getOrElse(g, Seq.empty[String]) :+ name)

  def grade(g: Int): Seq[String] = _db.getOrElse(g, Seq.empty[String])

  def sorted: Map[Int, Seq[String]] =
    _db.toSeq
      .sortBy(_._1)
      .map(a => (a._1, a._2.sorted))
      .toMap
}
