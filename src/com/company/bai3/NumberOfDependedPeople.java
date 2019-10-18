package com.company.bai3;

import java.util.Scanner;

public class NumberOfDependedPeople {
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        int n = 0;
        int zeroDepended = 0, oneDepended = 0, twoDepended = 0, threeDepended = 0, fourDepended = 0, fiveDepended = 0;

        do{
            System.out.println("enter number of people who depended");
            n = read.nextInt();
            switch (n){
                case 0:
                    zeroDepended++;
                    break;
                case 1:
                    oneDepended++;
                    break;
                case 2:
                    twoDepended++;
                    break;
                case 3:
                    threeDepended++;
                    break;
                case 4:
                    fourDepended++;
                    break;
                case 5:
                    fiveDepended++;
                    break;
            }
        }while (n >= 0 && n <= 5);

        table(zeroDepended,oneDepended,twoDepended,threeDepended,fourDepended,fiveDepended);

    }
    private static void table(int zero, int one, int two, int three, int four, int five){
        System.out.println("0 = "+zero);
        System.out.println("1 = "+one);
        System.out.println("2 = "+two);
        System.out.println("3 = "+three);
        System.out.println("4 = "+four);
        System.out.println("5 = "+five);
    }
}
