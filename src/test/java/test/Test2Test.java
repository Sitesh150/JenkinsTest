package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2Test {
    @Test
    public void test21Test(){
        Assert.assertEquals("abc", "ab");
    }

    @Test
    public void test22Test(){
        Assert.assertEquals("ed", "ef");
    }

    @Test
    public void test23Test(){
        Assert.assertEquals("new", "new");
    }
}
