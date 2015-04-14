package task1;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 3/21/15.
 */
public class Sumator {
  /**
   * Calculate the sum of two numbers: a and b
   *
   * @param a The first number
   * @param b The second number
   * @return sum This is the sum of a and b
   */
  public String sum(String a, String b)throws NumberFormatException {
    String sum;
    if(a==null||b==null){
      throw new IllegalArgumentException("Illigal agrument:null!");
    }
    if(a.matches("^(-)?[1-9]{1}[0-9]*(\\.\\d+)?")&&b.matches("^(-)?[1-9]{1}[0-9]*(\\.\\d+)?")){
      return String.valueOf(new DecimalFormat("#.##").format(Double.parseDouble(a) + Double.parseDouble(b)));
    }
    else{
      throw new NumberFormatException("You didn't enter numbers!");
    }
  }

}
