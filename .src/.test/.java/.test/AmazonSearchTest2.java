package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AmazonLandingPage;
import pages.AmazonLandingPageObject;

public class AmazonSearchTest2 {

    private static WebDriver driver = null;

    public static void main(String[] args){
        AmazonSearchTest2();
    }

    public static void AmazonSearchTest2(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.com");

        //AmazonLandingPage.textbox_search(driver).sendKeys("paw patrol");

        //AmazonLandingPage.button_search(driver).click();

        AmazonLandingPageObject searchPageObj = new AmazonLandingPageObject(driver);

        driver.get("https://amazon.com");

        searchPageObj.setTextInSearchBox("Cat toy");

        searchPageObj.clickSearchButton();

        driver.close();
    }


}



