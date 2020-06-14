package com.company;

import java.util.Scanner;

public class Read {
    public void readNumber(){
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int n = in.nextInt();
            System.out.print("The entered number is : " + n);
        } catch (Exception ex) {
            System.out.println("Problem with input detected");
        }
    }


    public void readNumberDouble(){
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("\n Enter the double number: ");
            double n = in.nextDouble();
            System.out.print("The entered double number is : " + n);
        } catch (Exception ex) {
            System.out.println("Problem with input detected");
        }
    }
}
