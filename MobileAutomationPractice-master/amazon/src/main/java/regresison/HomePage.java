package regresison;

import base.MobileAPI2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends MobileAPI2 {
    @FindBy(id = "com.macys.android:id/textView8")
    WebElement welcomePage;
    @FindBy(id = "com.macys.android:id/largeLabel")
    WebElement Home;
    @FindBy(id="com.macys.android:id/btnSecond")
    WebElement Letsgo;

    public void setHomePage() {
        Home.click();

    }
    public void setWelcomePage(){
       if (welcomePage.isDisplayed())
           welcomePage.click();
        Assert.assertTrue(true);

    }
    public void LetsgoClick(){
        if (Letsgo.isEnabled()){
            Letsgo.click();
            Assert.assertTrue(true);
        }
        try {
            sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
