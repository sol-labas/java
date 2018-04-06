
package conditions;

import java.util.ArrayList;

/**
 *
 * @author angela
 */
public class Forloop {
    public static void main(String[] args) {
        int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        for (int temp : numArray)
            System.out.println(temp);
        
        
        ArrayList numbArray = new ArrayList();
        for (int i = 0; i < 10; i++) {
            numbArray.add(i+1);
        }
        System.out.println(numbArray);
        
        for (Object temp : numbArray) {
            System.out.println(temp);
        }
        
    }
}
