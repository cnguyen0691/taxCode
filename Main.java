package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.next();
        System.out.println("Amount of purchase: ");
        double money = input.nextInt();
        System.out.println("Tax Code from 0 - 3:");
        System.out.println("Tax code: ");
        int tax = input.nextInt();
        double total=0.0;
        if (tax == 0){
            total = money;
        }else  if (tax==1){
            total = money + (money*0.03);
        }else  if (tax ==2){
            total = money+(money*0.05);
        }else if (tax == 3){
            total = money +(money*0.07);
        }else {
            System.out.println("Tax code not exit!!");

        }
       System.out.println(name+": " + money+","+"Sale tax: "+ tax +","+" Total: "+total);

        //Using switch
        switch (tax){
            case 0: total = money;
            break;
            case 1: total = money + (money*0.03);
            break;
            case 2: total = money+(money*0.05);
            break;
            case 3: total = money +(money*0.07);
            break;

        }
        System.out.println(name+": " + money+","+"Sale tax: "+ tax +","+" Total: "+total);

    }
}
