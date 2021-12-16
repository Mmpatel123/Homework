package CONDITIONALSTATEMENT;

public class Task2 {
    public static void main(String[] args) {
        int a=250554;
        int b=7847;
        int c=875454;

        if(a>b && a>c)
        {
            System.out.println("A IS GREATER");
        }

        else if (b>a && b>c)
        {
            System.out.println("B IS LARGEST NUMBER");
        }

        else
        {
            System.out.println("C IS LARGEST NUMBER ");
        }
    }
}
