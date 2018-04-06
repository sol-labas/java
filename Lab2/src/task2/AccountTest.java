
package task2;

import static java.lang.Character.toLowerCase;
import java.util.Scanner;

/**
 *
 * @author Angela.Kuznetsova
 */
public class AccountTest {
    public void greet(){
        System.out.println("Welcome to WETEC Banking.\n [W] - for Withdraft\n [C] - for CheckBalance\n [D] - for Deposit\n");
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account acc1 = new Account(5000.00);
        AccountTest test1=new AccountTest();
        test1.greet();
        
        System.out.println("How can I help you today?");
        char userChoice = input.next().charAt(0);
        
        if ((userChoice == 'c') || (userChoice == 'C')){
            System.out.println("$"+acc1.getBalance());
        }
        
        if ((userChoice == 'w') || (userChoice == 'W')){
            System.out.println("Enter withdrawal amount: $");
            double amount = input.nextDouble();
            System.out.println("Balance is: "+acc1.getBalance());
            System.out.println("Substracting "+amount+" from your account.");
            acc1.debit(amount);
            System.out.println("Successful transaction.");
            System.out.println("You new balance is: "+acc1.getBalance());
            
        }
        
        if ((userChoice == 'd') || (userChoice == 'D')){
            System.out.println("Enter amountto deposit: $");
            double amount = input.nextDouble();
            System.out.println("Adding "+amount+" to your account.");
            acc1.credit(amount);
            System.out.println("Successful transaction.");
            System.out.println("You new balance is: "+acc1.getBalance());
            
        }
        
    }
}
