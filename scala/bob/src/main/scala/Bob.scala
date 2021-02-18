object Bob {

  def isQuestionPosed(statement: String): Boolean = {
    statement.takeRight(1) == "?"
  }

  def isAllCaps(statement: String): Boolean = {
    statement == statement.toUpperCase()
  }

  def otherSentence(statement: String): Boolean = {
    val sentence_end: String = statement.takeRight(1)
    sentence_end == "." || sentence_end == "!"
  }

  def response(statement: String): String = {
    statement match {
      case statement if isQuestionPosed(statement) && isAllCaps(statement) => "Calm down, I know what I'm doing!"
      case statement if isQuestionPosed(statement) => "Sure"
      case statement if isAllCaps(statement) => "Whoa, chill out!"
      case statement if otherSentence(statement) => "Whatever."
      case _ => "Whatever"
    }
  }
}