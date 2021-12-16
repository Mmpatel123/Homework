package CONDITIONALSTATEMENT;

import java.util.Scanner;

public class calculator{
    public static void main(String[] args) {
        float num1;
        float num2;
        String operation;


        Scanner input = new Scanner(System.in);

        System.out.println("PLEASE ENTER THE FIRST NUMBER");
        num1 = input.nextInt();

        System.out.println("PLEASE ENTER THE SECOND NUMBER");
        num2 = input.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("PLEASE ENTER THE OPERATION");
        operation = op.next();

        if (operation == "+") ;
        {
            System.out.println("YOUR ANSWER IN ADITION " + (num1 + num2));
        }
        if (operation == "-") ;
        {
            System.out.println("YOUR ANSWER IN SUBTRACTION  " + (num1 - num2));
        }

        if (operation == "/") ;
        {
            System.out.println("YOUR ANSWER IN DIVISION " + (num1 / num2));
        }
        if (operation == "*") ;
        {
            System.out.println("YOUR ANSWER IN MULTIPLICATION " + (num1 * num2));
        }
    }
}
