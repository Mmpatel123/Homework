package CONDITIONALSTATEMENT;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        String str="";
        int count =0;
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER STRING");
        str =scan.nextLine();for(int i=0;i<str.length();++i) {

            switch (str.charAt(i)){

                case 'a':
                case 'e' :
                case'i':
                case'o':
                case'u':
                    count++;

            }




        }
        System.out.println("number of vowels are"+count);

    }
}
