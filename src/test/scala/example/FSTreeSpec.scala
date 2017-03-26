package example

import org.scalatest._

class FSTreeSpec extends FlatSpec with Matchers {
  "The FSTree object" should "print its help when no arguments are provided" in {
    val stream = new java.io.ByteArrayOutputStream()
    Console.withOut(stream) {
      FSTree.main(Array.empty)
    }
    stream.toString.trim shouldBe Usage.help
  }
}
