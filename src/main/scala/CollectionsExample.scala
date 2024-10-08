package com.akarsh.learning

def collectionExamples(): Unit = {
  val ints = List(1, 2, 3)
  val list: List[List[Any]] = List(List(1, 2, 3), List("a", "b", "c"))

  println(s"arr: $ints, size: ${ints.size}")
  println(s"arr: $list, size: ${list.size}")

  for
    i <- ints.indices
  do
    println(s"index: $i, value: ${ints(i)}")


  val ints1 = 1 :: 2 :: 3 :: Nil
  val ints2 = 3 :: 4 :: 5 :: Nil
  val ints3 = ints2.head :: ints1
  val ints4 = 10 :: ints2.tail
  println(s"ints1: $ints1, ints2: $ints2, ints3: $ints3, ints4: $ints4")

  println(ints1.foldLeft(1)((a: Int, c: Int) => a - c))
  println(ints2.filter((_: Int) >= 4).map(_ => 2))

  var N = 10
  val ans = for
    x <- 2 to N
    y <- 2 to x
    if x % y == 0
  yield (x, y)
  println(ans)


  def getFactors(N: Int): IndexedSeq[(Int, Int)] =
    (2 to N).flatMap(x => {
      (2 to x)
        .filter(y => (x % y == 0))
        .map((x -> _))
    })

  println(getFactors(3))
  println(getFactors(10))
}