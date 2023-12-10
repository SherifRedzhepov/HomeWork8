package org.example;

public class TriangleArea {
    public static void triangleArea(int a , int b , int c){
        if((a+b)>c && (a+c)>b && (b+c)>a) {
            int p = (a + b + c) / 2;

            double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.printf("Area of triangle is %f\n", area);
        }else {
            System.out.println("Area of triangle not exist");
        }
    }
}
