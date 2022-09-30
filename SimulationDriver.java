// Gravino, Andrew
// CS3560 Object-Oriented Programming, Yu Sun
// September 29, 2022

//Understand:
//The simulation driver class exists to randomly generate a number of students 
//Those students will be answering questions with either one choice only or be able to choose as many as they want

//Match:
//This is a driver class that will call a separate question and answer to be generated each run alongside approximately 100 students with unique id's
//That implies we will be needing to reset our results, the student data, their answers, the question, and the correct answer each time
//That being said, we need to handle the counts in THIS class

import java.util.ArrayList;

class SimulationDriver{

    private static SingleSelectionQuestion question1; //These declarations create a version of each question were users can have either one or more than one selection
    private static MultipleSelectionQuestion question2;

    private static VotingService vote; //This will refresh once we finish a question with a manual clearing
    
    private static ArrayList<String> studentAnswers = new ArrayList<String>();
    private static String[] possibleChoices = {"A", "B", "C", "D"}; //You will be able to choose A, B, C, or D in one question type and A, B, C, and/or D in the other

    private static Student[] studentList = new Student[50];

    public static void main(String[] args){
        System.out.println("This is the SimulationDriver being run for a Multiple Selection Question.\n");
        int temporaryAnswer; //This variable will act as a buffer to give us random extra letters

        question2 = new MultipleSelectionQuestion("What is the third letter of the alphabet?", studentAnswers);
        System.out.println(question2.getQuestion());

        for(int i = 0; i < studentList.length; i++){
            studentList[i] = new Student(i);
            temporaryAnswer = (int)(Math.random() * 4) + 1; //This segment here exists to give us extremely arbitrary possible extra votes in the poll
            for(int j = 0; j < temporaryAnswer; j++){ 
                studentAnswers.add(possibleChoices[j]);
            }
            studentList[i].setAnswer(i); //Ultimately setting the student's last answer as the true one according to their object private data
        }

        vote = new VotingService(studentAnswers); //Apply the list of students' answers to the voting service constructor
        vote.voteIncrement(); //Adjust vote counts accordingly
        vote.printResults();
 
        studentAnswers.clear(); //Upon finishing a question, here was the aforementioned need to manually refresh the list by giving it results that do not overlap with the previous round


        //////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\nThis is the SimulationDriver being run for a Single Selection Question.\n"); 

        question1 = new SingleSelectionQuestion("What is your favorite letter of the first four letters of the alphabet?", studentAnswers);
        System.out.println(question1.getQuestion());

        for(int i = 0; i < studentList.length; i++){
            studentList[i] = new Student(i);
            temporaryAnswer = (int)(Math.random() * 4) + 1;
            studentAnswers.add(possibleChoices[temporaryAnswer - 1]); //We mostly rinse and repeat except for using the temporaryAnswer variable to give us a single possibility rather than continue adding more
            studentList[i].setAnswer(temporaryAnswer);
        }

        vote = new VotingService(studentAnswers); //Can utilize the voting system again
        vote.voteIncrement();
        vote.printResults();

    }
}
