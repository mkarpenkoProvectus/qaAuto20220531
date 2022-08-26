package com.provectus.selenidetests;

import com.codeborne.selenide.Configuration;
import com.provectus.pages.selenidePages.SelenideLoginPage;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.*;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class SelenideTest {
  @Test
  public void selenideTest() throws FileNotFoundException {
//    Configuration.browser = "firefox";
//    Configuration.baseUrl = "mysite.com";
//    Configuration.savePageSource = false;
//
//    open("https://the-internet.herokuapp.com/");
//
//    SelenideElement element = $("#username");
//    $x("//div");
//    $(By.xpath("link")).$(By.cssSelector("")).$(By.tagName("asd"));
//
//    $$("");
//    $$x("");
//    ElementsCollection collection = $$(By.linkText(""));
//    element.shouldBe(Condition.visible)
//        .shouldBe(Condition.interactable)
//        .shouldHave(Condition.attribute("color"))
//        .click();
//
//    actions().click();
//    executeJavaScript("");
//
//    element.download();
//    element.uploadFile();
//    element.click();



    Configuration.baseUrl = "https://the-internet.herokuapp.com";
    Configuration.savePageSource = false;

    open("/login");
    SelenideLoginPage selenideLoginPage = new SelenideLoginPage();
    selenideLoginPage.setUsername("tomsmith")
        .setPassword("SuperSecretPassword!")
        .clickLogin();
  }
}
