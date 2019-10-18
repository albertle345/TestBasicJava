package com.company.bai4;

import java.util.Scanner;

public class String {
    public static void main(java.lang.String args[]){
        Scanner read = new Scanner(System.in);
        System.out.println("nhap chuoi 1");
        java.lang.String firstString = read.nextLine();
        System.out.println("nhap chuoi 2");
        java.lang.String secondString = read.nextLine();
        int checkString = check(firstString,secondString);
        if (checkString == 1){
            System.out.println("Giong nhau");
        }
        else{
            if(checkString == 0){
                System.out.println("khac nhau");
            }
        }
    }
    private static int check(java.lang.String first, java.lang.String second){
        if(first.equals(second)){
            return 1;
        }
        else{
            return 0;
        }
    }
}
