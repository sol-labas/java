
package attendancechecker;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author angela
 */
public class Room {
    private int numberRoom;
    private ArrayList<RoomDate> dates;

    public Room(int numberRoom) {
        this.numberRoom = numberRoom;
        this.dates = new ArrayList<RoomDate>();
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(int numberRoom) {
        this.numberRoom = numberRoom;
    }
    
    public RoomDate addDate () {
        RoomDate rd = new RoomDate();
        dates.add(rd);
        return rd;
    }
    
    public ArrayList<RoomDate> getDate () {
        return dates;
    }
    /**
     * Get student attendance summary
     * @return Key is student id, value is number of dates attended
     */
    public HashMap<Integer, Integer> getSummary(){
        HashMap<Integer, Integer> attendance = new HashMap<Integer, Integer>();
        for ( RoomDate date : dates) {
            for (Student student : date.getStudents()) {
                // if student has not been added put first attandance
                if (!attendance.containsKey(student.getNumberID())) {
                    attendance.put(student.getNumberID(), 1);
                } else {
                    // if student has attandance - increase it
                    Integer current = attendance.get(student.getNumberID());
                    attendance.put(student.getNumberID(), current+1);
                }
            }
        }   
        return attendance;
    }
}
