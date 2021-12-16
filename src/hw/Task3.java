package hw;

public class Task3 {
    public static void main(String[] args) {
        Task3 task3=new Task3();

        int a =50;
        task3.mylogic(a);
    }

public void mylogic(int b){

    if(b >40)
    {
        System.out.println("pass");
    }
    else if (b ==50)
    {
        System.out.println("minimum marks");
    }
    else
    {
        System.out.println("fail");
    }


}

}
