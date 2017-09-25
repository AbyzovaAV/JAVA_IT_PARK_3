package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arreySize = scanner.nextInt();
        int arrey[] = new int[arreySize];

        for (int i = 0; i < arrey.length; i++)
            arrey [i] = scanner.nextInt();

        int sum =0;
        for (int i = 0; i < arrey.length; i++)
            sum = sum + arrey[i];
        System.out.print(sum);
        int min = arrey[0];
        for (int i = 1; i < arrey.length; i++)
            
        {

        }
            System.out.print(arrey[i] + " ");
    }
}
