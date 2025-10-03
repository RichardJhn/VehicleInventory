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

        int choice = scanner.nextInt();

        if(choice == 1) {
            vehicle.generateId();
        }
        if(choice == 2){
            vehicle.generateModel();
        }
        if(choice == 3){
            vehicle.generatePrice();
        }
        if(choice == 4){
            vehicle.generateColor();
        }
        if(choice == 5){
            System.out.println("Quitting");
        }

        //System.out.println("1.Check all Vehicles: ");

        //System.out.println("2.Check by ID: ");

        //System.out.println("3.Check by Model: ");

        //System.out.println("4.Check by Color: ");








    }
}
