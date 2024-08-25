import scala.util.Try
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object AdvanceScala extends App{
  lazy val lazyInt = 42
  lazy val lazyValWithSideEffect = {
    println("lazy")
    24
  }

  val value = {
    println("not lazy")
    lazyValWithSideEffect + 1
  }
  println(value)
  
  // pseudo-collecton: "Option", "Try"
  def getName():String = null
  val optionalName = Option(getName())

  val name = optionalName match
    case None => "I got nothing!!!"
    case Some(value) => s"I got a string value: $value"
  
  println(name)

  val optionalLenght = optionalName.map(_.length())
  println(optionalLenght)


  def methodWhichCanThrowException(): String = throw new RuntimeException()

//   methodWhichCanThrowException()
  
//   try{
//     methodWhichCanThrowException()
//   } catch {
//     case e: RuntimeException => println("got a runtime exception!!!")
//     case _ => println("got a exception!!, but don't know what it is!!")
//   } finally{
//     println("finally!!!")
//   }

  val result = Try(methodWhichCanThrowException())
  println(result)

  val aFuture = Future({
    println("Loading value ...")
    Thread.sleep(1000)
    println("Loaded value.")
    69
  })

  println("main thread, before sleep")
  Thread.sleep(2000)
  println("main thread, after sleep")

  val bFuture = aFuture.andThen(try_ => {
    println("and then.")
    try_.getOrElse(96)
  })

  bFuture.onComplete(try_ => println(s"value: ${try_.getOrElse(96)}"))
  println(s"${Thread.currentThread().getName}, waiting for 2s ...")
  Thread.sleep(2000);



 // implicits
 // 1. implicits args
  private def methodWithImplicitsArgs(implicit arg: Int) = {
    arg + 1
  }

  implicit val implicitVal: Int = 1
  println(methodWithImplicitsArgs)


  // 2. implicit conversions
  implicit class MyRichInteger(n: Int):
    def even():Boolean = n%2 == 0


  println(23.even())
  println(MyRichInteger(23).even())
  // can be dangerous so, use carefully


  /**
   * Definition for a binary tree node.
   */

  class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
    var value: Int = _value
    var left: TreeNode = _left
    var right: TreeNode = _right
  }
  
  object Solution {
    def postorderTraversal(root: TreeNode): List[Int] = {
      if root == null then List.empty[Int]
      else {
        val left = postorderTraversal(root.left)
        val right = postorderTraversal(root.right)
        left ++ right ++ List[Int](root.value)
      }
    }
  }
}
