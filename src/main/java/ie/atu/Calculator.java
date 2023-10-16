package ie.atu;

import java.util.Scanner;
public class Calculator {
    public static void main (String[] args)
    {

       // add();
        //subtract();
      //  Multiply();
        Divide();
    }

    public static void add()
    {
        //Asks for 1st number
        System.out.println(" Please enter your first Number: ");
        Scanner inputs = new Scanner(System.in);
        //input 1st number
        int firstNumber = inputs.nextInt();

        //Asks for 2nd number
        System.out.println(" Please enter your second Number:");
        int secondNumber = inputs.nextInt();
        //input 2nd number
        int total = firstNumber + secondNumber;
        System.out.println("Total is " + total);
    }
    public static void subtract()
    {
        System.out.println(" Please enter your first Number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println(" Please enter your second Number:");
        int secondNumber = inputs.nextInt();

        int total = firstNumber - secondNumber;
        System.out.println("Total is " + total);
    }
    public static void Multiply()
    {
        System.out.println(" Please enter your first Number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println(" Please enter your second Number:");
        int secondNumber = inputs.nextInt();

        int total = firstNumber * secondNumber;
        System.out.println("Total is " + total);
    }
    public static void Divide()
    {
        System.out.println(" Please enter your first Number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println(" Please enter your second Number:");
        int secondNumber = inputs.nextInt();

        int total = firstNumber / secondNumber;
        System.out.println("Total is " + total);
    }
}

