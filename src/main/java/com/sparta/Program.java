package com.sparta;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        System.out.println("Please input the time");
        Scanner myInput = new Scanner(System.in);
        int timeOfDay = myInput.nextInt();
        // short-circuiting operation
        String result = greeting(timeOfDay);
        System.out.println(result);
    }

    public static String greeting(int timeOfDay) {
        String greeting;
        if(timeOfDay >= 5 && timeOfDay <12){
           greeting = "Good Morning";
        }
        else if(timeOfDay >=12 && timeOfDay < 18){
            greeting = "Good Afternoon";
        }
        else if((timeOfDay >= 18 && timeOfDay <24) || (timeOfDay >=0 && timeOfDay < 5)){
            greeting = "Good Evening";
        } else {
            greeting = "Please input a time between 0 and 23";
        }
        return greeting;
    }
}
