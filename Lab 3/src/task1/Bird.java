
package task1;

/**
 *
 * @author angela
 */
public class Bird extends Animal implements Action {

    @Override
    public void sleep() { 
        System.out.println("I am a bird.");
    }
    @Override
    public void displayInfo(){
        System.out.println("This is a display from bird class.");
    
    }
  
}
