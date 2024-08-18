object LearningFunctional extends App {

    class Person(val name: String):
        def getName:String = name
        def apply():Unit = println(s"Apply in person: $name")
        def apply(age:Int):Unit = println(s"Apply in person: $name, age: $age")

    val aPerson = new Person("akarsh")
    aPerson()
    aPerson(24)


    // FunctionX -> enables functional programming on JVM
    val scalaFunction = new Function1[Int, Int] {
        def apply(v1: Int): Int = "scala".chars().reduce(1, (a,b) => (a + b) % v1)
    }

    // syntax sugars
    val scalaFunction2: Function1[Int, Int] = (v1:Int) => "scala".chars().reduce(1, (a,b) => (a + b) % v1)
    val scalaFunction3: (Int => Int) = (v1:Int) => "scala".chars().reduce(1, (a,b) => (a + b) % v1)
    val scalaFunction4 = (v1:Int) => "scala".chars().reduce(1, (a,b) => (a + b) % v1)

    println(scalaFunction(13))
    println(scalaFunction2(13))
    println(scalaFunction3(13))

    // higher-order functions
    // 1. functions passed as method args
    val doubler = (x:Int) => 2*x
    val mappedList = List(1,2,3).map(doubler)
    println(mappedList)

    val flatMappedList = List(1,2,3).flatMap(x => List.fill(x)(x))
    println(flatMappedList)

    def getCombinations: Int => List[String] = (x:Int) => List('a', 'b', 'c').map(ch => x.toString() + ch.toString())
    val combinations = List(1,2,3).flatMap[String](getCombinations)
    println(combinations)

    val alternativeCombination = 
        for number <- List(1,2,3)
            char <- List('a', 'b', 'c')
        yield s"$number$char"

    println(alternativeCombination) 
}