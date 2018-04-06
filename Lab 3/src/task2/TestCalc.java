
package task2;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author angela
 */
public class TestCalc {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        BasicCalculator calc = new BasicCalculator();
        char userChoice = 0;
        
        while (userChoice != 'x'){
            calc.display();
            System.out.println("Choose your operation");
            userChoice = input.next().charAt(0);
            
            if ((userChoice == 'a') || (userChoice == 'A')) {
                System.out.println("Enter first number");
                double firstNumber = input.nextDouble();
                System.out.println("Enter second number");
                double secondNumber = input.nextDouble();
                System.out.println("The sun is: "+ calc.addition(firstNumber, secondNumber));
                System.in.read();
            } 
            else if ((userChoice == 's') || (userChoice == 'S')){
                System.out.println("Enter first number");
                double firstNumber = input.nextDouble();
                System.out.println("Enter second number");
                double secondNumber = input.nextDouble();
                System.out.println("The difference is: "+ calc.subtruction(firstNumber, secondNumber));
                System.in.read();
            } 
            else if ((userChoice == 'm') || (userChoice == 'M')){
                System.out.println("Enter first number");
                double firstNumber = input.nextDouble();
                System.out.println("Enter second number");
                double secondNumber = input.nextDouble();
                System.out.println("The product is: "+ calc.multiplication(firstNumber, secondNumber));
                System.in.read();
            } 
            else if ((userChoice == 'd') || (userChoice == 'D')){
                System.out.println("Enter first number");
                double firstNumber = input.nextDouble();
                System.out.println("Enter second number");
                double secondNumber = input.nextDouble();
                System.out.println("The quotient is: "+ calc.division(firstNumber, secondNumber));
                System.in.read();
            } 
            else if ((userChoice == 'p') || (userChoice == 'P')){
                System.out.println("Enter amount");
                double firstNumber = input.nextDouble();
                System.out.println("Enter persentage");
                double secondNumber = input.nextDouble();
                System.out.println(secondNumber + "% of "+ firstNumber + " is "+ calc.computePercentage(firstNumber, secondNumber));
                System.in.read();
            } 
            else if ((userChoice == 't') || (userChoice == 'T')){
                System.out.println("Basic trigonometric functions");
                System.out.println("[S] - Sine");
                System.out.println("[C] - Cosine");
                System.out.println("[T] - Tangent");
                System.out.println("What would you like to compute?");
                char trigChoice = input.next().charAt(0);
                switch (trigChoice) {
                    case 'S':
                    case 's':
                        System.out.println("Enter angle in degree");
                        double firstNumber = input.nextDouble();
                        System.out.println("sin" + firstNumber + " = " + calc.sine(firstNumber));
                        System.in.read();
                        break;
                    case 'C':
                    case 'c':
                        System.out.println("Enter angle in degree");
                        double fNumber = input.nextDouble();
                        System.out.println("cos" + fNumber + " = " + calc.sine(fNumber));
                        System.in.read();
                        break;
                    case 'T': 
                    case 't':
                        System.out.println("Enter angle in degree");
                        double ftNumber = input.nextDouble();
                        System.out.println("tg" + ftNumber + " = " + calc.sine(ftNumber));
                        System.in.read();
                        break;
                    default: 
                        System.out.println("Incorrect letter");
                        System.in.read();
                        break;
                }                     
            } 
            else {
                System.out.println("Incorrect letter, try again.");
                System.in.read();
            }
        }
    }
}
