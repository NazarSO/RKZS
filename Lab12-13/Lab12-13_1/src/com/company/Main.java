package com.company;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double number;

        System.out.print("Number = ");
        number = in.nextDouble();

        OptionalDouble  sqrt = OptionalDouble.empty();

        if(number != 0){
            sqrt = OptionalDouble.of(Math.sqrt(number));
        }

        System.out.print(sqrt);
    }
}