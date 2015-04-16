package task1;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/15/15.
 */
public class SumatorTest {
  private Sumator sumator;

  @Before
  public void initialize() {
    sumator = new Sumator();
  }

  @Test
  public void happyPath() {
    assertThat(sumator.sum("4", "5"), is("9"));
  }

  @Test(expected = NumberFormatException.class)
  public void illigalData() {
    sumator.sum("4sgsdg", "5");
  }

  @Test(expected = IllegalArgumentException.class)
  public void nullArgument() {
    sumator.sum(null, "5");
  }
}
