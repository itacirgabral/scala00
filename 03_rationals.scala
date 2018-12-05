class Rational (x:Int, y:Int) {
    def numer = x
    def denom = y

    override def toString = this.numer + "/" + this.denom
    
    def neg:Rational = new Rational(-this.numer, this.numer)

    def + (that: Rational) = new Rational(this.numer * that.denom + that.numer * this.denom, this.denom * that.denom)
    def - (that: Rational) = this.add(that.neg)
}

val r1 = new Rational(1,1)
val r2 = new Rational(2,2)

r1 + r2