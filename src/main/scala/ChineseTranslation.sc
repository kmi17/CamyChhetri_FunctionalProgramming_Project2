val chinese: List[String] = List("ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu", "shi")
val english: List[String] = List("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten")
val a = chinese
val b = english

//val mylist = a ::: b

val languageMap = (a:::b)






// myMember
/**
def myMember(listFromUser: List[String], myList: List[String]): Boolean =
myList match {
  case Nil => false
  case listHead::listTail => if (listFromUser.head == myList.head) true else myMember(listFromUser.tail, myList.tail)
}

**/





