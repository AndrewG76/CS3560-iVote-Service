/* 
Gravino, Andrew
CS3560 Object-Oriented Programming, Yu Sun
September 29, 2022
 */

import java.util.*;

public class SingleSelectionQuestion implements Question{

private String question;
private ArrayList<String> choice = new ArrayList<String>(); //Adjusted into ArrayList for sake of consistency with MultipleSelectionClass

    public SingleSelectionQuestion(String inputQuestion, ArrayList<String> inputChoice){
        question = inputQuestion;
        choice = inputChoice;
    }

    public void setQuestion(String inputQuestion){
        question = inputQuestion;
    }
    public void setChoice(ArrayList<String> inputChoice){
        choice = inputChoice;
    }
    public String getQuestion(){
        return question;
    }
    public ArrayList<String> getChoice(){
        return choice;
    }
}