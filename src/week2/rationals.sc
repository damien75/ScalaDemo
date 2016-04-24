object rationals {
  val a = new Rational(1, 3)
  a.numer
  a.denom

  val b = new Rational(5, 7)

  val c = new Rational(3, 2)
  a.sub(b).sub(c)

  class Rational(x: Int, y: Int){
    def numer = x
    def denom = y

    def add(that: Rational) =
      new Rational(
        numer * that.denom + that.numer * denom,
        denom * that.denom)

    def neg: Rational = new Rational(-numer, denom)

    def sub(that: Rational) =
      add(that.neg)

    override def toString = numer + "/" + denom
  }
}