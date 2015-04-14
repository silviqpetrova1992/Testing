package task2;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/14/15.
 */
public class GetMinElementFromArrayTest {
  @Test
  public void happyPath() {
    assertThat(new Array(new int[]{1,6,3,8}).getMinElement(),is(1));
    assertThat(new Array(new int[]{-1,-6,-3,-8}).getMinElement(),is(-8));
  }
  @Test
  public void emptyArray() {
    assertThat(new Array(new int[]{}).getMinElement(),is(0));
  }

}
