package Amazon;

import Utilities.Utils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Bhaygashri on 22/06/2015.
 */
public class SmokeTestSuite extends BasePage {


    Resistration resistration= new Resistration();
    HomePage homePage=new HomePage();
    TodaysDealPage dealPage= new TodaysDealPage();




    @Test
    public void longin(){

    }

    String Name="sadguru";
    String Email= "3456sadguru6543@gmail.com";
    String RepeatEmail="3456sadguru6543@gmail.com";
    String Password= "abc123";
    String RepeatPassword="abc123";



    @Test
    public void verifyUserCanResister(){
       // Assert.assertEquals("Checking on Home page","Today's deals", driver.findElement(By.linkText("Today's deals")).getText());
        homePage.goTOresistration();
        resistration.resistration(Name,Email,RepeatEmail,Password,RepeatPassword);


    }

    @Test
    public void verifyTodaysDeal(){
       // Assert.assertTrue(Utils.isTextPresent("Today's Deals"));
        homePage.goToTodaysDeal();
        dealPage.dealOfDay(email);
        resistration.resistration(Name,Email,RepeatEmail,Password,RepeatPassword);


    }
    String email = " 3456sadguru6543@gmail.com";
    String textFromList="Books";
    String textToSearch="The Magic";



    @Test
    public void verifyUserCanSignIn(){
        homePage.signin(email,Password);
        Assert.assertTrue(Utils.isTextPresent("Your Amazon.co.uk"));
        homePage.searchOption(textFromList,textToSearch);




    }


}
