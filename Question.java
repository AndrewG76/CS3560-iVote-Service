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

public interface Question{
    //Print the question being posed to the users
    public void printQuestion();

    //Prints the choices of the users 
    public void printChoice();
}