package test.homepageTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;

public class homepageTest extends BaseTest {

    @Test
    public void testLogoIsDisplayed(){
        Assert.assertTrue(homePage.checkLogo(),"Logo is not displayed");
        homePage.clickSignInButton();
        homePage.clickBack();
        homePage.clickSkipSignInButton();
        homePage.clickBack();
        homePage.checkEmailField("Adresa@email.com");

    }

}
