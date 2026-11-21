/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fuelefficiency;
import java.util.Scanner;

/**
 *
 * @author Marcus Wiggs
 */
public class FuelEfficiency {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Fuel Efficiency Calculator");
        System.out.println("Calculate cost per 100 miles and full-tank range.");
        System.out.print("Tank capacity in gallons (decimal allowed): ");
        double tankGallons = input.nextDouble();
        System.out.print("Fuel efficiency in MPG (decimal allowed): ");
        double milesPerGallon = input.nextDouble();
        System.out.print("Gas price per gallon in dollars (decimal allowed): ");
        double gasPrice = input.nextDouble();
        
        if (tankGallons <=0 || milesPerGallon <=0 || gasPrice <0) 
        {
            System.out.println("Error: Tank and MPG must be positive; price cannot be negative");
            input.close();
            return;
        }
        
        double costPer100Miles = (100.0 / milesPerGallon) * gasPrice;
        long fullTankMiles = Math.round(tankGallons * milesPerGallon);
        System.out.printf("Cost per 100 miles: $%.2f%n", costPer100Miles);
        System.out.printf("Full-tank range: %d miles%n", fullTankMiles);
    }
}
