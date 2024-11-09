import java.util.Scanner;

/*
File Name: ExactChange.java
Author: Lanie Louque
Date: 2024-11-09
*/

public class ExactChange {
   public static void main(String[] args) {
      // Variables
      int hundreds = 0;
      int fifties = 0;
      int twenties = 0;
      int tens = 0;
      int fives = 0;
      int ones = 0;
      int quarters = 0;
      int dimes = 0;
      int nickels = 0;
      
      // Receives amount to break up
      Scanner in = new Scanner(System.in);
      System.out.print("Input the amount to broken into change (Numbers only, please): ");
      double input = in.nextDouble();
      
      // Rounds to two decimal places, if not already there
      input *= Math.pow(10, 2);
      int amount = (int)(input + 0.5);
      
      // Count hundreds
      hundreds = amount / 10000;
      amount = amount - (hundreds * 10000);
      
      // Count fifties
      fifties = amount / 5000;
      amount = amount - (fifties * 5000);
      
      // Count twenties
      twenties = amount / 2000;
      amount = amount - (twenties * 2000);
       
      // Count tens
      tens = amount / 1000;
      amount = amount - (tens * 1000);
      
      // Count fives
      fives = amount / 500;
      amount = amount - (fives * 500);
      
      // Count ones
      ones = amount / 100;
      amount = amount - (ones * 100);
      
      // Count quarters
      quarters = amount / 25;
      amount = amount - (quarters * 25);
      
      // Count dimes
      dimes = amount / 10;
      amount = amount - (dimes * 10);
      
      // Count nickels
      nickels = amount / 5;
      amount = amount - (nickels * 5);
      
      // Print change
      if (hundreds != 0) {
         System.out.println(hundreds + "- $100 bill");
      }
      if (fifties != 0) {
         System.out.println(fifties + "- $50 bill");
      }
      if (twenties != 0) {
         System.out.println(twenties + "- $20 bill");
      }
      if (tens != 0) {
         System.out.println(tens + "- $10 bill");
      }
      if (fives != 0) {
         System.out.println(fives + "- $5 bill");
      }
      if (ones != 0) {
         System.out.println(ones + "- $1 bill/coin");
      }
      if (quarters != 0) {
         System.out.println(quarters + "- Quarters");
      }
      if (dimes != 0) {
         System.out.println(dimes + "- Dimes");
      }
      if (nickels != 0) {
         System.out.println(nickels + "- Nickels");
      }
      if (amount != 0) {
         System.out.println(amount + "- Pennies");
      }
   }
}