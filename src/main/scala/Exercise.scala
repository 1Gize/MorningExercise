object Exercise {
  // Multiple argument list
  // Max: 2
  def sumPrevElemIsEqual(ls: Seq[Int], n: Int) = {
    (n, ls) match {
      case _ if n > 0 && ls.nonEmpty =>
        ls.grouped(n)
          .filter(ns => ns.length == n).forall { ns =>
          val res = ns.sum - ns(n - 1)
          res == ns(n - 1)
        }
      case _ => false
    }
  }
}
