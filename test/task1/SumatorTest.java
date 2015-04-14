package task1;

import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/14/15.
 */
public class SumatorTest{
  @Test
  public void happyPath() {
     Sumator sumator=new Sumator();
    assertThat(sumator.sum("5", "4"), is("9"));
  }
  @Test(expected = NumberFormatException.class)
  public void illigalData() {
     Sumator sumator=new Sumator();
   sumator.sum("erwer","8");
  }
  @Test(expected = IllegalArgumentException.class)
  public void nullArgument() {
    Sumator sumator=new Sumator();
    sumator.sum(null,"8");

  }
}
