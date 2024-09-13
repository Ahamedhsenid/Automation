package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        WebElement search = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        search.isDisplayed();
        search.isEnabled();
        search.sendKeys("hsenid");
        search.submit();

     // driver.quit();
    }
}

