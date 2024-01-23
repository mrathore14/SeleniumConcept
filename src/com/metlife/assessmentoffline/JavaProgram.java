package com.metlife.assessmentoffline;

import javax.swing.*;
import java.math.BigInteger;

public class JavaProgram
{
    public static void main(String[] args)
    {
        //function of additive persistence is written below
        //function of multiplicative persistence

    }
    private int additivePersistence(String num)
    {
        if(num.length() == 1) //If the number is a single digit, we're done
            return Integer.parseInt(num);

        int sum = 0;

        for(int i = 0; i < num.length(); i++)
            sum += (num.charAt(i) - '0'); //Gets integer value of char, adds it to sum

        return additivePersistence(Integer.toString(sum));
    }

    public static int multiplicativePersistence(int num) {
        int numberOfTimes = 0;
        int temp;
        while (num > 9) {
            temp = 1;
            while (num > 0) {
                temp *= num % 10;
                num /= 10;
            }
            num = temp;
            numberOfTimes++;
        }
        return numberOfTimes;
    }

}
