import org.junit.Test;

public class TestUser {

    @Test
    public void test() {
        Person p = new Person(1, "desc");
        User user = p.toUser();
    }
}
