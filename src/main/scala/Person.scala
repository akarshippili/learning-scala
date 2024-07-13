package com.akarsh.learning

class Person(var firstName:String, var lastName: String, var age:Int) {
  def this() = this("", "", 0)
  def this(firstName: String) = this(firstName, "", 0)
  def this(firstName: String, secondName: String) = this(firstName, secondName, 0)

  def this(age: Int) = {
    this()
    this.age = age
  }
  override def toString: String = s"{firstname: $firstName, lastName: $lastName, age: $age}"
}
