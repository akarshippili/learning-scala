object LearningOOP extends App {

    class Animal():
        val age = 0
        def eat() = println("Eating")
        override def toString(): String = s"Animal, age: $age"
    
    class Dog(val name: String) extends Animal:
        override def toString(): String = s"Dog, age: $age"

    val aDog = new Dog("abhi")
    println(aDog)
    println(aDog.name)

    abstract class WalkingAnimal():
        var numberOfLegs = 0
        def walk(): Unit = println(s"walking with $numberOfLegs")
    
    trait Carnivore:
        def eat(animal: Animal): Unit
    
    class Crocodile extends Animal with Carnivore: // with WalkingAnimal:
        override def eat(animal: Animal): Unit =  println(s"eating $animal")
        override def eat(): Unit = println("Crocodile eating")
    
    val aCroc = new Crocodile()
    aCroc.eat()
    aCroc.eat(aDog)

}
