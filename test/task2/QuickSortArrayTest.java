package task2;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/14/15.
 */
public class QuickSortArrayTest {
  @Test
  public void happyPath() {
   Array array=new Array(new int[]{3,5,9,2,1,7,0});
    array.quickSort();
    assertThat(array.print(),is(new int[]{0,1,2,3,5,7,9}));
  }
  @Test
  public void emptyArray() {
    Array array=new Array(new int[]{});
    array.quickSort();
    assertThat(array.print(),is(new int[]{}));
  }
}
