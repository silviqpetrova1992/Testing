package task3;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/15/15.
 */
public class SellProductTest {
  @Test
  public void happyPath() {
    Store store=new Store();
    store.addNewProduct("zele",0.7,0.3,5,30);
    assertThat(store.sell("zele",5).getQuantity(),is(0));
  }
  @Test
  public void notEnoughMaxQauntity() {
    Store store=new Store();
    store.addNewProduct("zele", 1.0, 1.2, 5, 30);
    assertNull(store.sell("zele", 30));
  }
  @Test(expected = NullPointerException.class)
  public void notExistingProduct() {
    Store store=new Store();
    store.sell("zele", 5);
  }
}
