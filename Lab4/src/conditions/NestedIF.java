/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditions;

/**
 *
 * @author angela
 */
public class NestedIF {
    public static void main(String[] args) {
        int grade = 76;
        
        if (grade >=50){
            if (grade >=90){
                System.out.println(grade + " = A+");
            }
            else {
                System.out.println("You pass. ");
            }
        } else {
            System.out.println("Sorry, see you next year.");
        }
    }
}
