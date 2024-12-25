package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1Test {

    @Test
    public void test1Test(){
        Assert.assertEquals("abc", "ab");
    }

    @Test
    public void test2Test(){
        Assert.assertEquals("ed", "ef");
    }

    @Test
    public void test3Test(){
        Assert.assertEquals("new", "new");
    }
}
