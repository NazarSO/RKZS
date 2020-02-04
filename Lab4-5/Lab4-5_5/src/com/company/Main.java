package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str;
        boolean check = false;
        Scanner in = new Scanner(System.in);

        while (check == false) {

            System.out.println("Enter symbol:");
            str = in.nextLine();

            if (str.length() > 1) {
                System.out.print("Error! Too many symbols!\n\n");
            } else {
                System.out.print((int) str.charAt(0));
                check = true;
            }
        }
    }
}
