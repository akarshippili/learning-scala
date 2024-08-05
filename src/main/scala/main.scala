package com.akarsh.learning


import Planet.{Earth, Mercury, Venus}

import scala.annotation.tailrec
import scala.util.Random

def getPlanetIndex(planet: Planet) = {
  planet match
    case Mercury => 1
    case Venus => 2
    case Earth => 3
}

@main
def main(): Unit = {
  println("Hello world!")

  def nTimes(n:Int) = (value :Int) => {
      val random = new Random()
      for _ <- 0 until n do
        if (random.nextInt() < value) then println(s"value less than $value")
        else println(s"val greater than or equal to $value")
  }

  val oneTime = nTimes(1)
  oneTime(10)
  oneTime(20)

  nTimes(1000)(0)

  //val index = util.HashMap[String, util.ArrayList[Person]]()

  val person: Person = new Person("akarsh", "ippili", 24)
  println(person)
  println(Person())
  println(Person("akarsh"))
  println(Person("akarsh", "ippili"))
  println(Person(24))

  for
    i <- 1 to 2
    j <- 'a' to 'b'
    k <- 1 to 10 by 5
  do
    println(s"i = $i, j = $j, k = $k")

  var i = 0
  while(i <= 10) do
    println(s"$i ${"." * i}")
    i += 1

  @tailrec
  def printer(x:Int):Unit =
    if(x == 0) then
      println("Boom!!!")

    if(x > 0) then
      println(x)
      printer(x-1)
  printer(3)


  Planet.values
    .map(planet => (planet, planet.getGravity))
    .foreach((planet:Planet, gravity:Double) => println(s"planet: $planet -> gravity: $gravity"))

  println(getPlanetIndex(Earth))
  println(Earth.mass)


  collectionExamples()
}