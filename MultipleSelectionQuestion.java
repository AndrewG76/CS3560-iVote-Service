/* 
Gravino, Andrew
CS3560 Object-Oriented Programming, Yu Sun
September 29, 2022
 */

import java.util.*;

public class MultipleSelectionQuestion implements Question{

    private String question;
    private ArrayList<String> choice = new ArrayList<String>(); //Set to ArrayList because it can be a list of multiple answers a user selects, not just one answer.

    public MultipleSelectionQuestion(String inputQuestion, ArrayList<String> inputChoice){
        question = inputQuestion;
        choice = inputChoice;
    }

    public void setQuestion(String inputQuestion){
        question = inputQuestion;
    }
    public void setChoice(ArrayList<String> inputChoices){
        choice = inputChoices;
    }
    public String getQuestion(){
        return question;
    }
    public ArrayList<String> getChoice(){
        return choice;
    }
}