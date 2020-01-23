package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int QuantityC1, QuantityC2, QuantityC3, QuantityC4;
        double SumC1, SumC2, Sum;
        double PriceC1 = 0.2;
        double PriceC2 = 0.6;
        double PriceC3 = 0.15;
        double PriceC4 = 0.2;
        DecimalFormat df = new DecimalFormat("###.###");
        Scanner in = new Scanner(System.in);

        System.out.print("How many notebooks of the first type? ");
        QuantityC1 = in.nextInt();

        System.out.print("How many notebooks of the second type? ");
        QuantityC2 = in.nextInt();

        System.out.print("How many pencils? ");
        QuantityC3 = in.nextInt();

        System.out.print("How many pens? ");
        QuantityC4 = in.nextInt();

        SumC1 = QuantityC1 * PriceC1;
        SumC2 = QuantityC2 * PriceC2;
        Sum = SumC1 + SumC2 + QuantityC3 * PriceC3 + QuantityC4 * PriceC4;

        System.out.println("Price for notebooks of the first type: " + df.format(SumC1));
        System.out.println("Price for notebooks of the second type: " + df.format(SumC2));
        System.out.println("Price for everything: " + df.format(Sum));
    }
}
