package test;

import org.testng.annotations.Test;

import java.io.IOException;

public class TestRunnerTest {

    public static void main(String[] args) {
        ParentTest parentTest = new ChildTest();
        ChildTest childTest = (ChildTest) parentTest;
        childTest.runParent();
        childTest.runChild();
    }

    @Test
    public void checkExcept() throws InterruptedException {
        int a = 5/0;
    }
}
