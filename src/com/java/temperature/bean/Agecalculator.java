package com.java.temperature.bean;

import java.time.LocalDate;
import java.util.Scanner;

public class Agecalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dateOfBirth= scan.nextInt();
        System.out.println("Enter your date of birth (YYYY-MM-DD):");-
        String dateOfBirth =  LocalDate.parse(dateOfBirth);
        int yearOfBirth = dateOfBirth.getYear();
        int currentYear = LocalDate.now().getYear();

        
    }
    
}
