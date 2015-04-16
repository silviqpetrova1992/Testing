package task2;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/15/15.
 */
public class GetMinElementOfArrayTest {
  @Test
  public void happyPath() {
    assertThat(new Array(new int[]{11, 3, 6, 8, 9}).getMinElement(), is(3));
    assertThat(new Array(new int[]{11, 3, -6, 8, 9}).getMinElement(), is(-6));
    assertThat(new Array(new int[]{1, 3, 6, 8, 9}).getMinElement(), is(1));
  }


  @Test
  public void emptyArray() {
    assertThat(new Array(new int[]{}).getMinElement(), is(0));
  }
}
