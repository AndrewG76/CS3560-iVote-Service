/* 
Gravino, Andrew
CS3560 Object-Oriented Programming, Yu Sun
September 29, 2022
 */

/*
Understand:
    The VotingService class will be handling a given question type of either a select multiple question or a single choice question
    After that, it accepts submissions from students
        Supposedly, it will take in as many submissions from a single student at a time
        However, it will only take in the last submitted answer from a person when the answer is to be revealed


*/

import java.util.*;

public class VotingService{
    private int[] choiceCounts = {0, 0, 0, 0}; //Counts represent the corresponding A B C D choices
    private ArrayList<String> answerList;
    private String temporaryAnswer;

    public VotingService(ArrayList<String> inputAnswers){ //Constructor to allow SimulationDriver to immediately start getting to work with assigning private variables
        answerList = inputAnswers;
    }

    public void voteIncrement(){ //With the answerList already in our private variables, we can start adjusting the counts for each choice using comparison at each index value to increment one by one

        for(int i = 0; i < answerList.size(); i++){
            temporaryAnswer = answerList.get(i); 
            if(temporaryAnswer.equals("A")){
                choiceCounts[0] += 1;
            }
            if(temporaryAnswer.equals("B")){
                choiceCounts[1] += 1;
            }
            if(temporaryAnswer.equals("C")){
                choiceCounts[2] += 1;
            }
            if(temporaryAnswer.equals("D")){
                choiceCounts[3] += 1;
            }
        }
    }

    public void printResults(){ //This method is ready to display the corresponding scores once it is called at the end of each run in the SimulationDriver
        System.out.println("Final Results:");
        System.out.println("A: " + choiceCounts[0]);
        System.out.println("B: " + choiceCounts[1]);
        System.out.println("C: " + choiceCounts[2]);
        System.out.println("D: " + choiceCounts[3]);
    }

}