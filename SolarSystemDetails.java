package Rooftop_Solar_Energy_Monitor;

//2A


public class SolarSystemDetails {
    public static void main(String[] args) {
        // Declaring variables with appropriate data types
        int panelId = 101;              // Panel ID - integer
        double energyGenerated = 15.75; // Energy generated in kWh - decimal value
        int numPanels = 12;             // Number of solar panels - integer
        char systemStatus = 'A';        // System status - character (A=Active, I=Inactive)

        // Displaying all the details
        System.out.println("=== Rooftop Solar System Details ===");
        System.out.println("Panel ID: " + panelId);
        System.out.println("Energy Generated (kWh): " + energyGenerated);
        System.out.println("Number of Solar Panels: " + numPanels);
        System.out.println("System Status: " + systemStatus);
    }
}
