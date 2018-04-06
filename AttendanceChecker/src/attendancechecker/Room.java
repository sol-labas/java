
package attendancechecker;

import java.util.ArrayList;

/**
 *
 * @author angela
 */
public class Room {
    private int numberRoom;
    private ArrayList<Student> students;

    public Room(int numberRoom) {
        this.numberRoom = numberRoom;
        this.students = new ArrayList<Student>();
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(int numberRoom) {
        this.numberRoom = numberRoom;
    }
    
    public void addStudent (Student student) {
        students.add(student);
    }
    
    public ArrayList<Student> getStudents () {
        return students;
    }
}
