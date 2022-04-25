package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
            System.out.print(a[i] + " ");
        }
        System.err.println("Please, give a number: ");
        int b = scanner.nextInt();
        boolean num = false;
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (b == a[i]) {
                num = true;
                index = i;
            }
        }
        if (num) {
            System.out.println("The index is " + index);
        } else {
            System.out.print("Sorry, no such array!");
        }
    }
}