package com.provectus.webdrivertests;

import com.provectus.pages.components.ProductComponent;
import com.provectus.pages.rozPages.RozCatalogPage;
import com.provectus.pages.rozPages.RozMainPage;
import com.provectus.pages.rozPages.RozProductDetailPage;
import org.testng.annotations.Test;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class RozTest extends BaseTest {
  @Test
  public void rozTest() {
    RozMainPage mainPage = new RozMainPage();

    mainPage.header.searchProduct("some product");

    RozProductDetailPage productDetailPage = new RozProductDetailPage();

    productDetailPage.addToCard();
    productDetailPage.header.goToMainPage();

    RozCatalogPage catalogPage = new RozCatalogPage();

    catalogPage.getProductName(1);
    catalogPage.getProductPrice(1);

    catalogPage.getProductName(2);
    catalogPage.getProductPrice(2);

    catalogPage.getProductName(3);
    catalogPage.getProductPrice(3);

    ProductComponent component = catalogPage.findProduct(5);
    component.getProductPrice();
    component.getProductName();
  }
}
