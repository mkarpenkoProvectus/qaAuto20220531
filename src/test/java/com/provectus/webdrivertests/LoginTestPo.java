package com.provectus.webdrivertests;


import com.provectus.pages.MainPage;
import com.provectus.pages.SecurePage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class LoginTestPo extends BaseTest {
  @Test
  public void loginTest() {


    SecurePage securePage = openApp().goToAuthPage()
        .setUsername("tomsmith")
        .setPassword("SuperSecretPassword!")
        .clickLoginButton();
    String alert = securePage.getAlertText();

    Assert.assertTrue(alert.contains("You logged into a secure area!"),
                      "User should be logged in");

    Assert.assertEquals(alert, "You logged into a secure area!",
                        "");
    securePage.logout();


//    LoginPage loginPage = new LoginPage(driver);
//    loginPage.setUsername("tomsmith");
//    loginPage.setPassword("SuperSecretPassword!");
//    loginPage.clickLoginButton();
//
//
//    SecurePage securePage = new SecurePage(driver);
//    String alert = securePage.getAlertText();
//
//    Assert.assertTrue(alert.contains("You logged into a secure area!"),
//                      "User should be logged in");
//
//    securePage.logout();

  }
}
