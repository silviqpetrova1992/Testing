package task2;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/14/15.
 */
public class PrintElementsOfArrayTest {
  @Test
  public void happyPath() {
     assertThat(new Array(new  int[]{1,2,3}).print(),is(new int[]{1,2,3}));
  }
  @Test
  public void emptyArray() {
    assertThat(new Array(new  int[]{}).print(),is(new int[]{}));
  }
}
