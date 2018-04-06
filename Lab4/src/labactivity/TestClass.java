
package labactivity;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author angela
 */
public class TestClass {
    public static void main(String[] args) throws IOException  {
        Products prod = new Products();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the product quantity: ");
        int num = in.nextInt();
        
        
        for (int i = 0; i < num; i++){
            System.out.println("Product name " + (i+1) + ":");
            String name = in.next();
            
            System.out.println("Product code: ");
            int code = in.nextInt();
            prod.createProduct(code, name);
            
            System.out.println("Product price: $");
            double price = in.nextDouble();
            prod.createPrice(code, price);    
        }
        displayOptions();
        
        
        switch(System.in.read()) {
            case 'v':
            case 'V':
                Set s = prod.prodHM.entrySet();
                Iterator itr = s.iterator();
                while (itr.hasNext()){
                    Map.Entry mapEntry= (Map.Entry) itr.next();
                    System.out.println(mapEntry.getKey() + "| " + mapEntry.getValue());
                } break;
            case 'c':
            case 'C':
                System.out.println("Enter product code: ");
                int code = in.nextInt();
                String name = prod.prodHM.get(code);
                double price = prod.priceHM.get(code);
                System.out.println("Product code: " + code + "|Name" + name + " |Price: " + price);
                break;        
        }
    }
    public static void displayOptions () {
        System.out.println("*********My invetntory system*********");
        System.out.println("[V] - view product");
        System.out.println("[C] - view price");
        System.out.println("What do you like to do?");
    
    }
}
