package labactivity;

import java.util.HashMap;

/**
 *
 * @author angela
 */
public class Products {
    public String productName;
    public double prodPrice;
    public int prodCode;
    
    HashMap<Integer, String> prodHM = new HashMap<Integer, String>();
    HashMap<Integer, Double> priceHM = new HashMap<Integer, Double>();
    
    public void createProduct (int key, String value){
        prodHM.put(key, value);
    }
    
    public void createPrice (int key, double price){
        priceHM.put(key, price);
    }
}
