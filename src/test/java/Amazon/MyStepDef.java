package Amazon;

import Utilities.Utils;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Bhaygashri on 22/06/2015.
 */
public class MyStepDef {
    WebDriver driver;

@Before
    public  void setup(){

        driver= new FirefoxDriver();
        driver.get("http://www.amazon.co.uk/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();


    }

    @After
    public  void tearDown() {
        driver.quit();


    }


    @Given("^I am on home page$")
    public void i_am_on_home_page(){

        Assert.assertTrue(Utils.isLinkPresent("Today's Deals"));
        Assert.assertTrue(Utils.isTextPresent("Prime Instant Video"));


    }

    @Given("^User is on Homepage$")
    public void user_is_on_Homepage() {



    }

    @Then("^I see 'Shop by Department' link on left corner of page$")
    public void i_see_Shop_by_Department_link_on_left_corner_of_page()  {
        Assert.assertTrue(driver.findElement(By.partialLinkText("Department")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.partialLinkText("Department")).isEnabled());

    }

    @Then("^if I select that  link navigates to other page\\.$")
    public void if_I_select_that_link_navigates_to_other_page()  {
         driver.findElement(By.partialLinkText("Department")).click();
        Assert.assertTrue(Utils.isLinkPresent("Amazon.co.uk"));
        Assert.assertTrue(Utils.isLinkPresent("Warehouse Deals"));

    }




    @When("^user selects \"(.*?)\"$")
    public void user_selects(String sortby)  {
        driver.findElement(By.id("nav-link-shopall")).isDisplayed();
        driver.findElement(By.id("nav-link-shopall")).click();
        WebDriverWait wait = new WebDriverWait(driver,120);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-link-shopall")));

    }

    @Then("^he should see 'Amazon Instant Video' header$")
    public void he_should_see_Amazon_Instant_Video_header()  {

        Assert.assertTrue(Utils.isLinkPresent("Warehouse Deals"));

    }

    @Then("^he should see different links below$")
    public void he_should_see_different_links_below(DataTable arg1)  {

        List<String>  catlist = Arrays.asList("Amazon Instant Video","Prime Instant Video","Shop Instant Video", "Your Watchhlist","Your Video Libary","Watch Anywhere");

for (int i=0;i>=catlist.size();i++){
    driver.findElement(By.id(catlist.get(i))).isDisplayed();
    driver.findElement(By.id(catlist.get(i))).isEnabled();// sriram used linktext
}

    }





}
