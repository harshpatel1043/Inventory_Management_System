package org.java.introduction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("-----------------------");
            System.out.println("|  1 . Add Item       |");
            System.out.println("|  2. Update Item     |");
            System.out.println("| 3. Display Inventory|");
            System.out.println("|    4. Exit          |");
            System.out.println("-----------------------");
            System.out.print("| Choose an option:   |");


            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter item quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter item price: ");
                    double price = scanner.nextDouble();
                    inventory.addItem(new Item(name, quantity, price));
                    break;
                case 2:
                    System.out.print("Enter item name to update: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Enter new quantity: ");
                    int newQuantity = scanner.nextInt();
                    System.out.print("Enter new price: ");
                    double newPrice = scanner.nextDouble();
                    inventory.updateItem(updateName, newQuantity, newPrice);
                    break;
                case 3:
                    inventory.displayInventory();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
