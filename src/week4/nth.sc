import week4._

object nth {
  def nth[T](n: Int, xs: List[T]): T =
    if (n == 0) xs.head
    else if (xs.tail.isEmpty) throw new IndexOutOfBoundsException
    else nth(n - 1, xs.tail)
}

val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))
nth.nth(2, list)
nth.nth(-1, list)