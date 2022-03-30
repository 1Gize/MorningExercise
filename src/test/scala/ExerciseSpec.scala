import collection.mutable.Stack
import org.scalatest._
import flatspec._
import matchers._

class ExerciseSpec extends AnyFlatSpec with should.Matchers{
    "Function" should "Count sum of n - 1 values in a list and check if they are equal to n value"  in{
      val exeClas = new Exercise
      val list = List(1,2,3,6,0,0,0,0)
      exeClas.counterPrevElem(list,4) shouldBe(true)
      exeClas.counterPrevElem(list,3) shouldBe(false)
    }
    it should "not take 0 as n parameter " in{
      val exeC = new Exercise
      val list = List(1,2,3,5,0,0,0,0)
      exeC.counterPrevElem(list,0) shouldBe(false)
    }
    it should "not take empty list as parameter" in{
      val exeC = new Exercise
      val list = List.empty[Int]
      exeC.counterPrevElem(list,5)  shouldBe(false)
    }
}
