package Utilities;

import Amazon.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Bhaygashri on 24/06/2015.
 */
public class Utils extends AbstractPage {

    public static  void click(By element){

        driver.findElement(element).click();

    }

    public static void enterText(By bhagya,String text) {

        driver.findElement(bhagya).clear();
        driver.findElement(bhagya).sendKeys(text);
    }

    public static boolean  isTextPresent(String text){
        return  driver.findElement(By.tagName("Body")).getText().contains(text);
    }


    public static void selectFromDropdown(By by,String textFromList) {

        Select select= new Select(driver.findElement((by)));
        select.selectByVisibleText(textFromList);


    }

    public static boolean isLinkPresent(String link){
        return driver.findElement(By.linkText(link)).isDisplayed();
    }
    public  static  void waitForPageToLoad(By by, int time){
        WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}
