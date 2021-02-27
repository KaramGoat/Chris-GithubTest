/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cj.arraywithpersonobject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Christopher
 */
public class ObjectArray {
    
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        
        students.add(new Student(576410, "Christopher"));
        students.add(new Student(576411, "Gustaf"));
        students.add(new Student(576405, "Maxwell"));
        students.add(new Student(576370, "Troy"));
        
        System.out.println("Student num\tStudent Name");
        for (Student student : students) {
            System.out.println(student.GetStudentNum()+"\t\t"+student.studentName);
        }
        
    }
}
