
package conditions;

import java.text.DateFormatSymbols;
import java.util.Scanner;

/**
 *
 * @author angela
 */
public class SwitchCondition {
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        SwitchCondition obj = new SwitchCondition();
        
        System.out.println("Enter the month number");
        int num = input.nextInt();
        
        switch(num){
            case 1: System.out.println(num + " is for " + obj.getMonths(num-1));
            default:
                System.out.println("Unvalid number");
        }           
    }
    
    public String getMonths (int num){
        String month = null;
        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] months = dfs.getMonths();
            if(num >=0 && num <=11){
                month = months[num];
            }
        return month;
    }        
}
