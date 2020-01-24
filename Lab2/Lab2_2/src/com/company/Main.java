package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###.###");
        Scanner in = new Scanner(System.in);
        double x, Result;

        System.out.print("Enter X: ");
        x = in.nextDouble();

        if(x<4)
        {
            Result = Math.pow(x, 3) + 2 + 5 * Math.pow(x, 8) + 3;
        }
        else if((4 <= x) && (x < 7))
        {
            Result = Math.pow(x, 3) + 2 + x * x + 7;
        }
        else
        {
            Result = Math.pow(x, 3) + 2 + Math.log10(x) + 2;
        }

        System.out.print("Y = " + df.format(Result));
    }
}
