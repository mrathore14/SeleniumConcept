package com.metlife.natrajan;

import java.io.InputStream;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Assesment
{
    public static void main(String[] args)
    {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the Number:");
        int i= scanner.nextInt();


        for (int j=0;j<=i;j++)
        {
            for (int k=0;k<=j;k++) {

                int m=0;
                if (m % 2 == 0) {
                    System.out.print("1");

                } else {
                    System.out.print("0");
                }
                m=m+1;




            }
        }


    }
}
