package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverDemo3 {
    public static void main (String args[]){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("pluralsight");
        searchField.sendKeys(Keys.ENTER);

        WebElement imageLink = driver.findElements(By.linkText("이미지")).get(0);
        imageLink.click();
    }
}
