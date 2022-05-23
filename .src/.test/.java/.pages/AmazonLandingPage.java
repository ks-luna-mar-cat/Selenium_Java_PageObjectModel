package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonLandingPage {
    private static WebElement element = null;

    public static WebElement textbox_search(WebDriver driver){
        element = driver.findElement(By.name("field-keywords"));
        return element;
    }

    public static WebElement button_search(WebDriver driver){
        element = driver.findElement(By.id("nav-search-submit-button"));
        return element;
    }
}

