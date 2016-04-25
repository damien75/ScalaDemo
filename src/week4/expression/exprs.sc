import week4.expression._

def show(e: Expr): String = e match {
  case Number(x) => x.toString
  case Sum(l, r) => show(l) + " + " + show(r)
}

show(Sum(Number(1), Number(44)))

val fruits = List("apples", "oranges", "pears")
val numbers = List(1, 2, 3, 4)
val nums = 1 :: (2 :: (3 :: (4 :: Nil))) //using cons - construction operator
val diag3 = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1))

def insertionSort(xs: List[Int]): List[Int] = xs match {
  case List() => List()
  case y :: ys => insert(y, insertionSort(ys))
}

def insert(x: Int, xs: List[Int]): List[Int] = xs match {
  case List() => List(x)
  case y :: ys => if (x < y) x :: xs else y :: insert(x, ys)
}

insertionSort(List(7, 3, 9, 2))