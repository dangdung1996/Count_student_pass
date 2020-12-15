package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("NHập số lượng sinh viên(Max 30): ");
        int size = sc.nextInt();
        if (size > 30) System.out.println("ERROR");

        int arr[] = new int[30];
        System.out.print("NHập vào điểm của từng sinh viên(Thang điểm 10): ");
        for (int i = 0; i < size; i++) {
            do {
                arr[i] = sc.nextInt();
            }while (arr[i]>10);
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5) {
                count++;
            }
        }
        System.out.println("sô sinh viên pass module là :" + count);

    }
}
