package com.company;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        var item = "Shirt";
        var size = "M";
        var price = 14.99;
        var color = "Red";

        var stringFormat = "Clothing item: %s, size: %s, color: %s is priced at $%.2f or %f";
        var formattedString = String.format(stringFormat, item, size, color, price, price);

        System.out.println(formattedString);

    }
}
