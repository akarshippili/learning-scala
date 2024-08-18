package com.akarsh.learning

import Shape.calculateArea

import scala.math.{Pi, pow}

case class Circle(radius: Double):
  def area: Double = Circle.calculateArea(radius)
  def area2: Double = Shape.calculateArea(radius)

object Circle:
   private def calculateArea(radius: Double): Double = Pi * pow(radius, 2.0)

object Shape:
//  private def calculateArea(radius: Double): Double = Pi * pow(radius, 2.0)
  def calculateArea(radius: Double): Double = Pi * pow(radius, 2.0)


@main
def runner(): Unit = {
  val circle1 = Circle(5.0)
  print(circle1.area)
}
