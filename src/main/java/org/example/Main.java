package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 number for sides of a triangle");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        TriangleArea.triangleArea(a, b ,c);

        System.out.println("------------------");

        Random someNUmber = new Random();
        int num1 = someNUmber.nextInt(0, 1000);
        int num2 = someNUmber.nextInt(0, 1000);
        int num3 = someNUmber.nextInt(0, 1000);


        LargestNumber.printLargestNumber(num1 , num2 ,num3);
        System.out.println("----------------");

        System.out.println("Please enter a number for array length ");
        int arrayLength = scanner.nextInt();
        ArrayWithRandomNum.addToArray(arrayLength);
    }
}