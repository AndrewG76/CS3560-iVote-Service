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
    private boolean singleChoiceAnswer;
    private boolean[] multipleChoiceAnswer;

    public Student(String inputID, boolean[] inputMultipleChoice){
        uniqueID = inputID;
        multipleChoiceAnswer = inputMultipleChoice;
    }

    public Student(String inputID, boolean inputSingleChoice){
        uniqueID = inputID;
        singleChoiceAnswer = inputSingleChoice;
    }

    public void setSingleChoiceAnswer(boolean inputSingleChoice){
        singleChoiceAnswer = inputSingleChoice;
    }

    public void multipleSelectionAnswer(boolean[] inputMultipleChoice){
        singleChoiceAnswer = inputMultipleChoice;
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