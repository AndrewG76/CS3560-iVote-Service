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
    private int[] choiceCounts = {0, 0, 0, 0};
    private String temporaryAnswer;

    public void voteIncrement(ArrayList<String> inputAnswers){
        for(int i = 0; i < inputAnswers.size(); i++){
            temporaryAnswer = inputAnswers.get(i); 
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

    public void printResults(){
        System.out.println("Final Results:");
        System.out.println("A: " + choiceCounts[0]);
        System.out.println("B: " + choiceCounts[1]);
        System.out.println("C: " + choiceCounts[2]);
        System.out.println("D: " + choiceCounts[3]);
    }

}