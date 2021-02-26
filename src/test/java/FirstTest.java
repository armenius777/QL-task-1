import org.junit.jupiter.api.*;
import org.testng.asserts.SoftAssert;

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
        SoftAssert softAssert = new SoftAssert();
        System.out.println("My first autotest running");
        softAssert.assertEquals(1/0, 1);
        softAssert.assertAll();
    }

    @Test
    public void test1() {
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Test №1");
        softAssert.assertEquals(2+2, 4);
        softAssert.assertAll();
    }

    @Test
    public void test2() {
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Test №2");
        softAssert.assertEquals(2+2, 5);
        softAssert.assertAll();
    }

    @Test
    public void test3() {
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Test №3");
        softAssert.assertTrue(2+2==4);
        softAssert.assertAll();
    }

    @Test
    public void test4() {
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Test №4");
        softAssert.assertTrue(2+2==5);
        softAssert.assertAll();
    }

    @Test
    public void test5() {
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Test №5");
        softAssert.assertEquals(2+2, 4);
        softAssert.assertEquals(2+2, 5);
        softAssert.assertTrue(2+2==4);
        softAssert.assertTrue(2+2==5);
        softAssert.assertAll();
    }

}
