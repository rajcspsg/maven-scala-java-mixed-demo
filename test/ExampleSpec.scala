import org.scalatest._
import flatspec._
import matchers._
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ExampleSpec extends AnyFlatSpec with should.Matchers {

  "This Spec" should "be able to use both java and scala classes" in {
    val p = new Person(1, "desc")
    val user: User = p.toUser
  }
}