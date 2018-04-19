/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancechecker;

import java.util.ArrayList;

/**
 * This class stores all students that attended particular date
 */
public class RoomDate {

    private ArrayList<Student> students;

    public RoomDate() {
        this.students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
