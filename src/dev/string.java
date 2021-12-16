package dev;

public class string {
    public static void main(String[] args) {
        String s="welcome";
s.length();
System.out.println(s.length());


String s1="welcome to";
String s2="java programing";

System.out.println(s+" "+s2);
        System.out.println("welcome to". concat("java programing"));

        s ="     java programing   ";

        System.out.println(s);
        System.out.println(s.trim());

        s="welcome";

        System.out.println(s.charAt(5));
        System.out.println(s.charAt(2));
        System.out.println(s.contains("come"));
        System.out.println(s.contains("abc"));

        s = "Welcome";

      System.out.println(s.equalsIgnoreCase("Welcome"));
        System.out.println(s.equalsIgnoreCase("welcome"));

        s="welcome to java programing";

        System.out.println(s.replace('e','a'));
        System.out.println(s.replace('e','a'));
        System.out.println(s.replace("welcome","xyz"));

        s="welcome";
      System.out.println(s.substring(2,4));
        System.out.println(s.substring(0,4));

        s="WELCOME";
        System.out.println(s.toLowerCase());

        s="welCOME";
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());




}}
