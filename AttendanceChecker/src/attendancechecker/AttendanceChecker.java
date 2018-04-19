/*
 * This programm registers students attendance in Room 106 Block B and Room 314 
 * Block C. For each dates when students swipe their card, ID number is added to the date
 * Afterwards, programm calculate attandance and outputs summsry for each student
 */
package attendancechecker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

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
        Scanner input = new Scanner(System.in);
        int idNumber = 0;
        int numDates = 0;
        // Enter four dates 
        for (numDates = 1; numDates <= 4; numDates++) {
            System.out.println("Students check-in for date " + numDates);
            RoomDate date = room.addDate();

            do {
                System.out.println("Enter Student ID (0 for exit): ");
                idNumber = input.nextInt();
                if (students.containsKey(idNumber)) {
                    date.addStudent(students.get(idNumber));
                } else {
                    System.out.println("Student does not exist");
                }
            } while (idNumber != 0);
        }

        HashMap<Integer, Integer> summary;
        summary = room.getSummary();
        System.out.println("Students in room:");
        printStudentsAttendance(students, summary, numDates);
    }
    /** 
     * Output student attendance in percents to total number of classes
     * @param students List of all students
     * @param summary Students attendance
     * @param total Total number of classes
     */
    public static void printStudentsAttendance(
            HashMap<Integer, Student> students,
            HashMap<Integer, Integer> summary,
            int total) {
        // For every student 
        for (Student s : students.values()) {
            System.out.print(s.getNumberID() + " " + s.getFirstName() + " " + s.getLastName() + ": ");
            // If student has attandance, calcuate percentage
            if (summary.containsKey(s.getNumberID())) {
                System.out.println(summary.get(s.getNumberID()) * 100 / total + " % ");
            } else {
                //Student missed all classes
                System.out.println("0 %");
            }
        }
    }

    /** 
     * Get list of all students on the course
     * @return Key is student ID, value is student
     */
    public static HashMap<Integer, Student> seedStudents() {
        HashMap<Integer, Student> students = new HashMap();
        students.put(3172500, new Student(3172500, "Angela", "Kuznetsova"));
        students.put(3172501, new Student(3172501, "Chris", "Hector"));
        students.put(3172502, new Student(3172502, "Anneke", "Lilley"));
        students.put(3172503, new Student(3172503, "Brianna", "Winkels"));
        students.put(3172504, new Student(3172504, "Hyuck", "Yim"));
        students.put(3172505, new Student(3172505, "Jahdei", "Crawford"));
        students.put(3172506, new Student(3172506, "James", "Hendry"));
        students.put(3172507, new Student(3172507, "Jason", "Krieg"));
        students.put(3172508, new Student(3172508, "Jordan", "Ash"));
        students.put(3172509, new Student(3172509, "Joseph", "Holland"));
        students.put(3172510, new Student(3172510, "Kimberley", "Watene"));
        students.put(3172511, new Student(3172511, "Nicole", "Priddey"));
        students.put(3172512, new Student(3172512, "Patrick", "Lambert"));
        return students;
    }
}
