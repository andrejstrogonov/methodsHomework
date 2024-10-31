package org.andrejstrogonov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AppTest
{
    @Test
    public void testLeapYear()
    {
        assertEquals("2024 год — високосный год",App.calculatorLeapYear(2024));
    }
    @Test
    public void testNotLeapYear()
    {
        assertEquals("2023 год — невисокосный год",App.calculatorLeapYear(2023));
    }
    @Test
    public void testYearOs(){
        assertEquals("Установите версию приложения для Android по ссылке",App.calculateDeviceVersion(1,2016));
    }
    @Test
    public void testYearOsYear(){
        assertEquals("Установите облегченную версию приложения для iOS по ссылке",App.calculateDeviceVersion(0,2013));
    }
    @Test
    public void testDelivery(){
        assertEquals("Потребуется дней: 2",App.calculateDeliveryDistance(50));
    }


}
