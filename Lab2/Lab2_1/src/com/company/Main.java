package com.company;

public class Main {

    public static void main(String[] args) {
	    int ArrayX[] = {0, 1, 2}, ArrayY[]={0, 1, 2}, numb;

	    System.out.print("y/x\t0\t1\t2\n");

	    for(int i=0; i<3; i++){ //y

	        System.out.print(i + "\t");

	        for(int j=0; j<3; j++){ //x
	            if((i==0)&&(j==0)){
	                System.out.print("2\t");
                }
	            else if((i==0)&&(j==1)){
                    System.out.print("2\t");
                }
	            else if((i==0)&&(j==2)){
                    System.out.print("0\n");
                }
                else if((i==1)&&(j==0)){
                    System.out.print("1\t");
                }
                else if((i==1)&&(j==1)){
                    System.out.print("2\t");
                }
                else if((i==1)&&(j==2)){
                    System.out.print("0\n");
                }
                else if((i==2)&&(j==0)){
                    System.out.print("2\t");
                }
                else if((i==2)&&(j==1)){
                    System.out.print("2\t");
                }
                else if((i==2)&&(j==2)){
                    System.out.print("1\n");
                }
            }
        }
    }
}
