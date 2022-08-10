package com.provectus.collections;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Product implements Comparable<Product> {
  private String name;
  private int qty;
  private double price;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getQty() {
    return qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override public int compareTo(Product o) {
    if(this.name.compareTo(o.name) >0) return 1;
    if (this.name.compareTo(o.name) <0) return -1;
    if (this.name.compareTo(o.name) == 0) {
      return this.price > o.price ? 1 : -1;
    }
    return 0;
  }
}
