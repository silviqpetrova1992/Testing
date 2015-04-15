package task3;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/14/15.
 */
public class RenewProductTest {

  @Test
  public void happyPath() {
     Store store=new Store();
    store.addNewProduct("zele", 1.0, 1.2, 5, 30);
    assertThat(store.add("zele", 5).getQuantity(),is(10));
  }
}
