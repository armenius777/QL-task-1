import org.junit.jupiter.api.*;

public class FirstTest {

    @BeforeAll
    public static void startClassTests() {
        System.out.printf("%s class started%n", FirstTest.class.getName());
    }

    @AfterAll
    public static void endedClassTests() {
        System.out.printf("All tests in %s finished%n", FirstTest.class.getName());
    }

    @BeforeEach
    public void beforeEachTest() {
        System.out.println("Test start");
    }

    @AfterEach
    public void afterEachTest() {
        System.out.println("Test finished");
    }

    @Test
    public void myTest() {
        System.out.println("My first autotest running");
    }

    @Test
    public void test1() {
        System.out.println("Test №1");
    }

    @Test
    public void test2() {
        System.out.println("Test №2");
    }

    @Test
    public void test3() {
        System.out.println("Test №3");
    }

    @Test
    public void test4() {
        System.out.println("Test №4");
    }

    @Test
    public void test5() {
        System.out.println("Test №5");
    }

}
