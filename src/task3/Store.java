package task3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/14/15.
 */
public class Store {
   private Map<String,Product> sellingMap;
  private Map<String,ProductDetails> receivingMap;
  public Store(){
    sellingMap =new HashMap<String, Product>();
    receivingMap =new HashMap<String, ProductDetails>();
  }

  public Product addNewProduct(String name, double sellingPrice, double receivingPrice, int quantity, int maxQuantity){
    if(quantity<0||maxQuantity<0||receivingPrice<0||sellingPrice<0){
      throw new IllegalArgumentException("Illigal negative data!");
    } if(quantity>maxQuantity){
    throw new IllegalArgumentException("The quantity is bigger that the maxQuantity");
  }

   if(sellingMap.containsKey(name)){
     throw new IllegalArgumentException("The product exist!");
   }
    sellingMap.put(name, new Product(name, sellingPrice));
    receivingMap.put(name, new ProductDetails(receivingPrice,quantity,maxQuantity));
    return sellingMap.get(name);
  }

  public ProductDetails add(String name, int plusQuantity) {
    if(sellingMap.get(name).getName()==name){
    receivingMap.put(name,new ProductDetails(receivingMap.get(name).getPrice(),
            receivingMap.get(name).getQuantity()+plusQuantity,
            receivingMap.get(name).getMaxQauntity()));
    return receivingMap.get(name);
    }
    return null;
  }
}
