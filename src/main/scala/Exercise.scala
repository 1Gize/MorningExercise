import scala.collection.mutable.ListBuffer

class Exercise {
  def counterPrevElem(ls :List[Int],n: Int)={
    if(n > 0 && ls.nonEmpty){
    val lsGrouped = ls.grouped(n)
    val checkList = new ListBuffer[Boolean]
    lsGrouped.foreach(x => {
      if(x.length == n){
        val res = x.sum - x(n-1)
        val z = res == x(n-1)
        checkList.addOne(z)
      }
    })
    !checkList.contains(false)
    }else{
      false
    }
  }
}
