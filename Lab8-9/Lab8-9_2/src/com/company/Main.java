package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int type;
        String name;

        System.out.println("Input name of programme: ");
        name = in.nextLine();

        System.out.println("Input type: ");
        type = in.nextInt();

        Programme a = new Programme(name, type);
        a.type(a);
        in.close();
    }

    static class Programme {
        String name;
        int type;

        protected Programme(String name, int type) {
            name = name;
            type = type;
        }

        public void type (Programme a) {

            String s = "object of" + a.name + "type";

            if (type == 1) {
                s += "ordinal";
                System.out.println(s);
            }
            if (type == 2) {
                s += "screen";
                System.out.println(s);
            }

            if ((type != 1)&&(type != 2)) {
                s = "wrong type";
                System.out.println(s);
            }
        }
    }
}
