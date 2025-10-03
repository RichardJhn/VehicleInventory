package com.pluralsight;

import java.awt.*;

public class Vehicle {

    long[] vehicleID = new long[20];
    String[] makeModel = new String[20];
    String[] color = new String[20];
    int[] odometer = new int[20];
    float[] price = new float[20];

   public long[] getVehicleID(){
       return vehicleID;
   }
   public void setVehicleID(long[] vehicleID){
       this.vehicleID = vehicleID;
   }
   public String[] getMakeModel(){
       return makeModel;
   }
   public void setMakeModel(String[] makeModel){
       this.makeModel = makeModel;
   }
   public String[] getColor(){
       return color;
   }
   public void setColor(String[] color){
       this.color = color;
   }
   public int[] getOdometer(){
       return odometer;
   }
   public void setOdometer(int[] odometer){
       this.odometer = odometer;
   }
   public float[] getPrice(){
       return price;
   }
   public void setPrice(float[] price){
       this.price = price;
   }
   public void generateId(){
       for(int i = 0; i < vehicleID.length; i++){
           vehicleID[i] = (long)(Math.random() * 900000000) + 100000000;
       }
       for(long id : vehicleID){
           System.out.println("Vehicle ID: " + id);
       }
   }
   public void generateModel(){
       String[] differentModels = {"Toyota Camry", "Toyota Prius", "Toyota Tacoma", "Scion FRS", "Honda Accord", "Ford F-150", "Chevy Malibu", "BMW 3S", "Kia Soul", "Nissan Altima", "Tesla Model 3", "Telsa Truck", "Tesla ModelY", "Tesla ModelX", "Toyota Supra", "Mercedes Benz","Genesis G70", "Nissan Murano", "Mercedes GLC", "G Wagon"};
       for(int i = 0; i < makeModel.length; i++){
           int randomModel = (int)(Math.random() * makeModel.length);
           makeModel[i] = differentModels[randomModel];
       }
       for(String make : makeModel){
           System.out.println("Make/Model: " + make);
       }
   }
   public void generateColor(){
       String[] differentColors = {"red", "blue", "green", "cyan", "purple", "black", "pink", "warm pink", "orange", "yellow", "Jet Black", "Grey", "Brown", "Hot Pink", "Gold", "Dark yellow", "Dark Red", "Dark Blue", "Dark grey", "Warm Blue" };
       for(int i = 0; i < color.length; i++){
           int randomColors = (int)(Math.random() * differentColors.length);
           color[i] = differentColors[randomColors];
       }
       for(String chosenColor : color){
           System.out.println("Color: " + chosenColor);
       }
   }
   public void generateOdometer(){
       for(int i = 0; i < odometer.length; i++){
           int randomOdoMeter = (int)(Math.random() * 300000);
           odometer[i] = randomOdoMeter;
       }
       for(int finalOdometer: odometer){
           System.out.println("Odometer: " + finalOdometer);
       }

   }
   public void generatePrice(){
       for(int i= 0; i < price.length; i++){
           long randomPrice = (long)(Math.random() * 2000000);
           price[i] = randomPrice;
       }
       for(float finalPrice : price){
           System.out.printf("Price: $%s0\n",finalPrice);
       }

   }
   public void vehicleListing(){
       for(int i = 0; i < vehicleID.length; i++){
           System.out.printf("Vehicle ID:%s | Make and Model:%s | Color:%s | Odometer:%s | Price: %s", vehicleID[1], makeModel[2], color[2], odometer[2], price[2]);

       }
   }

}

    //public int getVehicleID() {
        //return this.vehicleID;
   // }
   // public void setVehicleID(int vehicleID){
        //this.vehicleID = vehicleID;
   // }
   // public String getMakeModel(){
       // return this.makeModel;
   // }
   // public void setMakeModel(String makeModel){
        //this.makeModel = makeModel;
    //}
    //public String getcolor(){
       // return this.color;
   // }
    //public void setColor(String color){
        //this.color = color;
   // }
   // public int getOdometer(){
        //return odometer;
    //}
   // public void setOdometer(){
        //this.odometer = odometer;
   // }
    //public float getPrice(){
        //return price;
    //}
    //public void setPrice(float price){
        //this.price = price;
    //}
//}
