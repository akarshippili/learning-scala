package com.akarsh.learning
package snakes.and.ladders

import snakes.and.ladders.cell.{Ladder, NormalCell}

@main
def run(): Unit = {
  val playerA = Player("akarsh", Position(0, 0))
  val playerB = Player("abhi", Position(0, 0))
  val playerC = Player("Amma", Position(0, 0))
  val playerD = Player("Nanna", Position(0, 0))

  var cells = List(
    List(NormalCell(Position(x = 0, y = 0)), Ladder(start = Position(x = 0, y = 1), end = Position(x = 1, y = 1)), NormalCell(Position(x = 0, y = 2)), NormalCell(Position(x = 0, y = 3))),
    List(NormalCell(Position(x = 1, y = 0)), NormalCell(Position(x = 1, y = 1)), NormalCell(Position(x = 1, y = 2)), NormalCell(Position(x = 1, y = 3))),
    List(NormalCell(Position(x = 2, y = 0)), NormalCell(Position(x = 2, y = 1)), NormalCell(Position(x = 2, y = 2)), NormalCell(Position(x = 2, y = 3))),
    List(NormalCell(Position(x = 3, y = 0)), NormalCell(Position(x = 3, y = 1)), NormalCell(Position(x = 3, y = 2)), NormalCell(Position(x = 3, y = 3))),
  )

  val board = Board(List(playerA, playerB, playerC, playerD), cells)
  board.start()
}
