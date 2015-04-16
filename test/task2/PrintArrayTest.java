package task2;

import org.junit.Test;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/15/15.
 */
public class PrintArrayTest {

  @Test
  public void happyPath() {
    final StringBuilder buffer = new StringBuilder();
    Array array = new Array(new int[]{11, 3, 6, 8, 9});

    array.print(new Display() {
      @Override
      public void print(String value) {
        buffer.append(value + "\n");
      }
    });
    assertThat(buffer.toString(), is("ar[0]=11\nar[1]=3\nar[2]=6\nar[3]=8\nar[4]=9\n"));


  }


  @Test
  public void testtt() {
    System.out.println("TEST TEST");
  }

/*  @Test
  public void emptyArray() {
    assertThat(new Array(new int[]{}).getSum(), is(0));
  }*/
}
