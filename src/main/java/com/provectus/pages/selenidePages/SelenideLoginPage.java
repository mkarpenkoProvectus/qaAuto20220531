package com.provectus.pages.selenidePages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class SelenideLoginPage {
  private final SelenideElement usernameInput = $("#username");
  private final SelenideElement passInput = $("#password");
  private final SelenideElement loginButton = $("button[type='submit']");


  public SelenideLoginPage setUsername(String username) {
    usernameInput.shouldBe(Condition.visible).clear();
    usernameInput.sendKeys(username);

    return this;
  }

  public SelenideLoginPage setPassword(String password) {
    passInput.shouldBe(Condition.visible).clear();
    passInput.sendKeys(password);
    return this;
  }

  public SelenideLoginPage clickLogin() {
    loginButton.shouldBe(Condition.visible)
        .shouldBe(Condition.interactable)
        .click();
    return this;
  }
}
