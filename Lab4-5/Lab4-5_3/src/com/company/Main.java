package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.###");
        double profit[] = new double[11];
        double SumOfProfits = 0, MinLosses = 0;
        int quantity = 0, CheckAnswer = 0;

        for(int i = 0, year=1991; i<11; i++, year++){
            profit[i] = 100 * Math.cos(year);
        }

        for(int i=0, year=1991; i<11; i++, year++){
            if (profit[i]>0){
                System.out.println(year + " year:\t" + df.format(profit[i]) + "$\t\t PROFIT");
            }
            else if (profit[i]<0){
                System.out.println(year + " year:\t" + df.format(profit[i]) + "$\t LOSSES");
            }
            else System.out.println(year + " year:\t " + df.format(profit[i]) + "$\t\t\t\t\t NULL");
        }

        for(int i=0; i<11; i++){
            if (profit[i]>0){
                SumOfProfits += profit[i];
            }
            if (profit[i]<MinLosses){
                MinLosses = profit[i];
            }
        }

        System.out.println("Sum of profits: " + df.format(SumOfProfits));
        System.out.println("Max losses: " + df.format(MinLosses));

        while ((CheckAnswer != 1)&&(CheckAnswer != 2)) {
            System.out.println("Do you want to know something else? (1 - yes, 2 - no)");
            CheckAnswer = in.nextInt();

            if (CheckAnswer == 1) {

                do {
                System.out.println("What you want to know? (1 - profit; 2 - losses)");
                CheckAnswer = in.nextInt();

                    if (CheckAnswer == 1) {

                        for(int i=0, year=1991; i<11; i++, year++){
                            if(profit[i]>0){
                                System.out.println(year + " year: \t" + df.format(profit[i]) + "$\t\t PROFIT");
                                quantity++;
                            }
                        }

                        if(quantity == 0){
                            System.out.print("No information!");
                        }

                    } else if (CheckAnswer == 2) {

                        for(int i=0, year=1991; i<11; i++, year++){
                            if(profit[i]<0){
                                System.out.println(year + " year: \t" + df.format(profit[i]) + "$\t\t LOSSES");
                                quantity++;
                            }
                        }

                        if(quantity == 0){
                            System.out.print("No information!");
                        }

                    } else {
                        System.out.print("WHAT???");
                    }
                } while ((CheckAnswer != 1)&&(CheckAnswer != 2));

            } else if (CheckAnswer == 2) {
                System.out.println("Have a nice day!");
            } else {
                System.out.println("What do you have in mind?!");
            }
        }
    }
}