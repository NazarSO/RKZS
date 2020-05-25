package com.company;
import java.util.Scanner;

import server.Server;
import client.Client;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Запустити програму в режимі сервера чи клієнта? (S(erver) / C(lient))");
        while (true) {
            char answer = Character.toLowerCase(in.nextLine().charAt(0));
            if (answer == 's') {
                new Server();
                break;
            } else if (answer == 'c') {
                new Client();
                break;
            } else {
                System.out.println("Некоректно введені дані. Повторіть.");
            }
        }
    }
}
