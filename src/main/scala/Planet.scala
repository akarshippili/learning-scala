package com.akarsh.learning

enum Planet(val mass:Double, val radius:Double):
  case Mercury extends
    Planet(3.303e+23, 2.4397e6)
  case Venus extends
    Planet(4.869e+24, 6.0518e6)
  case Earth extends
    Planet(5.976e+24, 6.37814e6)

  private val G = 6.67300E-11
  def getGravity: Double = G * (this.mass) / (this.radius * this.radius)
  def getWeight(mass: Double): Double = mass * getGravity