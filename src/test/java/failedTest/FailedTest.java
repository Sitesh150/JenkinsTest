package failedTest;

import org.testng.TestNG;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class FailedTest {

    @Test(priority = Integer.MAX_VALUE)
    public void failedTest(){
        TestNG testNG = new TestNG();
        List<String> list = new ArrayList<>();
        list.add("/testng-failed.xml");
        testNG.setTestSuites(list);
        testNG.run();
    }
}
