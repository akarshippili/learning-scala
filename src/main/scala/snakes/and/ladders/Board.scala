package com.akarsh.learning
package snakes.and.ladders

import snakes.and.ladders.cell.{Cell, Ladder, Snake}

class Board(players: List[Player], cells: List[List[Cell]]) extends BoardGame:

  def start(): Unit =
    val N = cells.size

    var index = 0
    while true do
      val player = players(index)
      val move = player.play
      println(move)
      val nextPostionIdx = player.position.x * N + player.position.y + move
      if(nextPostionIdx < N * N) {
        var nextPostion = Position(nextPostionIdx / N, nextPostionIdx % N)
        nextPostion = cells(nextPostion.x)(nextPostion.y).apply()
        player.updatePosition(nextPostion)
        println(s"${player.name} moved to $nextPostion")
        if(player.position.x == N-1 && player.position.y == N-1){
          println(s"${player.name} won the game!!!")
          return
        }

        index += 1
        index = index % (players.size)
      }