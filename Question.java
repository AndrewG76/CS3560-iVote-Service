/* 
Gravino, Andrew
CS3560 Object-Oriented Programming, Yu Sun
September 29, 2022
 */

/*
Understand:
    This will serve as an interface because the program requires that there will be a multiple selection type problem and a single selection type problem
    We will have specific classes implementing this interface so
    Apply generic method titles
 */

import java.util.*;

public interface Question{
    //Set the question 
    public void setQuestion();
    //Sets the answer
    public void setChoice(ArrayList<String> inputChoice);

    //Get the question being posed to the users
    public String getQuestion();
    //Gets the selected answer(s)
    public String getChoice(int inputIndex);
}