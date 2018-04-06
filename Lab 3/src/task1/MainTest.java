
package task1;

/**
 *
 * @author angela
 */
public class MainTest {
       public static void main(String[] args) {
           Animal obj1 = new Animal();
           Bird obj2 = new Bird();
           Animal obj3 = new Bird();
           
           obj1.displayInfo();
           obj2.sleep();
           obj3.displayInfo();
    }
}
