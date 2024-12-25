package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class SwitchDiffBrowserTest {

    @Test
    public void checkTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.google.com/");
        WebElement element = driver.findElement(By.xpath("(//center/input[@class='gNO89b' and @value='Google Search'])[2]"));
        String text = element.getText();
        System.out.println(text);

        if (driver != null) {
            driver = new FirefoxDriver();
        }
    }
}
