package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float R, H;
        double V;
        DecimalFormat df = new DecimalFormat("###.###");
        Scanner in = new Scanner(System.in);

        System.out.println("Enter variables:");

        System.out.print ("Height = ");
        H = in.nextFloat();

        System.out.print ("Radius = ");
        R = in.nextFloat();

        V = Math.PI * R * R * H;

        System.out.println("Volume = " + df.format(V));
    }
}
