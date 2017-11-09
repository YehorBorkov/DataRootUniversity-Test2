import scala.io.Source

// #1
val CIPHER = "GHMABGZ VKXTMXL LNVVXLL EBDX GHG-LMHI, XGMANLBTLMBV XYYHKM"
val ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

def caesarDecipher(cipheredString: String, alphabet: String, dispatch: List[String]): List[String] = {
  val key = alphabet.tail + alphabet.head
  val dict = (key zip ALPHABET).toMap
  if (key.equals(ALPHABET))
    dispatch
  else
    caesarDecipher(cipheredString, key, cipheredString.map(c => dict.getOrElse(c, c)) +: dispatch)
}

caesarDecipher(CIPHER, ALPHABET, List.empty).foreach(println(_))

val answer1 = "NOTHING CREATES SUCCESS LIKE NON-STOP, ENTHUSIASTIC EFFORT"

println(s"#1 - $answer1")

// #2
val NUMBERS_LIST_2 = Source.fromFile("E:\\Study\\DataRootUniversity\\Scala\\Test2\\task2.txt")
  .getLines
  .toList
  .map(_.reverse.toList.map(c => Integer.parseInt(c.toString)))

val sums = NUMBERS_LIST_2.head
  .zipAll(NUMBERS_LIST_2(1), 0, 0)
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

val answer2 = buildBinary(sums, List.empty).reduceLeft(
  (diff, curr) =>
    curr match {
      case 0 => diff - 1
      case 1 => diff + 1
    }
)

println(s"#2 - $answer2")

// #3
def palindromes: Stream[Int] =
  for (palindromeNumber <- Stream.from(1) if palindromeNumber.toBinaryString equals palindromeNumber.toBinaryString.reverse)
    yield palindromeNumber

val answer3 = palindromes.take(73).sum

println(s"#3 - $answer3")

// #4
val NUMBERS_4 = List(-1, -1, -2, -2, 1, -5, 1, 0, 1, 14, -8, 4, 5, -11, 13, 5, 7, -10, -4, 3, -6, 8, 6, 2, -9, -1, -4, 0)

val answer4 = NUMBERS_4.combinations(3).count(_.sum == 0)

println(s"#4 - $answer4")

// #5
val NUMBERS_LIST_5 = Source.fromFile("E:\\Study\\DataRootUniversity\\Scala\\Test2\\task5.txt")
  .getLines
  .toList
  .map(BigInt(_))

val answer5 = NUMBERS_LIST_5.sum.toString.take(10)

println(s"#5 - $answer5")
