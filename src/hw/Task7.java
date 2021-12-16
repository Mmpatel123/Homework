package hw;

public class Task7 {



   public int add(int a,int b) {

       int c;


       c = a + b;
       c = a - b;

       return c;








  }
    public static void main(String[] args) {
       Task7 task7=new Task7();
        int result = task7.add(50,50);
        System.out.println(result);


    }
}
