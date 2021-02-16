/*
Bob answers 'Sure.' if you ask him a question, such as "How are you?".
He answers 'Whoa, chill out!' if you YELL AT HIM (in all capitals).
He answers 'Calm down, I know what I'm doing!' if you yell a question at him.
He says 'Fine. Be that way!' if you address him without actually saying anything.
He answers 'Whatever.' to anything else.
Bob's conversational partner is a purist when it comes to written communication and a
lways follows normal rules regarding sentence punctuation in English.
*/


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
