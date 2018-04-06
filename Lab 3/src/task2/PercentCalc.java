
package task2;

/**
 *
 * @author angela
 */
public class PercentCalc {
    private double amount;
    private double percent;

    public PercentCalc() {
    }

    public static double computePercentage(double value, double perc) {
        double part = (value*(perc/100.0f));
        return part;
    }
}
 