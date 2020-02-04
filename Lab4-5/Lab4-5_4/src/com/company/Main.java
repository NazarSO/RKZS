package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.###");
        int kPos = 0, kNeg = 0;
        double AveragePos = 0, AverageNeg = 0;

        System.out.print("n = ");
        int n = in.nextInt();

        int A[] = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("A[" + i + "]= ");
            A[i] = in.nextInt();
        }

        for(int i=0; i<n; i++) {
            if(A[i]>=0) {
                AveragePos += A[i];
                kPos++;
            }
            else if(A[i]<0) {
                AverageNeg += A[i];
                kNeg++;
            }
        }

        AveragePos /=kPos;
        AverageNeg /=kNeg;

        System.out.print("Positive = " + df.format(AveragePos) + "\nNegative = " + df.format(AverageNeg));
    }
}
