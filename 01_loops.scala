val phases:List[String] = List("Scala", "is", "fun")

var i = 0
while (i < phases.length) {
  println(phases(i))
  i += 1
}

phases.foreach((arg: String) => println(arg))

for (arg <- phases) {
  println(arg)
}