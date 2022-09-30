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

    private static SingleSelectionQuestion question1;
    private static MultipleSelectionQuestion question2;

    private static VotingService vote1;
    private static VotingService vote2;
    
    private static ArrayList<String> studentAnswers = new ArrayList<String>();
    private static String[] possibleChoices = {"A", "B", "C", "D"};

    private static Student[] studentList = new Student[50];

    public static void main(String[] args){
        System.out.println("This is the SimulationDriver being run for a Multiple Selection Question.");
        int temporaryAnswer;

        question2 = new MultipleSelectionQuestion("What is the third letter of the alphabet?", studentAnswers);
        System.out.println(question2.getQuestion());

        for(int i = 0; i < studentList.length; i++){
            studentList[i] = new Student(i);
            temporaryAnswer = (int)(Math.random() * 4) + 1;
            for(int j = 0; j < temporaryAnswer; j++){
                studentAnswers.add(possibleChoices[j]);
            }
            studentList[i].setAnswer(i);
        }

        vote2 = new VotingService(studentAnswers);
        vote2.voteIncrement(studentAnswers);
        vote2.printResults();

        studentList = new Student[50];
        studentAnswers.clear();


        //////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\nThis is the SimulationDriver being run for a Single Selection Question.");

        question2 = new MultipleSelectionQuestion("What is your favorite letter of the first four letters of the alphabet?", studentAnswers);
        System.out.println(question2.getQuestion());

        for(int i = 0; i < studentList.length; i++){
            studentList[i] = new Student(i);
            temporaryAnswer = (int)(Math.random() * 4) + 1;
            studentAnswers.add(possibleChoices[temporaryAnswer - 1]);
            studentList[i].setAnswer(temporaryAnswer);
        }

        vote1 = new VotingService(studentAnswers);
        vote1.voteIncrement(studentAnswers);
        vote1.printResults();

    }
}
