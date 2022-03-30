import collection.mutable.Stack
import org.scalatest._
import flatspec._
import matchers._

class ExerciseSpec extends AnyFlatSpec with should.Matchers {
  "sumPrevElementIsEqual" should "Count sum of n - 1 values in a list and check if they are equal to n value" in {
    val list = Seq(1, 2, 3, 6, 0, 0, 0, 0)
    Exercise.sumPrevElemIsEqual(list, 4) shouldBe true
    Exercise.sumPrevElemIsEqual(list, 3) shouldBe false
  }

  ignore should "FIXME" in {
    val actual = Seq(1, 2, 3, 5)
    val expected = false
    Exercise.sumPrevElemIsEqual(actual, 6) shouldBe expected
  }

  it should "not take 0 as n parameter " in {
    val list = Seq(1, 2, 3, 5, 0, 0, 0, 0)
    Exercise.sumPrevElemIsEqual(list, 0) shouldBe false
  }
  it should "not take empty list as parameter" in {
    val list = Seq.empty[Int]
    Exercise.sumPrevElemIsEqual(list, 5) shouldBe false
  }
}
