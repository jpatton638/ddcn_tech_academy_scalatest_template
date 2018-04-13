package example

object Hello extends App {

  def crossover(first: Chromosome, second: Chromosome, index: Int): List[String] = {

    val firstCombination = first.getStart(index).concat(second.getEnd(index))
    val secondCombination = second.getStart(index).concat(first.getEnd(index))

    List(firstCombination, secondCombination)
  }
}

case class Chromosome(dna: String) {

  def getStart(index: Int): String = {
    dna.substring(0, index)
  }

  def getEnd(index: Int): String = {
    dna.substring(index)
  }
}
