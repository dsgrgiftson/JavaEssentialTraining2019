package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        var doubleValue = 10_000_000.53;

        //Custom formatting numeric values
        var numberFormatInstance = NumberFormat.getNumberInstance();
        System.out.println(numberFormatInstance.format(doubleValue));

        var currencyFormatInstance = NumberFormat.getCurrencyInstance();
        System.out.println(currencyFormatInstance.format(doubleValue));

        var defaultLocale = Locale.getDefault();
        var localeFormat = NumberFormat.getNumberInstance(defaultLocale);
        System.out.println(localeFormat.format(doubleValue));

        var netherlandsLocale = new Locale("nl","NL");
        var netherlandsCurrencyFormat = NumberFormat.getCurrencyInstance(netherlandsLocale);
        System.out.println(netherlandsCurrencyFormat.format(doubleValue));

        var decimalFormat = new DecimalFormat("$00.00");
        System.out.println(decimalFormat.format(1));

    }
}
