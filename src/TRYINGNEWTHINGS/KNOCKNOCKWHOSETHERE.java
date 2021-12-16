package TRYINGNEWTHINGS;

import java.util.Scanner;

public class KNOCKNOCKWHOSETHERE {
    public static void main(String[] args) {
        String String1;
        String String2;
        String operation;


        Scanner input = new Scanner(System.in);

        System.out.println("PLEASE ENTER THE FIRST NAME");
        String1 = input.nextBigInteger().toString();

        System.out.println("PLEASE ENTER THE SECOND NAME");
        String2= input.nextBigInteger().toString();

        Scanner op = new Scanner(System.in);

        System.out.println("PLEASE ADD IT UP");
        operation = op.next();

        if (operation == "+") ;
        {
            System.out.println(String1 + String2);
        }



    }
}
