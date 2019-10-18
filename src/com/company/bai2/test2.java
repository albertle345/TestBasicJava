package com.company.bai2;

public class test2 {
    public static void main(String ars[]){
        double s = 8000;
        for(int i = 1;i <= 10;i++){
            s = s + (s * 0.1);
        }
        System.out.println("sau 10 nam hoc phi " + s);
    }
}
