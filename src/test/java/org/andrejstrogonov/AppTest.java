package org.andrejstrogonov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AppTest
{
    @Test
    public void testLeapYear()
    {
        assertEquals("2024 год является високосным",App.calculatorLeapYear(2024));
    }
    public void testNotLeapYear()
    {
        assertEquals("2023 год невисокосный год",App.calculatorLeapYear(2023));
    }


}
