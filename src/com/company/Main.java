package com.company;

import java.io.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        int work = 1;
        Zapis zapis = new Zapis();
        while (work == 1) {
            // Runtime.getRuntime().exec("cls");
            System.out.println("Witaj! Wpis" +
                    "z numer zadania:");
            Scanner num = new Scanner(System.in);
            String number = num.next();
            // System.out.print(number);

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Wpisz formule SQL : ");
            String formule = null;
            try {
                formule = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            String result = formule.toUpperCase();
            // System.out.println(result);

            int[] array = new int[4];
            String strZnajdz = result;
            int intIndeks = strZnajdz.indexOf("SELECT");
            array[0] = intIndeks;
            //System.out.println(array[0]);
            intIndeks = strZnajdz.indexOf("FROM");
            array[1] = intIndeks;
            // System.out.println(array[1]);
            intIndeks = strZnajdz.indexOf("WHERE");
            array[2] = intIndeks;
            // System.out.println(array[2]);
            intIndeks = strZnajdz.indexOf("ORDER BY");
            array[3] = intIndeks;
            // System.out.println(array[3]);

            if (array[0] == array[1]) {

                array[1] = array[0] + 1;
            } else if (array[1] == array[2]) {
                array[1] = array[0] + 1;
                array[2] = array[1] + 1;
            } else if (array[2] == array[3]) {
                array[2] = array[1] + 1;
                array[3] = array[2] + 1;
            } else if (array[2] == -1 && array[0] != -1 && array[1] != -1 && array[3] != -1) {
                array[2] = array[1] + 1;
            } else if (array[2] != -1 && array[0] != -1 && array[1] != -1 && array[3] == -1) {
                array[3] = array[2] + 1;
            }

//        for (int i = 0; i < 5; i++) {
//            System.out.println(array[i]);
//        }

            if (array[0] >= array[1] || array[1] >= array[2] || array[2] >= array[3]) {
                System.out.println("Bledna formuła SQL!");
                zapis.add("", "");
                zapis.closefile();
            } else if (array[0] < array[1] && array[1] < array[2] && array[2] < array[3]) {
                zapis.add(number, formule);
                System.out.println("Prawidlowa formula SQL!");
            }
            System.out.println("Aby kontynuowac wpisz '1', aby zakonczyc dzialanie programu, wpisz liczbe rozna od 1");
            Scanner odczyt = new Scanner(System.in);
            work = odczyt.nextInt();
        }
        zapis.Zapisz();
        zapis.closefile();
    }
}











