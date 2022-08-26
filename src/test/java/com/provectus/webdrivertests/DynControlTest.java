package com.provectus.webdrivertests;

import com.provectus.pages.DynamicControlsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class DynControlTest extends BaseTest {
  @Test
  public void dynTest() {
    DynamicControlsPage dynamicControlsPage = openApp().goToDynControls();

    Assert.assertTrue(dynamicControlsPage.isCheckboxDisplayed());

    dynamicControlsPage.removeCheckbox();

    Assert.assertFalse(dynamicControlsPage.isCheckboxDisplayed());
  }
}
