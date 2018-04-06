
package task1;

/**
 *
 * @author Angela.Kuznetsova
 */
public class ThisKeyWorldExample {
    int var = 25;
    
    public static void main(String [] args){
        ThisKeyWorldExample obj = new ThisKeyWorldExample();
        obj.method1();
        obj.method2(20);
    }
    
    void method1() {
        int var = 10;
        System.out.println("Instance"+this.var);
        System.out.println("Local"+var);
    }
    void method2(int var){
        var = 13;
        System.out.println("Instance"+this.var);
        System.out.println("Local"+var);
    }

}
