package com.akarsh.learning


import java.util
import scala.util.Random

@main
def main(): Unit = {
  println("Hello world!")

  def nTimes(n:Int) = (value :Int) => {
      val random = new Random()
      for (_ <- 0 until n) {
        if (random.nextInt() < value) {
          println(s"value less than $value")
        } else {
          println(s"val greater than or equal to $value")
        }
      }
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

}