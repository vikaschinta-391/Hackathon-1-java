package Rooftop_Solar_Energy_Monitor;

import java.util.Scanner;

public class TotalEnergyCalculator {

    // Method to calculate total energy generated
    static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading morning and evening energy values
        System.out.print("Enter morning energy generation (kWh): ");
        double morning = sc.nextDouble();

        System.out.print("Enter evening energy generation (kWh): ");
        double evening = sc.nextDouble();

        // Calling the method and displaying the result
        double total = calculateTotalEnergy(morning, evening);
        System.out.println("Total Energy Generated: " + total + " kWh");
    }
}
