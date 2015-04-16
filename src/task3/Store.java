package task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
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
    if(sellingMap.get(name).getName()==name&&
            (receivingMap.get(name).getQuantity()+plusQuantity<=receivingMap.get(name).getMaxQauntity())){
    receivingMap.put(name,new ProductDetails(receivingMap.get(name).getPrice(),
            receivingMap.get(name).getQuantity()+plusQuantity,
            receivingMap.get(name).getMaxQauntity()));
    return receivingMap.get(name);
    }
    return null;
  }

  public ProductDetails sell(String name, int sellingQuantity) {
    if(sellingMap.get(name).getName()==name&&
            (receivingMap.get(name).getQuantity()-sellingQuantity>=0)){
      receivingMap.put(name,new ProductDetails(receivingMap.get(name).getPrice(),
              receivingMap.get(name).getQuantity()-sellingQuantity,
              receivingMap.get(name).getMaxQauntity()));
      return receivingMap.get(name);
    }
    return null;

  }

  public List<Product> sort() {
    List<Product> list=new ArrayList<Product>(sellingMap.values());
    Collections.sort(list,new Comparator<Product>() {
      @Override
      public int compare(Product o1, Product o2) {
        if(o1.getPrice()>o2.getPrice()){
          return 1;
        }
        if(o1.getPrice()<o2.getPrice()){
          return -1;
        }
        return 0;
      }
    });
    return list;
  }
}
