package task3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/14/15.
 */
public class Store {
   private Map<String,Product> map;
  public Store(){
    map=new HashMap<String, Product>();
  }

  public Product add(String name, double price, int quantity, int maxQuantity){
    if(quantity<0||maxQuantity<0||price<0){
      throw new IllegalArgumentException("Illigal negative data!");
    } if(quantity>maxQuantity){
    throw new IllegalArgumentException("The quantity is bigger that the maxQuantity");
  }

   if(map.containsKey(name)){
     throw new IllegalArgumentException("The product exist!");
   }
    map.put(name,new Product(name,price,quantity,maxQuantity));
    return map.get(name);
  }
}
