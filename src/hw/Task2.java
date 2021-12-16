package hw;

public class Task2 {

     String bedroom;
    String kitchen;
    String garden;
    String bathroom;
    String toilets;
    String brothers;
    String sisters;
    String sofas;
    String myhouse;
    String heater;
    String car;
    String airconditioner;
    String computer;
    void display()
    {
        System.out.println(bedroom);
        System.out.println(kitchen);
        System.out.println(garden);
        System.out.println(bathroom);
        System.out.println(toilets);
        System.out.println(sofas);
        System.out.println(sisters);
        System.out.println(brothers);
        System.out.println(myhouse);
        System.out.println(heater);
        System.out.println(airconditioner);
        System.out.println(car);
        System.out.println(computer);
    }


    public static void main(String[] args) {
        Task2 task2=new Task2();
        task2.bedroom="i have 4 bedroom";
        task2.kitchen="i have 1 kitchen";
        task2.garden="i have 1 garden";
        task2.bathroom="i have 2 bathrooms";
        task2.toilets="i have 2 toilets";
        task2.sofas="i have 3 sofas";
        task2.sisters="i have 4 sisters";
        task2.brothers="i have 6 brothers ";
        task2.myhouse="i love my house";
        task2.heater="i have 1 heater";
        task2.airconditioner="i have 1 aircondintioner";
       task2.car="i have 1 car";
       task2.computer="i have 1 computer";

        task2.display();

    }




}
