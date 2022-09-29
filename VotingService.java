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

public class VotingService implements Question{
    private int[] multipleSelectionCounts = {0, 0, 0, 0}; //This represents the possible choices of A B C D
    private int[] singleChoiceCounts = {0, 0};

    private String[] uniqueIDs;
    private Student studentSubmission;

    public void submissionResults(int[] counter, String[] questionType){
        for(int i = 0; i < questionType.length; i++){
            System.out.println(questionType[i] + " : " + counter[i]);
        }
    }
}