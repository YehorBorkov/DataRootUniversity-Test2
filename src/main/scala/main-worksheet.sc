import scala.io.Source

// #1
val CIPHER = "GHMABGZ VKXTMXL LNVVXLL EBDX GHG-LMHI, XGMANLBTLMBV XYYHKM"
val ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"


//TODO: Terminate recursion somehow
//def caesarDecipher(xs: String, xa: String): String = {
//  val key = xa.tail + xa.head
//  println(xs.map(c => if (ALPHABET contains c) (key zip ALPHABET).toMap getOrElse(c, 'e') else c))
//  caesarDecipher(xs, key)
//}

//caesarDecipher(CIPHER, ALPHABET)

val answer1 = "NOTHING CREATES SUCCESS LIKE NON-STOP, ENTHUSIASTIC EFFORT"

println(s"#1 - $answer1")

// #2

val STRINGS = Source.fromFile("G:\\task2.txt").getLines.toList
val NUMBERS0 = STRINGS(0).reverse.map( c => Integer.parseInt(c.toString))
val NUMBERS1 = STRINGS(1).reverse.map( c => Integer.parseInt(c.toString))
val PAIRS = NUMBERS0.zipAll(NUMBERS1, 0, 0).reverse

def xor(a: Int, b: Int): Int =
  if (a + b == 2) 0 else 1

//PAIRS.foldLeft(0)((r,c) => xor(r,c))

println(s"#2 - ${/*answer #2*/}")

// #3

// your code goes here

println(s"#3 - ${/*answer #3*/}")

// #4

// your code goes here

println(s"#4 - ${/*answer #4*/}")

// #5

// your code goes here

println(s"#5 - ${/*answer #5*/}")