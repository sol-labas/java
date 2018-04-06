/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancechecker;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author angela
 */
public class AttendanceChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Room room = new Room(103);
        HashMap<Integer, Student> students = seedStudents();
        
        // TODO: Use do ... while() loop
        // TODO: Check-in student by id (use scanner)
        // TODO: Check that studen id exists in students
        // TODO: If exists, get this student by id and add this student to room
        // TODO: If student does not exist - output that student does not exist
        // TODO: If entered 0 - exit from loop
        System.out.println("Students in room:");
        printStudents(room.getStudents());
    }
    
    public static void printStudents(ArrayList<Student> students){
        for (Student s : students) {
            System.out.println(s.getNumberID() + " " + s.getFirstName()+ " " + s.getLastName());
        } 
        
    }
    public static HashMap<Integer, Student> seedStudents() {
        HashMap<Integer, Student> students = new HashMap();
        students.put(3172500, new Student(3172500, "Angela", "Kuznetsova"));
        students.put(3172700, new Student(3172700, "Chris", "Comrad"));
        return students;
    }
}
