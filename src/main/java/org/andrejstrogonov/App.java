package org.andrejstrogonov;

public class App
{
    public static void main( String[] args )
    {
        System.out.println(calculatorLeapYear(2024));
        System.out.println(calculateDeviceVersion(1,2014));
        System.out.println(calculateDeliveryDistance(50));
    }

    public static String calculatorLeapYear(int i) {
        if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
            return i + " год — високосный год";
        } else {
            return i + " год — невисокосный год";
        }
    }
     public static String calculateDeviceVersion(int i, int i1) {
         if (i == 1) {
             if (i1 <= 2015) {
                 return "Установите облегченную версию приложения для Android по ссылке";
             } else {
                 return "Установите версию приложения для Android по ссылке";
             }
         } else {
             if (i1 <= 2015) {
                 return "Установите облегченную версию приложения для iOS по ссылке";
             } else {
                 return "Установите версию приложения для iOS по ссылке";
             }
         }
     }

    public static String calculateDeliveryDistance(int i) {
        if (i > 20 && i <= 60){
            return "Потребуется дней: " + 2;
        }
        if (i >= 1 && i < 20){
            return "Потребуется дней: " + 1;
        }
        if (i > 60 && i <= 100){
            return "Потребуется дней: " +3;
        }
        if (i>100){
            return "Доставки нет";
        }
        return null;
    }
}
