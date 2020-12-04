import org.scalatest._
import flatspec._
import matchers._

class ExampleSpec extends AnyFlatSpec with should.Matchers {

  "This Spec" should "be able to use both java and scala classes" in {
    val p = new Person(1, "desc")
    val user = p.toUser
  }
}