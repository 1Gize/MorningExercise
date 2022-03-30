object Exercise {
  // Multiple argument list
  // Max: 2
  def sumPrevElemIsEqual(ls: Seq[Int], n: Int) = {
    (n, ls) match {
      case _ if n > 0 && ls.nonEmpty =>
        val part = ls.grouped(n)
          .partition(ns => ns.length == n)
          part._1.forall { ns =>
          val res = ns.sum - ns(n - 1)
          res == ns(n - 1)
        }
        part._2.forall{ ns => false}

      case _ => false
    }
  }
}
