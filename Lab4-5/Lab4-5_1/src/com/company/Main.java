package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int A[] = new int[18];
        int B[] = new int[18];
        int i = 0;

        do {
            System.out.print("A[" + i + "]= ");
            A[i] = in.nextInt();
            i++;
        }while(i<18);

        System.out.print("\n");

        for(i=0; i<18; i++) {
            B[i] = A[i] * (i * i);
            if((i%2) == 0){
                System.out.print("B[" + i + "]= " + B[i] + "\t");
            }
            else System.out.print("B[" + i + "]= " + B[i] + "\n");
        }
    }
}
