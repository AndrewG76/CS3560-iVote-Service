/* 
Gravino, Andrew
CS3560 Object-Oriented Programming, Yu Sun
September 29, 2022
 */

public class SingleSelectionQuestion implements Question{

private String question;
private String[] possibleSingleChoices = {"1. Right", "2. Wrong"};
private int[] singleChoiceCounts = {0, 0};

    public void printQuestion(){
        System.out.println(question);
    }

    public void printChoice(){
        System.out.println("Please select one answer only.");
            for(int i = 0; i < possibleSingleChoices.length; i++){
                System.out.println(possibleSingleChoices[i]);
            }
    }

    public getChoice(int inputIndex){
        return possibleSingleChoices[inputIndex];
    }

    public int getCounter(int inputIndex){
        return singleChoiceCounts[inputIndex];
    }
}