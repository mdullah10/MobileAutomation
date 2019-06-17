package regressionSuite;

import base.MobileAPI2;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.HomePage;

import java.security.PublicKey;

public class TestHomePage extends MobileAPI2 {
    HomePage homePage;

    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(appiumDriver, HomePage.class);
    }

    @Test
    public void ClickOnSeting() {
        homePage.setSetting();
    }

    @Test
    public void ClickOnHomePage() {
        homePage.setHomePage();
    }

    @Test
    public void clickNews() {
        homePage.clickOnNews();
    }

    @Test
    public void ClickOnVideo() {
        homePage.setVedios();
    }

    @Test
    public void clickOnMore() {
        homePage.setMore();
    }

}