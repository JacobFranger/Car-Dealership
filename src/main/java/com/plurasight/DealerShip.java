package com.plurasight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class DealerShip {

}
public static  ArrayList<Cars>getShowroom(){
    ArrayList<Cars>Showroom = new ArrayList<Cars>();
    try{
        FileReader carInventory = new FileReader("src/main/resources/inventory.csv");
        BufferedReader bufferedReader = new BufferedReader(carInventory);
        String input;
        bufferedReader.readLine();

        while ((input = bufferedReader.readLine())!=null){
            String []description = input.split("|");
            Cars newCar = new Cars(vehicle[0], vehicle[1], vehicle[3],vehicle)
        }
    }

}
