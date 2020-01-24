package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A, B;

        System.out.print("Enter A: ");
        A = in.nextInt();
        System.out.print("Enter B: ");
        B = in.nextInt();

        if (A > B)
        {
            A=A+B-(B=A);
        }

        System.out.println("A: " + A);
        System.out.println("B: " + B);
    }
}
