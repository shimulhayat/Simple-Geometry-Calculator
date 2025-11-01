// ================================================
// Title: Simple Geometry Calculator
// Module: Java - Module 4
// Author: Shimul Hayat
// Date: 2nd November, 2025
// Description:
//   A console-based program to calculate the Area and Perimeter
//   of a Rectangle based on user input. The program validates
//   user input to ensure no negative values are accepted and
//   uses a single method to perform both calculations.
// ================================================

import java.util.Scanner;

public class GeometryCalculator {

    // Create a Scanner object for user input
    Scanner sc = new Scanner(System.in);

    // Declare instance variables for rectangle dimensions
    private double length;
    private double width;

    // Default constructor to initialize values
    public GeometryCalculator() {
        length = 0;
        width = 0;
    }

    // Method to read and validate user input using do-while loop
    public void validateInput() {

        // Input for Length (must be positive)
        do {
            System.out.print("Enter the length of the rectangle: ");
            length = sc.nextDouble();
            if (length <= 0) {
                System.out.println("Length cannot be negative or zero. Please try again.");
            }
        } while (length <= 0);

        // Input for Width (must be positive)
        do {
            System.out.print("Enter the width of the rectangle: ");
            width = sc.nextDouble();
            if (width <= 0) {
                System.out.println("Width cannot be negative or zero. Please try again.");
            }
        } while (width <= 0);
    }

    // Single method to calculate both Area and Perimeter based on type
    public double calculate(String type) {
        if (type.equalsIgnoreCase("area")) {
            return length * width;
        } else if (type.equalsIgnoreCase("perimeter")) {
            return 2 * (length + width);
        } else {
            System.out.println("Invalid calculation type provided!");
            return 0;
        }
    }

    // Method to display the formatted output
    public void displayResults() {
        double area = calculate("area");
        double perimeter = calculate("perimeter");

        System.out.printf("Area of Rectangle     = %.2f%n", area);
        System.out.printf("Perimeter of Rectangle = %.2f%n", perimeter);
    }

    // Main method: Entry point of the program
    public static void main(String[] args) {
        // Create object of GeometryCalculator class
        GeometryCalculator gc = new GeometryCalculator();

        // Step 1: Take and validate input
        gc.validateInput();

        // Step 2: Display results (Area & Perimeter)
        gc.displayResults();
    }
}
