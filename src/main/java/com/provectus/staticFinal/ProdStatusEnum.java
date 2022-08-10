package com.provectus.staticFinal;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public enum ProdStatusEnum {
  NEW("New"),
  ACTIVE("Active"),
  OUT_OF_SALE("Out of Sale"),
  DISCOUNT("Discount");

  private String value;
  ProdStatusEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
