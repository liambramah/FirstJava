package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {
    @Test
    @DisplayName("My first test")
    public void firstTest(){
        Assertions.assertTrue(5 == 5);
    }

    @Test
    @DisplayName("Given a time of 21, greeting return Good Evening")
    public void given21_Greeting_ReturnsGoodEvening(){
        int time = 21;
        String expectedGreeting = "Good Evening";
        String result = Program.greeting(time);
        Assertions.assertEquals(expectedGreeting, result);
    }

    @Test
    @DisplayName("Given a time of 5, greeting return Good Morning")
    public void given5_Greeting_ReturnsGoodMorning(){
        int time = 5;
        String expectedGreeting = "Good Morning";
        String result = Program.greeting(time);
        Assertions.assertEquals(expectedGreeting, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 8, 11})
    @DisplayName("Given a time between 5 and 11, greeting returns good morning")
    public void GivenTimeBetween5And12_Greeting_ReturnsGoodMorning(int time){
        String expected = "Good Morning";
        String result = Program.greeting(time);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {12, 15, 17})
    @DisplayName("Given a time between 12 and 17, greeting returns Good Afternoon")
    public void GivenTimeBetween12And17_Greeting_ReturnsGoodAfternoon(int time){
        String expected = "Good Afternoon";
        String result = Program.greeting(time);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {18, 21, 23, 0, 3, 4})
    @DisplayName("Given a time between 18 and 23, and between 0 and 4, greeting returns Good Evening")
    public void GivenTimeBetween18And23And0And4_Greeting_ReturnsGoodEvening(int time){
        String expected = "Good Evening";
        String result = Program.greeting(time);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 24, 56, -43})
    @DisplayName("Given a time under 0 and above 23, greeting returns Please Input a Time Between 0 and 23")
    public void GivenTimeUnder0andAbove23_Greeting_ReturnsPleaseInputATimeBetween0And23(int time){
        String expected = "Please input a time between 0 and 23";
        String result = Program.greeting(time);
        Assertions.assertEquals(expected, result);
    }

}