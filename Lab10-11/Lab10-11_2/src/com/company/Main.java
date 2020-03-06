package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int date;
        int speed, vitratu;
        transport t1= new transport();
        transport [] t = new transport[2];
        Scanner in = new Scanner(System.in);
        for(int i=0; i<t.length; i++) {
            System.out.println("Запис № " + i);
            System.out.println("Введіть дату "+i+" запису");
            date = in.nextInt();
            System.out.println("Введіть середню швидкість "+i+" запису");
            speed=in.nextInt();
            System.out.println("Введіть середні витрати "+i+" запису");
            vitratu=in.nextInt();
            t[i]= new transport(date,speed,vitratu);
        }
        for( int i=0; i<t.length; i++) {
            t1.vitr(t[i]);
        }
        in.close();
    }
}

class transport{
    int date;
    int speed;
    int vitratu;

    protected transport() {};
    protected transport(int date,int speed,int vitratu) {
        this.date = date;
        this.speed=speed;
        this.vitratu=vitratu;
    }
    public void vitr (transport t) {
        System.out.println("Дата: "+t.date+" Швидкість: "+t.speed+" Витрати на км: "+t.vitratu+" Загальні витрати: "+ t.speed*t.vitratu);
    }
}