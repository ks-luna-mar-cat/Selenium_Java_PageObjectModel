package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AmazonLandingPage;

public class AmazonSearchTest1 {
    public static void main (String args[]) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.com");
        //WebElement searchField = driver.findElement(By.name("field-keywords"));


        //searchField.sendKeys("paw patrol");
        AmazonLandingPage.textbox_search(driver).sendKeys("paw patrol");
        //searchField.sendKeys(Keys.ENTER);
        AmazonLandingPage.button_search(driver).click();

        //WebElement imageLink = driver.findElements(By.linkText("이미지")).get(0);
        //imageLink.click();
    }
}



