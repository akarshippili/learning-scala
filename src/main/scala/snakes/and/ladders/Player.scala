package com.akarsh.learning
package snakes.and.ladders

import scala.util.Random

class Player(val name: String, var position: Position):
  
  def play: Int = math.abs(new Random().nextInt() % 6) + 1
  def getPosition: Position = position
  def updatePosition(cell: Position): Unit =
    this.position = cell
