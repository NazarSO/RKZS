package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String pr, n, a, ph;
        dovidka d1= new dovidka();
        dovidka [] d = new dovidka[2];
        Scanner in = new Scanner(System.in);
        for(int i=0; i<d.length; i++) {
            System.out.println("Запис № " + i);
            System.out.println("Введіть прізвище "+i+" запису");
            pr = in.nextLine();
            System.out.println("Введіть ім'я "+i+" запису");
            n=in.nextLine();
            System.out.println("Введіть адресу "+i+" запису");
            a=in.nextLine();
            System.out.println("Введіть номер "+i+" запису");
            ph=in.nextLine();
            d[i]= new dovidka(pr,n,a,ph);		}
        String filtr;
        System.out.println("Введіть слово для пошуку");
        filtr=in.nextLine();
        for(int i=0; i<d.length; i++) {
            d1.find(d[i], filtr);}
        System.out.println("видалення запису №1");
        d1.show(d[0]);
        d1.delete(d[0]);
        d1.show(d[0]);

        in.close();
    }
}

class dovidka {
    String priz;
    String name;
    String adress;
    String phone;
    protected dovidka(){};
    protected dovidka(String p,String n,String a,String ph) {
        priz= p;
        name = n;
        adress = a;
        phone = ph;
    }
    public void delete (dovidka a) {
        a.priz = null;
        a.name = null;
        a.adress = null;
        a.phone = null;
    }
    public void show (dovidka a) {
        System.out.println("Прізвище: "+a.priz+" Ім'я: "+a.name+" Адреса: "+a.adress+" Номер телефону: "+ a.phone);
    }
    public void find (dovidka a, String b) {
        String c = a.priz+" "+a.name+" "+a.adress+" "+a.phone;
        int index = c.indexOf(b);
        System.out.println(c);
        if(index == - 1) {
            System.out.println("Слово"+b+" не знайдене.");
        } else {
            System.out.println("Слово" +b+ "найдено в индексе "+ index);
        }

    }
}