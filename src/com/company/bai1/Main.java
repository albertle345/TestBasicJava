package com.company.bai1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner read = new Scanner(System.in);
        System.out.println("enter the number of items: ");
        int n = read.nextInt();
        if(n > 50){
            System.out.println("sale off 15%");
        }
        if(n >= 25 && n <= 50){
            System.out.println("sale off 10%");
        }
        if(n >= 11 && n <= 24){
            System.out.println("sale off 5%");
        }
        if(n >= 1 &&n <= 10){
            System.out.println("no sale off");
        }
        else{
            System.out.println("nope");
        }
    }
}
