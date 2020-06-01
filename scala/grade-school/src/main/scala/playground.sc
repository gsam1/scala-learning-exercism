def updateMap(mapToUpdate: Map[Int, Seq[String]], key: Int, update: String): Map[Int, Seq[String]] = {
  if (mapToUpdate.contains(key)) {
    val updateVal = mapToUpdate(key) :+ update
    mapToUpdate + (key -> updateVal)
  } else {
    mapToUpdate + (key -> Seq(update))
  }
}

val test: Map[Int, Seq[String]] = Map.empty
val test1 = updateMap(test, 2, "Trincho")
val test2 = updateMap(test1, 1, "Gosh")
val test3 = updateMap(test2, 1, "Pesh")
val test4 = updateMap(test3, 1, "Aor")
val test5 = updateMap(test4, 3, "Qew")
//val test2 = test + (2->Seq("Hello"))
//val updateValue = test2(2) :+ "Bye"
//val test3 = test2 + (2-> updateValue)
test5.toSeq.sortBy(_._1).map(x => (x._1, x._2.sorted)).toMap