package Amazon;

import Utilities.Utils;
import org.openqa.selenium.By;

/**
 * Created by Bhaygashri on 22/06/2015.
 */
public class Resistration extends AbstractPage {

    By name=By.id("ap_customer_name");
    By email=By.id("ap_email");
    By repeatEmail=By.id("ap_email_check");
    By password=By.id("ap_password");
    By repeatPassword = By.id("ap_password_check");
    By creatAcctButton=By.id("continue-input");





    public void resistration(String Name,String Email,String RepeatEmail,String Password,String RepeatPassword){

        Utils.enterText(name,Name);
        Utils.enterText(email,Email);
        Utils.enterText(repeatEmail,RepeatEmail);
        Utils.enterText(password,Password);
        Utils.enterText(repeatPassword,RepeatPassword);
        Utils.click(creatAcctButton);






    }
}
