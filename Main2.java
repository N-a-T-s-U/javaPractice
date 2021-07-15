package com.company;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        // write your code here

        System.out.println("money counter");
        Scanner scan = new Scanner(System.in);

        System.out.println("pennies");
        String penny = scan.nextLine();

        System.out.println("nickels");
        String nickel = scan.nextLine();

        Scanner scn = new Scanner(System.in);
        System.out.println("quarters");
        String quarter = scn.nextLine();

        Scanner sc = new Scanner(System.in);
        System.out.println("dollars");
        String dollar = sc.nextLine();

        float money = (float) ((Float.parseFloat(penny)/100)+(Float.parseFloat(nickel)/20)+(Float.parseFloat(quarter)/4)+Float.parseFloat(dollar));
        System.out.println(money);


        }
    }

