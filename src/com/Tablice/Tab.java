package com.Tablice;

import java.util.Random;

public class Tab {
    public static void main(String[] args) {
        int[] tab = new int[10];
        for (int i = 0; i < tab.length; i++){
            int p = i++ +1;
           /* System.out.println("["+i+"]");*/
            System.out.println("[" + p+ "]");
        }
        System.out.println();
        for (int i = 0; i < tab.length; i++){
            int e = (i++) + i;
            /*System.out.println("["+e+"]");*/
        }
        Random rand = new Random();
        int k = rand.nextInt(6)+5;
        System.out.println(k);
        for (int o = tab.length-1; o >=0; o--) {
            System.out.println("[" + o + "]");
        }
        System.out.println();
        for (int i = 0; i < tab.length; i++) {
            int c = i++ + i;
            System.out.println("[" + c + "]");
        }
    }
}
