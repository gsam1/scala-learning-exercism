class School(database: Map[Int, Seq[String]]) {
  type DB = Map[Int, Seq[String]]

  def this() {
    this(Map.empty)
  }

  def db: DB = database

  def add(name: String, g: Int): School = {
    if (this.db.contains(g)) {
      val updatedGrade = this.db(g) :+ name
      new School(this.db + (g -> updatedGrade))
    } else {
      new School(this.db + (g -> Seq(name)))
    }
  }

  def grade(g: Int): Seq[String] = this.db(g)

  def sorted: DB =
    db.toSeq.sortBy(_._1).map(x => (x._1, x._2.sorted)).toMap
}