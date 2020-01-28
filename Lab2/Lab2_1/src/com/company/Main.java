package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int x, y, z;
        Scanner in = new Scanner(System.in);

	    System.out.print("x = ");
	    x=in.nextInt();
        System.out.print("y = ");
        y=in.nextInt();
        
        if((x==0)&&(y==0)){
            System.out.print("2\t");
        }
        else if((x==0)&&(y==1)){
            System.out.print("2\t");
        }
        else if((x==0)&&(y==2)){
            System.out.print("0\n");
        }
        else if((x==1)&&(y==0)){
            System.out.print("1\t");
        }
        else if((x==1)&&(y==1)){
            System.out.print("2\t");
        }
        else if((x==1)&&(y==2)){
            System.out.print("0\n");
        }
        else if((x==2)&&(y==0)){
            System.out.print("2\t");
        }
        else if((x==2)&&(y==1)){
            System.out.print("2\t");
        }
        else if((x==2)&&(y==2)) {
            System.out.print("1\n");
        }
    }
}
