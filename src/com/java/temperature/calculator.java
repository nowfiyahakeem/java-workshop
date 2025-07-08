package com.java.temperature;

public class calculator {
     public static void main (String[] args) {
        calculator calculator = new calculator();
        System.out.println("Division : " + calculator.divide(a:10,b:2));
        System.out.println("Addition : " + calculator.add(a:10, b:2));
        System.out.println("Subtraction : " + calculator.subtract(a:10, b:2));
        System.out.println("Multiplication : " + calculator.multiply(a:10, b:2));
      
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        
    } catch (ArithmeticException e) {
            System.out.println(e.getMessage())
            return 0; 
        }
        return a / b;
    }
   
 
    }
    

