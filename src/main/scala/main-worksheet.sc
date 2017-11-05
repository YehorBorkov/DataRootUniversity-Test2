
// #1
val CIPHER = "GHMABGZ VKXTMXL LNVVXLL EBDX GHG-LMHI, XGMANLBTLMBV XYYHKM"
val ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

def caesarDecipher(xc: String, xa: String): String = {
  val key = xa.tail + xa.head
//  println(xs.map(c => if (ALPHABET contains c) (key zip ALPHABET).toMap getOrElse(c, 'e') else c))
  caesarDecipher(xc, key)
}

caesarDecipher(CIPHER, ALPHABET)

val answer1 = "NOTHING CREATES SUCCESS LIKE NON-STOP, ENTHUSIASTIC EFFORT"

println(s"#1 - $answer1")

// #2

// your code goes here

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