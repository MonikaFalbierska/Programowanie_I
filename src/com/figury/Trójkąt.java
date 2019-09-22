package com.figury;

import java.sql.SQLOutput;

public class Trójkąt {
    public static void main(String[] args) {
        /*for (int i = 1; i<7; i++){
            for(int e=1; e<=i; e++)
                System.out.print('*');
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i<7; i++){
            for(int e=1; e<=i; e++)
                System.out.print(' ');
                System.out.print('*');
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i<7; i++) {
            for (int e = 1; e <= i; e++) {
                if (i == 1 || i==6 && e==1 || e==6) {
                    System.out.print("******");
                } else {
                    System.out.print('*'+"    "+'*');
                }
                System.out.println();
            }
        }*/
        System.out.println();
        for (int i = 1; i<7; i++) {
            for (int e = 1; e <= i; e++){
                if (i == e || i+e==7-1)  {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
