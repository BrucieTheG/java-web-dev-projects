package org.launchcode.studios;

import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        int radius;
        int inputCheck = 0;
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter circle radius : ");
        radius = Input.nextInt();

        while (inputCheck == 0) {
            if (radius < 0) {
                System.out.println("Please enter a positive number\n");
                System.out.print("Enter circle radius : ");
                radius = Input.nextInt();
            } else {
                double area = (radius * radius) * Math.PI;
                System.out.println("Circle Area : " + area);
                inputCheck = 1;
            }
        }
    }
}
