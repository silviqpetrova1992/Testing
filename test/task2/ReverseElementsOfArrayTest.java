package task2;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/14/15.
 */
public class ReverseElementsOfArrayTest {
  @Test
  public void happyPath() {
    Array array=new Array(new int[]{1,2,3,5,4,6});
    array.reverse();
     assertThat(array.print(),is(new int[]{6,4,5,3,2,1}));
  }
  @Test
  public void emptyArray() {
    Array array=new Array(new int[]{});
    array.reverse();
    assertThat(array.print(),is(new int[]{}));

  }
}
