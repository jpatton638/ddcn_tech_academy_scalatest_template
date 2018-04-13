package example

import org.scalatest._

class HelloSpec extends WordSpec with MustMatchers {

  "The crossover object" should {

    "Return a list of strings" in {

      Hello.crossover(Chromosome("111"), Chromosome("000"), 1) mustEqual List("100", "011")
    }

    "swaps input at given index" in {
      Hello.crossover(Chromosome("1111"), Chromosome("0000"), 1) mustEqual List("1000", "0111")
    }
  }
}
