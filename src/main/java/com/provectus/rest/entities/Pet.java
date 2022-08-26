package com.provectus.rest.entities;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Pet {
  private String id;
  private String name;
  private String status;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "Pet{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", status='" + status + '\''
        + '}';
  }
}
