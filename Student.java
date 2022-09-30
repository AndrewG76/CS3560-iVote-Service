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

    public Student(int inputID){ //Constructor for setting a student ID. Set up like this to better suit the rapid declaration of 50 students rather than call a setter 50 times
        uniqueID = inputID;
    }

    public void setAnswer(int inputAnswer){ //Allows the random aspect of the temporaryVariable in SimulationDriver to easily adjust a Student's answer and possibly select more.
        answer = inputAnswer;
    }
    
    public int getUniqueID(){ //Fetches the students' unique ID's. Used to differentiate between students but not all that needed during this project aside from debugging
        return uniqueID;
    }

    public int getAnswer(){ //Fetches the answer associated, more useful for debugging purposes if we do not see the interactivity normally.
        return answer;
    }
}