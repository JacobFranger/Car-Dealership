package com.plurasight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Object Cars;

    public static void main(String[] args) {


        ArrayList<Cars> inventory = getCars();
        ArrayList<Cars> cart = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int selection = 0;



         while(true) {
            try {
                System.out.println("Select an option by typing the number:\n" +
                        "1.Display Products\n" +
                        "2.Display Cart\n" +
                        "3.Exit");
                selection = input.nextInt();

                switch (selection) {

                    case 1:
                        new Cars(Cars);
                        System.out.println("Select an option by typing the number:\n" +
                                "1. Add product\n" +
                                "2. Search for a product by name\n" +
                                "3. Search for products by a price range\n" +
                                "4. Search for products by their department\n" +
                                "5. Go back to the home page");
                        int selection1 = input.nextInt();
                        switch (selection1) {
                            case 1:
                                addToCart(inventory, cart);
                                break;
                            case 2:
                                searchByName(inventory);
                                break;
                            case 3:
                                searchByPriceRange(inventory);
                                break;
                            case 4:
                                searchByDepartment(inventory);
                                break;
                            case 5:
                                continue;
                            default:
                                System.out.println("Error. Invalid input.");
                                break;
                        }
                        break;

                    case 2:
                        System.out.println(displayCart(cart));
                        System.out.println("Select an option by typing the number:\n" +
                                "1.Checkout\n" +
                                "2.Remove from cart\n" +
                                "3.Go back to home screen");
                        int selection2 = input.nextInt();
                        switch (selection2) {
                            case 1:
                                checkOut(cart);
                                break;
                            case 2:
                                removeFromCart(cart);
                                break;
                            case 3:
                                continue;
                            default:
                                System.out.println("Error. Invalid input.");
                                break;
                        }

                        break;

                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("Error. Invalid input.");
                        break;

                }

            } catch (Exception e){
                System.out.println("Invalid input");
                input.nextLine();
                e.printStackTrace();
            }

    }


    System.out.println("Please enter sales information: ");
         System.out.println("Please enter vehicle information: ");
         System.out.println("Sale or Lease: ");


        try {
            FileReader carInventory = new FileReader("src/main/resources/contracts.csv");
            BufferedReader bufferedReader = new BufferedReader(carInventory);
            String input;
            bufferedReader.readLine();
        }



}


