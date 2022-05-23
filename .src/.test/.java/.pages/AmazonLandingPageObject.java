package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AmazonLandingPageObject {

    WebDriver driver = null;
    //Constructor
    public AmazonLandingPageObject(WebDriver driver){
        this.driver = driver;
    }
    By textbox_search = By.id("twotabsearchtextbox");

    By button_search = By.id("nav-search-submit-button");

    public void setTextInSearchBox(String text){
        driver.findElement(textbox_search).sendKeys(text);
    }

    public void clickSearchButton(){
        driver.findElement(button_search).sendKeys(Keys.RETURN);
    }
}
