package com.myPractice;
        import java.util.Scanner;
public class leetcode {
    public void leet(int N) {
            Scanner scan = new Scanner(System.in);
            // int i = scan.nextInt();
            // double d = scan.nextDouble();
            // scan.nextLine(); // Consume the newline character left by nextDouble()52

            // String s = scan.nextLine();
            
            // // Write your code here.
    
            // System.out.println("String: " + s);
            // System.out.println("Double: " + d);
            // System.out.println("Int: " + i);
        int i = 1;
        while(i <= 10){
            System.out.println(N + " x " + i + " = " + (N*i));
            i= i +1;
        }
            scan.close();
        }
}
