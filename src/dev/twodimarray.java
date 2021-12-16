package dev;

public class twodimarray {

    public static void main(String[] args) {


        int b[][] = {{100, 200}, {300, 400}, {500, 600}};

        System.out.println("number of rows and colums:" + b.length);
        System.out.println("number of rows and colums:" + b[0].length);


      for(int i=0;i<b.length;i++)
      {
for(int j=0;j<b[i].length;j++)

          {
              System.out.println(b[i][j]+"  ");
          }

      }
System.out.println();
}
        }

