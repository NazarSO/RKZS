package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("n = ");
        int n = in.nextInt();

        int a[] = new int[n];

        for (int i=0; i<n; i++){
            System.out.print("a[" + i + "]= ");
            a[i] = in.nextInt();
        }

        System.out.print("\n");

        for(int i=0; i<n; i++) {
            if(a[i]<0) {
                a[i] = a[i] * a[i];
                System.out.print("*a[" + i + "]= " + a[i] + "\n");
            }
            else System.out.print("a[" + i + "]= " + a[i] + "\n");
        }
    }
}
