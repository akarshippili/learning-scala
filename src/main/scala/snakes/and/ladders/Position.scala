package com.akarsh.learning
package snakes.and.ladders

case class Position(x: Int, y: Int):
  override def toString: String = s"$x, $y"
