package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

	    printArray(sortArrayASC(getArray()));

    }


    public static int[] sortArrayASC(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Sorted array: ");
        return array;
    }


    public static int[] getArray() {
        System.out.print("Enter array size: ");
        int arraySize = scanner.nextInt();
        int[] array2 = new int[arraySize];

        System.out.println("Enter " + arraySize + " integer elements: ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter element #" + (i+1) + "\n");
            array2[i] = scanner.nextInt();
        }
        return array2;

    }


    public static int[] printArray(int[] array) {

        for(int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("[" + array[i] + ", ");

            } else if (i == array.length-1) {
                System.out.println(array[i] + "]");

            } else {
                System.out.print(array[i] + ", ");
            }
        }

        return array;
    }










    // O (N * N/2) or O(N^2)
    public static void tooLoops(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > n/2; j--) {
                System.out.println("Value of i is " + i + " and j is " + j);
            }
            System.out.println(" ");
        }
    }

    // O (log N)
    public static void doubleLoop(int n) {
        for (int i = 1; i < n;) {
            System.out.println("Value of i is " + i);
            i=i*2;
        }
    }

        public static void doubleLoop2(int n) {
        for (int i = n; i > 0;) {
            System.out.println("Value of i is " + i);
            i=i/2;
        }
    }

}
