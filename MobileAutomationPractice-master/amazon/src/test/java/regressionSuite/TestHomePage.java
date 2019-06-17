package regressionSuite;

import base.MobileAPI2;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regresison.HomePage;

public class TestHomePage extends MobileAPI2 {
    HomePage homePage;

    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(appiumDriver, HomePage.class);
    }
    @Test
    public void WelcomePageTest(){
        homePage.setWelcomePage();

    }
    @Test
    public void HomePageTest() {
        homePage.setHomePage();
    }
    @Test
    public void ClickonLetsgo(){
        homePage.LetsgoClick();
    }


}


