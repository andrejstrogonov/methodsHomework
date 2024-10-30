package org.andrejstrogonov;

public class App
{
    public static void main( String[] args )
    {
        System.out.println(calculatorLeapYear(2024));
    }

    public static String calculatorLeapYear(int i) {
        if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
            return i + " год — високосный год";
        } else {
            return i + " год — невисокосный год";
        }
    }
}
