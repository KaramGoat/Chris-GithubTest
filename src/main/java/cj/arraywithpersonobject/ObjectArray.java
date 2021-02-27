/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cj.arraywithpersonobject;

/**
 *
 * @author Christopher
 */
public class ObjectArray {
    
    public static void main(String[] args) {
        Student[] students = new Student[4];
        
        students[0]= new Student(576410, "Christopher");
        students[1]= new Student(576411, "Gustaf");
        students[2]= new Student(576405, "Maxwell");
        students[3]= new Student(576370, "Troy");
        
        System.out.println("Student num\tStudent Name");
        for (Student student : students) {
            System.out.println(student.GetStudentNum()+"\t\t"+student.studentName);
        }
        
    }
}
