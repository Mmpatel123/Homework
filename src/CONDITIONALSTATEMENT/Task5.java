package CONDITIONALSTATEMENT;

public class Task5 {
    public static void main(String[] args) {

       double x=25.586;
       double y=25.586;




        x = Math.round(x * 1000);
        x = x / 1000;

        y = Math.round(y * 1000);
        y = y / 1000;

        if (x == y)
        {
            System.out.println("They are the same up to three decimal places");
        }
        else
        {
            System.out.println("They are different");
        }
    }
}



