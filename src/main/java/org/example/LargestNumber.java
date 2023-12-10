package org.example;

public class LargestNumber {
    public static void printLargestNumber(int num1,int num2 , int num3) {

        System.out.printf("%d , %d , %d.\n",num1 , num2 , num3);
        if (num1 > num2){
            System.out.println("largest number is "+ Math.max(num1 ,num3));
        }else {
            System.out.println("largest number is "+ Math.max(num2 ,num3));
        }
    }
}
