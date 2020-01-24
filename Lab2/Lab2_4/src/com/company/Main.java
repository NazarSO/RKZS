package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Direction;
        char Quarter = 'N'; //сторони світу
        boolean CheckExit = true;

        System.out.println("Hello! I'm robot Bob! And I can go where you say!");
        System.out.println("Instruction:\n 0 - continue moving;\n 1 - turn left;\n" +
                " 2 - turn right;\n 4 - the initial direction\n 5 - Exit the program");
        while(CheckExit == true) {

            System.out.print("So, Where I go? ");
            Direction = in.nextInt();

            if (Direction == 1) {
                System.out.println("I keep going!");
                if (Quarter == 'N') {
                    System.out.println("I'm going North!");
                }
                if (Quarter == 'E') {
                    System.out.println("I'm going East!");
                }
                if (Quarter == 'S') {
                    System.out.println("I'm going South!");
                }
                if (Quarter == 'W') {
                    System.out.println("I'm going West!");
                }
            } else if (Direction == 2) {
                System.out.println("I turn left!");
                if (Quarter == 'N') {
                    System.out.println("I'm going West!");
                }
                if (Quarter == 'E') {
                    System.out.println("I'm going North!");
                }
                if (Quarter == 'S') {
                    System.out.println("I'm going East!");
                }
                if (Quarter == 'W') {
                    System.out.println("I'm going South!");
                }
            } else if (Direction == 3) {
                System.out.println("I turn right!");
                if (Quarter == 'N') {
                    System.out.println("I'm going East!");
                }
                if (Quarter == 'E') {
                    System.out.println("I'm going South!");
                }
                if (Quarter == 'S') {
                    System.out.println("I'm going West!");
                }
                if (Quarter == 'W') {
                    System.out.println("I'm going North!");
                }
            } else if (Direction == 4) {
                System.out.println("Okay! I'm going North! Again...");
            } else if (Direction == 5) {
                System.out.println("Hurray! I'm free!");
                CheckExit = false;
            } else System.out.println("I don't know this command!!!");
        }
    }
}
