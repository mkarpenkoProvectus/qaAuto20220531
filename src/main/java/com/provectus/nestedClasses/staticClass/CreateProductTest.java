package com.provectus.nestedClasses.staticClass;

import com.provectus.staticFinal.ProductStatus;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class CreateProductTest {
  public void testProductCreation() {
    //prod1
    Product p1 = new Product();
    p1.name = "prod1";
    createProduct(p1);

    //prod2
    createProduct(null);
    //prod3
    createProduct(null);
  }

  private void createProduct(Product product) {
    System.out.println(product.name);
  }

  public static class Product {
    private String name, id, desc;
    double price;
  }
}
