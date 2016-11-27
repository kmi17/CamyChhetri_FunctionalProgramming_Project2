
//var mylist = List()
val primes = 2 #:: Stream.from(3,2).filter(isPrime)




isPrime(6)
isTwinPrime(6, 3)
val testlist = twinPrimeList(50)
goldbach(28)


def isPrime(n: Int): Boolean = {
  return primes.takeWhile(p => p * p <= n).forall(n % _ != 0)
}







def isTwinPrime(n: Int, x: Int): Boolean = {
  return (isPrime(n) && isPrime(x)) && (n - x == Math.abs(2) || x - n == Math.abs(2))


}



isTwinPrime(41, 43)



def twinPrimeList(n: Int): List[Int] = n match {
  case x if x < 3 => Nil
  case _ => if(isTwinPrime(n-2, n) || isTwinPrime(n+2, n)) n::twinPrimeList(n-1) else twinPrimeList(n-1)
}


def goldbach(n: Int): Unit = {
  if(n % 2 != 0 || n <= 2)
    println("Not a valid entry ")
  else
    goldbachAppend(1, n)
}

def goldbachAppend(i: Int, n: Int): Unit={
  //println(i)
  if ((i + n-i == n) && isPrime(i) && isPrime(n-i))
    println("Here is the goldbach number" + n + "  " + i + " + " + (n-i))
  else if(i < n)
    goldbachAppend(i+1, n)
}


