package week3

object intsets{
  abstract class IntSet {
    def incl(x: Int): IntSet
    def contains(x: Int): Boolean
    def union(other: IntSet): IntSet
  }

  object Empty extends IntSet {
    override def incl(x: Int): IntSet = new BT(x, Empty, Empty)

    override def contains(x: Int): Boolean = false

    override def union(other: IntSet) = other

    override def toString = "."
  }

  class BT(elem: Int, left: IntSet, right: IntSet) extends IntSet {
    override def incl(x: Int): IntSet =
      if (x < elem) new BT(elem, left incl x, right)
      else if (x > elem) new BT(elem, left, right incl x)
      else this

    override def contains(x: Int): Boolean =
      if (x < elem) left contains x
      else if (x > elem) right contains x
      else true

    override def union(other: IntSet): IntSet =
      ((left union right) union other) incl elem

    override def toString = "{" + left + elem + right + "}"
  }

  val t1 = new BT(3, Empty, Empty)
  val t2 = t1 incl 4
}