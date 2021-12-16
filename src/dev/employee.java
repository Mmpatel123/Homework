package dev;

public class employee {

    int eid;
    String ename;
    int deptno;
    String job;

    void display() {
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(deptno);
        System.out.println(job);
    }
        public static void main(String[]args) {

            employee emp1 = new employee();
            emp1.eid = 101;
            emp1.ename = "david";
            emp1.deptno = 10;
            emp1.job = "Manager";

            emp1.display();


            employee emp2= new employee();
            emp2.eid=102;
            emp2.ename="john";
            emp2.deptno=20;
            emp2.job="engineer";

            emp2.display();


        }}







