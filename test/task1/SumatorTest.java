package task1;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/14/15.
 */
public class SumatorTest{
  private static Sumator sumator;
  @BeforeClass public  static void initialize(){
    sumator=new Sumator();
  }
  @Test
  public void happyPath() {
    assertThat(sumator.sum("5", "4"), is("9"));
  }
  @Test(expected = NumberFormatException.class)
  public void illigalData() {
   sumator.sum("erwer","8");
  }
  @Test(expected = IllegalArgumentException.class)
  public void nullArgument() {
    sumator.sum(null,"8");

  }
}
