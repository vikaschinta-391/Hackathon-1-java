package Rooftop_Solar_Energy_Monitor;
//2B
import java.util.Scanner;

public class EnergyMonitor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading energy generated in kWh
        System.out.print("Enter the energy generated (in kWh): ");
        double energy = sc.nextDouble();

        // Checking energy generation using if-else
        if (energy >= 10) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }
    }
}