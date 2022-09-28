/* 
Gravino, Andrew
CS3560 Object-Oriented Programming, Yu Sun
September 29, 2022
 */

/*
Understand:
    This class exists to store the unique ID's and a person's answers
 */

public class Student{

    private String uniqueID;
    private char singleChoiceAnswer;
    private String multipleChoiceAnswer;

    public void Student(String inputID, String inputMultipleChoice){
        uniqueID = inputID;
        multipleChoiceAnswer = inputMultipleChoice;
    }

    public void Student(String inputID, char inputSingleChoice){
        uniqueID = inputID;
        singleChoiceAnswer = inputSingleChoice;
    }

    public String getUniqueID(){
        return uniqueID;
    }

    public String getSingleChoiceAnswer(){
        return singleChoiceAnswer;
    }

    public String getMultipleChoiceAnswer(){
        return multipleChoiceAnswer;
    }

}