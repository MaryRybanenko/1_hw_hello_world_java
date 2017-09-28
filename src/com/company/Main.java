package com.company;
import java.util.Scanner;

public class Main {

    public static void print(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println();
    }


    public static void bubblySort(String[] args) {
        for (int j = 0; j < args.length; j++) {
            for (int i = j + 1; i < args.length; i++) {
                if (args[i].compareTo(args[j]) < 0) {
                    String temp = args[j];
                    args[j] = args[i];
                    args[i] = temp;
                }
            }
        }
    }

    public static void insertSort(String[] args)
    {
        int[] a = {3, 10, 8, 6, 3, 1, 7, 2, 5, 3};

        for (int j = 1; j <= args.length - 1; j++)
        {
            String key = args[j];

            for (int i = j - 1; i >= 0; i--)
            {
                if (args[i].compareTo(key) > 0)
                {
                    args[i + 1] = args[i];
                    args[i] = key;
                }

            }

        }

    }


    public static void main(String[] args)
    {
        String[] param1 = {"наша", "таня", "громко", "плачет"};
        String[] param2 = {"Наша Таня громко плачет", "Уронила в речку мячик.", "— Тише, Танечка, не плачь:", "Не утонет в речке мяч."};

        print(param2);

        insertSort(param2);
        print(param2);

        bubblySort(param1);
        print(param1);

    }

}
