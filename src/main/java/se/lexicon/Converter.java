package se.lexicon;

import java.util.Scanner;

import static se.lexicon.CurrencyConverter.*;

public class Converter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Currency Converter App Menu:");
            System.out.println("1. Convert SEK to USD");
            System.out.println("2. Convert USD to SEK");
            System.out.println("3. Convert SEK to Euro");
            System.out.println("4. Convert Euro to SEK");
            System.out.println("5. Exit");
            System.out.println("Enter you choice:");

            int choice = scanner.nextInt();

            double amount;

            switch (choice) {
                case 1:
                    System.out.println("Enter the amount in SEK: ");
                    if (scanner.hasNextDouble()) {
                        amount = scanner.nextDouble();
                        if (amount >= 0) {
                            convertSEKtoUSD(amount);
                        } else {
                            System.out.println("Amount cannot be negative. Please enter a positive amount.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a valid numeric amount.");
                        scanner.next();
                    }
                    break;

                case 2:
                    System.out.println("Enter the amount in USD: ");

                    if (scanner.hasNextDouble()) {
                        amount = scanner.nextDouble();
                        if (amount >= 0) {
                            convertUSDtoSEK(amount);
                        } else {
                            System.out.println("Amount cannot be negative. Please enter a positive amount.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a valid numeric amount.");
                        scanner.next();
                    }
                    break;

                case 3:
                    System.out.println("Enter the amount in SEK: ");

                    if (scanner.hasNextDouble()) {
                        amount = scanner.nextDouble();
                        if (amount >= 0) {
                            convertSEKtoEuro(amount);
                        } else {
                            System.out.println("Amount cannot be negative. Please enter a positive amount.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a valid numeric amount.");
                        scanner.next();
                    }
                    break;

                case 4:
                    System.out.println("Enter the amount in Euro: ");

                    if (scanner.hasNextDouble()) {
                        amount = scanner.nextDouble();
                        if (amount >= 0) {
                            convertEurotoSEK(amount);
                        } else {
                            System.out.println("Amount cannot be negative. Please enter a positive amount.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a valid numeric amount.");
                        scanner.next();
                    }
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
