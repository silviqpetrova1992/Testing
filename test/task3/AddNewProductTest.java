package task3;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/14/15.
 */
public class AddNewProductTest {
  @Test
  public void happyPath() {
     Store store=new Store();
    assertThat(store.addNewProduct("zele", 1.0, 1.20, 5, 30).getName(), is("zele"));

  }
  @Test(expected = IllegalArgumentException.class)
  public void alreadyExistingProduct() {
     Store store=new Store();
    store.addNewProduct("zele",1.0, 1.20, 5, 30);
    store.addNewProduct("zele",0.8 ,1.20, 5, 30);
  }
  @Test(expected = IllegalArgumentException.class)
  public void wrongQuantity() {
    Store store=new Store();
    //The quantity is bigger that the maxQuantity.
    store.addNewProduct("zele", 1.0, 1.20, 35, 30);
  }
  @Test(expected = IllegalArgumentException.class)
  public void negativeQuantity() {
    Store store=new Store();
    store.addNewProduct("zele", 1.0, 1.20, -5, 30);
  }
  @Test(expected = IllegalArgumentException.class)
  public void negativeMaxQuantity() {
    Store store=new Store();
    store.addNewProduct("zele", 1.0, 1.20, 5, -30);
  }
  @Test(expected = IllegalArgumentException.class)
  public void negativePrice() {
    Store store=new Store();
    store.addNewProduct("zele", 1.0, -1.20, 5, 30);
  }
}
