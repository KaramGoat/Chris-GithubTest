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
public class Student 
{
    private int studentNum; //only the student number is encapsulated
    String studentName;
    
    public int GetStudentNum(){
        return studentNum;
    }
    
    public void SetStudentNum(int newStudentNum){
        this.studentNum=newStudentNum;
    }
        
    
    
    Student(int studentNum,String studentName)
    {
        this.studentNum=studentNum;
        this.studentName=studentName;
    } 
    
    //Christopher - Commment 1 Develop
    //Ruhan - Comment 2 Develop

    
}
