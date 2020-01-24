package com.company;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###.###");
        double x = 1.5, y, CheckNumb = 1;

        while (x <= 3.5) {

            if (x < 2) {
                y = 1 / Math.sin(Math.exp(x));
            } else if ((2 <= x) && (x < 3)) {
                y = 1 / (Math.cos(Math.log10(x)));
            } else {
                y = Math.sin(Math.log10(x));
            }

            if(CheckNumb % 2 != 0 ){
                System.out.printf("Y = " + df.format(y));
            }
            else {
                System.out.println("\tY = " + df.format(y));
            }

            CheckNumb++;
            x += 0.2;
        }
    }
}
