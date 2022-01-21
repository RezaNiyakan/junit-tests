import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {
    private String expected;
    private String hiJay;

    @Before
    public void setUp() {
        this.expected = "Hello, World!";
        this.hiJay = "Hello, Jay!";
    }

    @Test
    public void testForHelloWorld() {
        Assert.assertEquals(this.expected, HelloWorld.hello());
    }

    @Test
    public void testForHelloJay() {
        Assert.assertEquals(this.hiJay, HelloWorld.hello("Jay"));
    }

    @Test
    public void testForHelloDavid() {
        Assert.assertEquals("Hello, David!", HelloWorld.hello("David"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForNull() {
        Assert.assertNotEquals("Hello, null", HelloWorld.hello(null));
    }
}
