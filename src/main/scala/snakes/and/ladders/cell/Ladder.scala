package com.akarsh.learning
package snakes.and.ladders.cell

import snakes.and.ladders.Position

case class Ladder(start: Position, end: Position) extends Cell:
  override def apply(): Position = end
