package task2;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/15/15.
 */
public class GetSumTest {
  @Test
  public void happyPath() {
    assertThat(new Array(new int[]{11, 3, 6, 8, 9}).getSum(), is(37));
  }
  @Test
  public void emptyArray() {
    assertThat(new Array(new int[]{}).getSum(), is(0));
  }
}
