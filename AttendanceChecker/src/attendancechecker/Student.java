package attendancechecker;

/**
 *
 * @author angela
 */
public class Student {

    private int numberID;
    private String firstName;
    private String lastName;
    
    /**
     * Get student number
     * @return 
     */
    public int getNumberID() {
        return numberID;
    }

    public void setNumberID(int numberID) {
        this.numberID = numberID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Student(int numberID, String firstName, String lastName) {
        this.numberID = numberID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
