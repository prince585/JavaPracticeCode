package com.myPractice;

public class forLoop {
    public void forL() {
        char c = 'a';
        for (int i = 1; i <= 10; i+=1){
            System.out.println("Prince : " + c);
            c++;
            if (c == 'e') {
                continue;
            }
        }
    }
}