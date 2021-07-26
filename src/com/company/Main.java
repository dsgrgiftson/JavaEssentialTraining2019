package com.company;

public class Main {

    public static void main(String[] args) {
        String s1 = "Hello!";
        var s2 = "Hello!";

        var s3 = new String("Hello!");
        var s4 = new String("Hello!");

        var s5 = new String("Hello!");
        var s6 = s5;
        var s7=s6.toUpperCase();

        System.out.println(s1==s2);
        System.out.println(s3==s4);
        System.out.println(s5==s6);

        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));
        System.out.println(s5.equals(s6));
        System.out.println(s6.equals(s7));
        System.out.println(s6.equalsIgnoreCase(s7));
    }
}
