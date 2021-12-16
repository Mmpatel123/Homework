package CONDITIONALSTATEMENT;
import java.util.Scanner;


public class Task10 {
    public static void main(String[] args) {
        int i,n;
        System.out.println("INPUT NUMBER OF TERMS");

        Scanner in = new Scanner(System.in);
        n = in.nextInt();



        for(i=1;i<=n;i++)
        {
            System.out.println("Number is : " +i+" and square of " +i+" is : "+(i*i));
        }
    }
}
