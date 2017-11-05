import scala.io.Source

// #1
val CIPHER = "GHMABGZ VKXTMXL LNVVXLL EBDX GHG-LMHI, XGMANLBTLMBV XYYHKM"
val ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"


def caesarDecipher(cipherdString: String, althabet: String): List[String] = {
  val key = althabet.tail + althabet.head
  if (key.equals(ALPHABET))
    List.empty
  else
    cipherdString.map(c => if (ALPHABET contains c) (key zip ALPHABET).toMap getOrElse(c, '~') else c) :: caesarDecipher(cipherdString, key)
}

caesarDecipher(CIPHER, ALPHABET).foreach(println(_))

val answer1 = "NOTHING CREATES SUCCESS LIKE NON-STOP, ENTHUSIASTIC EFFORT"

println(s"#1 - $answer1")

// #2
val NUMBERS_LIST = Source.fromFile("G:\\task2.txt")
  .getLines
  .toList
  .map(_.reverse.toList.map(c => Integer.parseInt(c.toString)))

val sums = NUMBERS_LIST.head
  .zipAll(NUMBERS_LIST(1), 0, 0)
  .map{ case (a, b) => a + b }

def buildBinary(sumsList: List[Int], resultBinary: List[Int]): List[Int] = {
  if (sumsList.nonEmpty)
    sumsList.head match {
      case 0 => buildBinary(sumsList.tail, 0 :: resultBinary)
      case 1 => buildBinary(sumsList.tail, 1 :: resultBinary)
      case 2 => buildBinary(sumsList.tail.head + 1 :: sumsList.tail.tail, 0 :: resultBinary)
      case 3 => buildBinary(sumsList.tail.head + 1 :: sumsList.tail.tail, 1 :: resultBinary)
    }
  else
    resultBinary
}

val result = buildBinary(sums, List.empty).reduceLeft(
  (diff, curr) =>
    curr match {
      case 0 => diff - 1
      case 1 => diff + 1
    }
)

println(s"#2 - $result")

// #3

// your code goes here

println(s"#3 - ${/*answer #3*/}")

// #4

// your code goes here

println(s"#4 - ${/*answer #4*/}")

// #5

// your code goes here

println(s"#5 - ${/*answer #5*/}")