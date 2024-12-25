package test;

import org.testng.annotations.Test;

public class MaxPriorityTest {

    @Test(priority = Integer.MAX_VALUE)
    public void checkRun(){
        System.out.println(Integer.MAX_VALUE);
        System.out.println("From Max");
    }

    @Test(priority = Integer.MAX_VALUE)
    public void aaaaa(){
        System.out.println(Integer.MIN_VALUE);
        System.out.println("From Max second");
    }
}
