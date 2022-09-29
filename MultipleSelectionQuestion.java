/* 
Gravino, Andrew
CS3560 Object-Oriented Programming, Yu Sun
September 29, 2022
 */

public class MultipleSelectionQuestion implements Question{

    private String question;
    private String[] possibleMultipleChoices = {"A", "B", "C", "D"};
    private int[] multipleChoiceCounts = {0, 0, 0, 0};

    public MultipleSelectionQuestion(String inputQuestion){
        inputQuestion = question;
    }

    public void printQuestion(){ //This prints the question out to the user
        System.out.println(question);
    }

    public void printChoice(){ //This prints out the choices to the user
        System.out.println("Please select at least one answer. More than one may be correct!");
        for(int i = 0; i < possibleMultipleChoices.length; i++){
            System.out.println(possibleMultipleChoices[i]);
        }
    }

    public String getChoice(int inputIndex){
        return possibleMultipleChoices[inputIndex];
    }

    public int getCounter(int inputIndex){
        return multipleChoiceCounts[inputIndex];
    }
}