package com.gmail.apismenniy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Input long");
        n = sc.nextInt();
        int s;
        System.out.println("Input heigh");
        s = sc.nextInt();
        for (int i = 1; i <= s; i++){
            for (int j = 1; j<=n; j++){
                if (j%2==0) {
                    System.out.print("+++");
                }else{
                    System.out.print("***");
                }
            }
            System.out.println();
        }
    }
}