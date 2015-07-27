package Amazon;

import Utilities.Utils;
import org.openqa.selenium.By;

/**
 * Created by Bhaygashri on 22/06/2015.
 */
public class HomePage extends AbstractPage {


    By resistraionlink=By.className("nav-line-2");




    public void goToTodaysDeal(){
        driver.findElement(By.xpath("//div[@id='nav-xshop']/a[2]")).click();

    }
    public void goTOresistration(){

        driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']/span[2]")).click();
        driver.findElement(By.linkText("Start here.")).click();


    }
    By searchField= By.id("twotabsearchtextbox");
    By categoryList=By.id("searchDropdownBox");
    public void searchOption(String textFromList,String textToSearch){
        Utils.selectFromDropdown(categoryList,textFromList);
        Utils.enterText(searchField,textToSearch);
        driver.findElement(By.xpath("//input[@value='Go']")).click();


    }

    By emailField = By.id("ap_email");
    By radioButton=By.id("ap_signin_existing_radio");
    By passwordField= By.id("ap_password");
    By signInButton=By.id("signInSubmit-input");

    public void signin(String email, String password) {
        driver.findElement(By.partialLinkText("Sign in")).click();
        Utils.enterText(emailField, email);
        Utils.click(radioButton);
        Utils.enterText(passwordField, password);
        Utils.click(signInButton);

    }







}
