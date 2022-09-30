/* 
Gravino, Andrew
CS3560 Object-Oriented Programming, Yu Sun
September 29, 2022
 */

/*
Understand:
    This class exists to store the unique ID's and a person's answers
 */

import java.util.*;

public class Student{

    private int uniqueID;
    private int answer;

    public Student(int inputID){
        uniqueID = inputID;
    }

    public void setAnswer(int inputAnswer){
        answer = inputAnswer;
    }
    
    public int getUniqueID(){
        return uniqueID;
    }
}