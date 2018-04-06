
package task2;

/**
 *
 * @author angela
 */
public class BasicCalculator extends PercentCalc implements BasicOperations, TrigoCalc  {

    @Override
    public double addition(double x, double y) {
        double sum = x + y;
        return sum;
    }

    @Override
    public double subtruction(double x, double y) {
        double difference = x - y;
        return difference;
    }

    @Override
    public double multiplication(double x, double y) {
        double product = x * y;
        return product;
    }

    @Override
    public double division(double x, double y) {
        double quotient = x/y;
        return quotient;
    }
   
    public void display (){
        System.out.println("Basic calculator");
        System.out.println("[A] - Addition");
        System.out.println("[S] - Subtraction");
        System.out.println("[M] - Multiplication");
        System.out.println("[D] - Division");
        System.out.println("[P] - Percentage");
        System.out.println("[T] - Trigonomentic function ");
        System.out.println("[x] - to Exit");

    }

    @Override
    public double sine(double degree) {
       double sin = Math.sin(Math.toRadians(degree)); 
       return sin;
    }

    @Override
    public double cosine(double degree) {
        double cos = Math.cos(Math.toRadians(degree)); 
        return cos;
    }

    @Override
    public double tangent(double degree) {
        double tan = Math.tan(Math.toRadians(degree)); 
        return tan;
    }
}
