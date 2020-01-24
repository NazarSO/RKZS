package com.company;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###.###");
        double x = 0, y, AverageNegNumb, SumNegNumb = 0, QuantityNegNumb = 0;

        while(x <= 2.5){

            y = Math.cos(2.1) * Math.sin(Math.abs(x)) / 0.15 - 5.8;
            x++;

            if(y < 0){
                SumNegNumb += y;
                QuantityNegNumb++;
            }

            System.out.println("Y: " + df.format(y));
        }

        AverageNegNumb = SumNegNumb / QuantityNegNumb;
        System.out.println("Average Negative Numbers: " + df.format(AverageNegNumb));
    }
}
