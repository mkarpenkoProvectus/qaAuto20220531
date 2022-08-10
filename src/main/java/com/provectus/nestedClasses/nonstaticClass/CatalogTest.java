package com.provectus.nestedClasses.nonstaticClass;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class CatalogTest {
  public void catalogTest() {
    CatalogPage catalogPage = new CatalogPage();
    catalogPage.setFilters("by name");

    CatalogPage.ProductTable table = catalogPage.new ProductTable();
    System.out.println(table.name);

    catalogPage.setFilters("by desc");
    table = catalogPage.new ProductTable();
    System.out.println(table.desc);
  }
}
