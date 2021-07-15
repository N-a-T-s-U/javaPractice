package com.company;


import java.util.Scanner;
import java.util.Random;

public class Main5 {

    public static void main(String[] args) {
        // write your code here

        System.out.println("guessing game");
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        int c = Integer.parseInt(a);
        Random random = new Random();
        int rand = 0;
        while (true){ rand = random. nextInt(11);
            if(rand != 0) break; }
        if(c==rand){
            System.out.println("correct");
            System.out.println("double or nothing? type 1 for yes");
            Scanner scn = new Scanner(System.in);
            String e = scn.nextLine();
            int f = Integer.parseInt(e);
            int d = 1;
            if (d==f){
                System.out.println("type your guess now");
                Scanner sc = new Scanner(System.in);
                String g = scn.nextLine();
                int h = Integer.parseInt(g);
                Random random1 = new Random();
                int rando = 0;
                while (true){ rando = random. nextInt(11);
                    if(rand != 0) break; }
                if (h!=rando) {
                    System.out.println("wrong");
                    System.out.println("the correct answer was " + rando+"");
                if (h==rando){
                    System.out.println("correct");
                }
            }

            }
        }
        if (c != rand){
        System.out.println("wrong");
        System.out.println("the correct answer was " + rand+"");

    }}}

