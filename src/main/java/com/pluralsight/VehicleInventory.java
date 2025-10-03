package com.pluralsight;

import java.util.Scanner;

public class VehicleInventory {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Vehicle vehicle = new Vehicle();
        System.out.println("What do you want to do?");
        System.out.println("1. Search by Vehicle ID: ");
        System.out.println("2. Search by Make/Model: ");
        System.out.println("3. Search by price range: ");
        System.out.println("4. Search by color: ");
        System.out.println("5. quit");
        //to do: finish listing one by one and finish listing in format

        int choice = scanner.nextInt();
            if (choice == 1) {
                vehicle.generateId();
            } else if (choice == 2) {
                vehicle.generateModel();
            } else if (choice == 3) {
                vehicle.generatePrice();
            } else if (choice == 4) {
                vehicle.generateColor();
            } else {
                System.out.println("Quitting");
            }

            //System.out.println("1.Check all Vehicles: ");

            //System.out.println("2.Check by ID: ");

            //System.out.println("3.Check by Model: ");

            //System.out.println("4.Check by Color: ");

    }
}
