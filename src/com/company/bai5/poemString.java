package com.company.bai5;

import java.util.Arrays;
import java.util.Scanner;

public class poemString {
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        int N = 1000;
        String a[] = new String[N];
        input(a);
        System.out.println("nhap so ung voi cau");
        int n = read.nextInt();
        String sentence = getString(a, n);
        System.out.println(sentence);
    }
    private static void input(String a[]){
        Scanner read = new Scanner(System.in);
        int stop;
        int i = 0;
        do{

            System.out.println("nhap cau "+i+1);
            a[i] = read.nextLine();
            System.out.println("ban muon tiep tuc khong: 1 la co, 0 la khong");
            stop = read.nextInt();
            i++;
        }while (stop == 1);
    }
    private static String getString(String a[],int n){
        return a[n - 1];
    }
}
