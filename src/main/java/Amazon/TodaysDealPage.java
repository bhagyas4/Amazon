package Amazon;

import org.openqa.selenium.By;

/**
 * Created by Bhaygashri on 24/06/2015.
 */
public class TodaysDealPage extends AbstractPage {




    public void dealOfDay(String text){
        driver.findElement(By.xpath("//img[@title='Add to shopping basket']")).click();
        driver.findElement(By.id("hlb-ptc-btn-native")).click();
        driver.findElement(By.id("ap_email")).sendKeys(text);
        driver.findElement(By.id("ap_signin_create_radio")).click();
        driver.findElement(By.id("signInSubmit-input")).click();



    }
}
