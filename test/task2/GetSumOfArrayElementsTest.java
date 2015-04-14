package task2;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/14/15.
 */
public class GetSumOfArrayElementsTest {
  @Test
  public void happyPath() {
     assertThat(new Array(new int[]{1,3,6,10}).getSum(),is(20));
    assertThat(new Array(new int[]{-1,-3,-6,-10}).getSum(),is(-20));
  }
  @Test
  public void emptyArray() {
    assertThat(new Array(new int[]{}).getSum(),is(0));
  }
}
