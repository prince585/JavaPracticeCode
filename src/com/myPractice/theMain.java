package com.myPractice;
import java.util.Scanner;
public class theMain {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello Java");
        songLoop song = new songLoop();
        song.songL();
        scan.close();
    }
}
