package task3;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/15/15.
 */
public class ProductDetails {
  private  double receivingPrice;
  private int quantity;
  private int maxQuantity;

  public ProductDetails(double receivingPrice, int quantity, int maxQuantity) {
    this.receivingPrice = receivingPrice;
    this.quantity = quantity;
    this.maxQuantity = maxQuantity;
  }


  public int getQuantity() {
    return quantity;
  }

  public double getPrice() {
    return receivingPrice;
  }

  public int getMaxQauntity() {
    return maxQuantity;
  }
}

