package dev;

public class student {

    int sid;
    String sname;
    char grade;

   student(int id, String name, char g)
    {
sid=id;
sname=name;
grade=g;
    }

    public student() {

    }

    void display()
    {
        System.out.println(sid);
        System.out.println(sname);
        System.out.println(grade);
    }
}
