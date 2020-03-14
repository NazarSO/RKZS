package com.company;

import java.util.Scanner;

public class ThreadTest extends Thread {
    @Override
    public void run() {

        Scanner in = new Scanner(System.in);

        System.out.print("Sum = ");
        int sum = in.nextInt();

        for (int i = 1; i <= 100; i++) {

            for (int j = 1; j <= 100; j++){

                if ( i + j == sum){
                    System.out.println(i + " " + j);
                }

            }

        }
    }
}