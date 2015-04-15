package task3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/15/15.
 */
public class SortProductTest {
  @Test
  public void happyPath() {
     Store store=new Store();
    store.addNewProduct("zele",0.7,0.3,5,30);
    store.addNewProduct("shokolad",1.7,1.3,15,30);
    store.addNewProduct("hlqb",0.9,0.4,25,30);
    List<Product> list=store.sort();
    StringBuilder s=new StringBuilder();
    for(Product p:list){
      s.append(p.getPrice()).append(" ");
    }
    assertThat(s.toString(),is("0.7 0.9 1.7 "));
  }
  @Test
  public void emptyStore() {
    Store store=new Store();
    List<Product> list=store.sort();
    StringBuilder s=new StringBuilder();
    for(Product p:list){
      s.append(p.getPrice()).append(" ");
    }
    assertThat(s.toString(),is(""));
  }
}
