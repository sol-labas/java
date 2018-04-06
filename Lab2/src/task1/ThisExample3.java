
package task1;

/**
 *
 * @author Angela.Kuznetsova
 */
public class ThisExample3 {
    public static void main(String[] args) {
        ThisExample3 obj1 = new ThisExample3();
        obj1.method2();
    }
    
    public void method1(){
        System.out.println("this is the method1");
        
    }
    
    public void method2(){
        System.out.println("this is the method2");
        this.method1();
    }
}
