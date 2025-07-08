package com.java.temperature.bean;

import java.time.LocalDate;
import java.util.Scanner;

public class Agecalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your year of birth:");
        int dob = scan.nextInt();
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - dob;
        System.out.println("Your age is: " + age);

        
    }
    
}
