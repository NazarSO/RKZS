package com.company;

import MinAndMax.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("n = ");
        int n = in.nextInt();

        int a[] = new int[n];
        MinAndMax mam = new MinAndMax();

        for(int i=0; i<n; i++){
            System.out.print("A[" + i + "]= ");
            a[i] = in.nextInt();
        }
        mam.MinMaxArr(a);
    }
}
