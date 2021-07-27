package com.company;

public class Main {

    public static void main(String[] args) {
        var s1 = "                   Welcome to California!                         " +
                "   " +
                "            ";

        System.out.println(s1.length());
        System.out.println(s1.indexOf("California"));
        System.out.println(s1.substring(11));
        System.out.println(s1.substring(11,15));
        System.out.println(s1.subSequence(11,15));

        //Removes white spaces in the beginning or the end of the string. Remove spaces, new lines, tabs
        System.out.println(s1.trim());
    }
}
