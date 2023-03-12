public class Calculator
{
    //Global static/class variables
    static int a = 10;          //Creating a variable
    static int b = 5;           //Creating a variable
    static int answer;          //Creating variable without assigning value to store final answer which I can print out.


    static void addition()      //Creating method to perform addition of the variables.
    {
        answer =a+b;            //Writing syntax for addition of the two variables and storing it in variable "answer".
        System.out.println(answer);  //Printing out the final answer of addition of two variable.


    }
    static void subtraction()      //Creating method to perform subtraction of the variables.
    {
        answer =a-b;            //Writing syntax for subtraction of the two variables and storing it in variable "answer".
        System.out.println(answer);  //Printing out the final answer of subtraction of two variable.


    }
    static void multiplication()      //Creating method to perform multiplication of the variables.
    {
        answer =a*b;            //Writing syntax for multiplication of the two variables and storing it in variable "answer".
        System.out.println(answer);  //Printing out the final answer of multiplication of two variable.


    }
    static void division()      //Creating method to perform division of the variables.
    {
        answer =a/b;            //Writing syntax for division of the two variables and storing it in variable "answer".
        System.out.println(answer);  //Printing out the final answer of division of two variable.


    }
    public static void main(String[] args) //Main method to execute the code
    {
        addition();     //Calling addition method in order to execute the method and print the answer.
        subtraction();      //Calling subtraction method in order to execute the method and print the answer.
        multiplication();       //Calling multiplication method in order to execute the method and print the answer.
        division();     //Calling division method in order to execute the method and print the answer.
    }


}
