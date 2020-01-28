package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int x, y;
	boolean CheckValue = false;
        Scanner in = new Scanner(System.in);

        while (CheckValue == false) {

            System.out.print("x = ");
            x = in.nextInt();
            System.out.print("y = ");
            y = in.nextInt();


            if ((x == 0) && (y == 0)) {
                System.out.print("2");
                CheckValue = true;
            } else if ((x == 0) && (y == 1)) {
                System.out.print("2");
                CheckValue = true;
            } else if ((x == 0) && (y == 2)) {
                System.out.print("0");
                CheckValue = true;
            } else if ((x == 1) && (y == 0)) {
                System.out.print("1");
                CheckValue = true;
            } else if ((x == 1) && (y == 1)) {
                System.out.print("2");
                CheckValue = true;
            } else if ((x == 1) && (y == 2)) {
                System.out.print("0");
                CheckValue = true;
            } else if ((x == 2) && (y == 0)) {
                System.out.print("2");
                CheckValue = true;
            } else if ((x == 2) && (y == 1)) {
                System.out.print("2");
                CheckValue = true;
            } else if ((x == 2) && (y == 2)) {
                System.out.print("1");
                CheckValue = true;
            } else System.out.println("Invalid values!");
        }
    }
}
