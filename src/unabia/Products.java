package unabia;

import java.util.Scanner;

public class Products {

    public void manageProducts() {
        Scanner sc = new Scanner(System.in);
        product[] items = new product[100];
        
        System.out.print("Enter the number of Products: ");
        int nums = sc.nextInt();
        
        double totalInventoryCost = 0.0;
        double totalRevenue = 0.0;
        double totalProfit = 0.0;

        for (int i = 0; i < nums; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");
            System.out.print("Product ID: ");
            int id = sc.nextInt();
            System.out.print("Product Name: ");
            String name = sc.next();
            System.out.print("Units Sold: ");
            int sold = sc.nextInt();
            System.out.print("Stock Available: ");
            int stock = sc.nextInt();
            System.out.print("Price per Unit: ");
            double price = sc.nextDouble();

            items[i] = new product();
            items[i].addProduct(id, name, sold, stock, price);

            totalInventoryCost += items[i].stock * items[i].price;
            totalRevenue += items[i].sold * items[i].price;
            totalProfit += items[i].sold * items[i].price - totalInventoryCost;
        }

        product.printHeader();

        for (int i = 0; i < nums; i++) {
            items[i].viewProduct();
        }

        System.out.println("\nTotal Inventory Cost: " + totalInventoryCost);
        System.out.println("Total Revenue: " + totalRevenue);
        System.out.println("Total Profit: " + totalProfit);
    }
}