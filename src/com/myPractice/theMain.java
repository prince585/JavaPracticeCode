package com.myPractice;
import java.util.Scanner;
public class theMain {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello Java");
        System.out.println("Enter length of rectangle: ");
        double length = scan.nextDouble();
        System.out.println("Enter width of rectangle: ");
        double width = scan.nextDouble();
        areaOfRectangle aor = new areaOfRectangle();
        aor.aor(length, width);
        scan.close();
    }
}
