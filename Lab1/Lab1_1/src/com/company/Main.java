package com.company;
        import java.text.DecimalFormat;
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float X, Y, Z;
        double a, b;
        DecimalFormat df = new DecimalFormat("###.###");
        Scanner in = new Scanner(System.in);

        System.out.println ("Enter variable");

        System.out.print ("X = ");
        X = in.nextFloat();

        System.out.print ("Y = ");
        Y = in.nextFloat();

        System.out.print ("Z = ");
        Z = in.nextFloat();

        a = ((Math.pow (Math.sqrt(Math.pow(X-7, 3)), 1/5)) + 2 * Math.tan(5*Y)) / (10 * (Math.log(Z) / Math.log(2)));
        b = 2.7 * X - Math.sqrt(Math.pow(X-7, 3));

        System.out.println("a = " + df.format(a));
        System.out.println("b = " + df.format(b));
    }
}
