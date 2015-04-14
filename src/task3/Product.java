package task3;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/14/15.
 */
public class Product {
  private String name;
  private double price;
  private int quantity;
  private int maxQuantity;

  public Product(String name, double price, int quantity, int maxQuantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    this.maxQuantity = maxQuantity;
  }

  public String getName() {
    return name;
  }
}
