object Etl {
    def transform(input: Map[Int,Seq[String]]): Map[String, Int] = {
        input.flatMap(x => x._2.map(y => y.toLowerCase() -> x._1))
    }
}