/* 
Gravino, Andrew
CS3560 Object-Oriented Programming, Yu Sun
September 29, 2022
 */

/*
Understand:
    The simulation driver class exists to randomly generate a number of students 
    Those students will be answering questions with either one choice only or be able to choose as many as they want

Match:
    This is a driver class that will call a separate question and answer to be generated each run alongside approximately 100 students with unique id's
    That implies we will be needing to reset our results, the student data, their answers, the question, and the correct answer each time
 */

class SimulationDriver{
    public static void main(String[] args){
        System.out.println("This is the SimulationDriver being run.");
    }
}