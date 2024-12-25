package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGTest {
    @DataProvider(name = "@dataProvider")
    public Object[][] dataProviderData() {

        return new Object[][]{
                {"user1", "password1"},
                {"user2", "password2"},
                {"user3", "password3"}
        };
    }

    @Test(dataProvider = "@dataProvider")
    public void dataProviderUseTest(String username, String password) {
        System.out.println(username + "<---->" + password);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void expectedExceptionsTest() {
        int a = 7 / 0;
        System.out.println(a);
    }
}
