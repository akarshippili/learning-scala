package com.akarsh.learning
package snakes.and.ladders.cell

import snakes.and.ladders.Position

case class NormalCell(position: Position) extends Cell:
  override def apply(): Position = position
