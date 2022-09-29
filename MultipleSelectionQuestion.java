/* 
Gravino, Andrew
CS3560 Object-Oriented Programming, Yu Sun
September 29, 2022
 */

import java.util.*;

public class MultipleSelectionQuestion implements Question{

    private String question;
    private ArrayList<String> choices = new ArrayList<String>();

    public MultipleSelectionQuestion(String inputQuestion, ArrayList<String> inputChoices){
        question = inputQuestion;
        answers = inputAnswers;
    }

    public void setQuestion(String inputQuestion){
        question = inputQuestion;
    }
    public setChoice(ArrayList<String> inputChoices){
        choices = inputChoices;
    }
    public String getQuestion(){
        return question;
    }
    public getChoice(){
        return choice;
    }
}