package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayWithRandomNum {
//    Scanner scanner = new Scanner(System.in);
//    int arrayLength = scanner.nextInt();
    public static void addToArray(int arrayLength){
        Random num = new Random();

        int[] randomNumbers = new int[arrayLength];
        for (int i = 0; i < randomNumbers.length ; i++){

            int numValue = num.nextInt(0,100);
            randomNumbers[i] = numValue ;
        }
        System.out.println("The array value is :" + Arrays.toString(randomNumbers));
    }
}
